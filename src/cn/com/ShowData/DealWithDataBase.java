package cn.com.ShowData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import cn.com.domain.DtuData;

public class DealWithDataBase {
	private String myurl=null;
	private String user=null;
	private String pwd=null;
	Connection conn=null;
	public DealWithDataBase()
	{
		try {
			Class.forName ("com.mysql.jdbc.Driver").newInstance();
	       
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean testConnection(String url, String user, String pwd)
	{
		if(url.equals("")||user.equals("")||pwd.equals(""))
			return false;
		
		String myurl;
		if(false==url.contains(":"))
			 myurl="jdbc:mysql://localhost:3306/"+url+"?useUnicode=true&characterEncoding=gbk";		
		else		
			myurl="jdbc:mysql://"+url+"?useUnicode=true&characterEncoding=gbk";	
		this.myurl=myurl;
		this.user=user;
		this.pwd=pwd;
		conn=null;
		 try {
			conn = DriverManager.getConnection (myurl, user, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(null==conn)
		 {
			 return false;
		 }
		 else
		 {
			 return true;
		 }
	}
	
	public void addDtuToCombox(JComboBox combox)
	{
		conn=null;
        combox.removeAllItems();
		 try {
			 if(null==myurl||null==user||null==pwd)
				 return;
			conn = DriverManager.getConnection (myurl, user, pwd);
			if(null==conn)
				return ;
			ResultSet rset;
			PreparedStatement pstmt;
            pstmt = conn.prepareStatement("select * from dsc");
            rset=pstmt.executeQuery();

            while (rset.next()){
            	String str=rset.getString(1);       	
                combox.addItem(str);   
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String dealWithIfXml(String content) {
		// TODO Auto-generated method stub
		String showdata="";
	//	Map map = new LinkedHashMap();
		Document doc = null;
		boolean IsXmlFile=false;
		try {
			doc = DocumentHelper.parseText(content);
			 // 获取根节点
			Element rootElt = doc.getRootElement(); 
//			if(null!=rootElt.getData()&&!rootElt.getData().toString().equals(""))
//			{
//				showdata+=rootElt.getName().toString()+" = "+rootElt.getData().toString()+"  ";
//			}
	        Iterator ite=rootElt.elementIterator();
	        while(ite.hasNext())
	        {
	       	 Element data=(Element)ite.next();
	       	 String key=data.getName().toString();
	       	 String value=data.getData().toString();
//		      System.out.println(key);
//		      System.out.println(value);
	       	// map.put(key, value);
	       	 showdata+=key+" = "+value+"  ";   
	       	 IsXmlFile=true;
	        } 
		}catch (DocumentException e) {
			IsXmlFile=false;
			//JOptionPane.showMessageDialog(null,"这个不是XML文件,显示所有数据");
			e.printStackTrace();
			
		} 
		finally
		{
			if(true==IsXmlFile)
				return showdata;
			else
				return content;
		}

	}
	public void clear(JTable jTable) {
		// TODO Auto-generated method stub
		DefaultTableModel tableModel=(DefaultTableModel)jTable.getModel();
		int rows=tableModel.getRowCount();
		if(rows!=0)
		{
			for(int i=0;i<rows;i++)
			{
				tableModel.removeRow(0);
			}
		}
	}
	public void showDtuData(JTable jTable,String tableName)
	{
		conn=null;
		ResultSet rset = null;
		PreparedStatement pstmt=null;
		clear(jTable);
		if(null==tableName||tableName.equals(""))
			return ;
		try {
			 if(null==myurl||null==user||null==pwd)
				 return;
			conn = DriverManager.getConnection (myurl, user, pwd);
			if(null==conn)
			{
				return;
			}
			String table="tb_"+tableName;
		    pstmt = conn.prepareStatement("select * from "+table);
		    rset=pstmt.executeQuery();	
			DefaultTableModel tableModel=(DefaultTableModel)jTable.getModel();
			while (rset.next())
			 {
				 String id=""+rset.getInt(1);
				 
//				Timestamp ts= rset.getTimestamp(2);
				 
				
				 DateFormat  df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				 
				// String tsStr=df.format(ts);
				 
				 Time time=rset.getTime(2);
				 String timeStr=df.format(time);
				 
				 String content=rset.getString(3);
				 String xmlPar=dealWithIfXml(content);
				 String []data={id,timeStr,xmlPar};
				 tableModel.addRow(data);
			 }
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			finally
			{
				try {
					if(null!=conn)
						conn.close();
					if(null!=rset)
						rset.close();
					if(null!=pstmt)
						pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
	
	public void findCondition(JTable jTable,String tableName,String id, String time, String content)
	{
		// TODO Auto-generated method stub
		String searchSql="";
		boolean flag=false;
		if(!id.equals(""))
		{
			searchSql+="id = '"+id+"'";
			flag=true;
		}
		if(!time.equals(""))
		{
			if(true==flag)
			{
				searchSql+=" and ";
			}
			searchSql+="time like '%"+time+"%'";
			flag=true;
		}
		if(!content.equals(""))
		{
			if(true==flag)
			{
				searchSql+=" and ";
			}
			searchSql+="content like '%"+content+"%'";
			flag=true;
		}
		clear(jTable);
		 if(null==myurl||null==user||null==pwd)
			 return;
		conn=null;
		ResultSet rset = null;
		PreparedStatement pstmt=null;
		try {
			conn = DriverManager.getConnection (myurl, user, pwd);
			if(conn==null)
				return;
			String table="tb_"+tableName;
			String sql="select * from "+table+"  where "+searchSql;
		    pstmt = conn.prepareStatement(sql);
		    rset=pstmt.executeQuery();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DefaultTableModel tableModel=(DefaultTableModel)jTable.getModel();
		
		 try {
			while (rset.next())
			 {
				 String idData=""+rset.getInt(1);
				 
				 Date timeData=rset.getDate(2);
				 DateFormat  df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				 String dateStr=df.format(timeData);
				 
				 String contentData=rset.getString(3);
				 String xmlPar=dealWithIfXml(contentData);
				 String []data={idData,dateStr,xmlPar};
				 tableModel.addRow(data);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(null!=conn)
					conn.close();
				if(null!=rset)
					rset.close();
				if(null!=pstmt)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
