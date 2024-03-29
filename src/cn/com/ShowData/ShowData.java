package cn.com.ShowData;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.table.DefaultTableModel;



/*
 * ShowData.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class ShowData extends javax.swing.JFrame {

	/** Creates new form ShowData */
	public ShowData() {

		initComponents();
		// my define
		//tableHandle = new CTableHandleServiceImpl(jTable1);
		//ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//SessionFactory facSession=(SessionFactory) ac.getBean("sessionFactory");
		//handleService = (IHandleService) ac.getBean("handleService");

		dealWithDataBase = new DealWithDataBase();

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel8 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton3 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel9 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jDataBaseStr = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Dtu Query database application");

		jPanel1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("DataBaseConfigure"));

		jLabel1.setText("DataBaseName");

		jTextField1.setText("127.0.0.1:3306/dscsystem");

		jLabel3.setText("user");

		jTextField3.setText("root");

		jLabel4.setText("password");

		jButton1.setText("\u8fde\u63a5\u6570\u636e\u5e93");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jPasswordField1.setText("123456");

		jLabel8.setForeground(new java.awt.Color(255, 51, 51));
		jLabel8.setText("\u6ce8\u610f:\u8fde\u63a5\u8fdc\u7a0b\u683c\u5f0f127.0.0.1:3306/dscsystem");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel8))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(32,
																				32,
																				32)
																		.addComponent(
																				jLabel1)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				183,
																				Short.MAX_VALUE)))
										.addGap(18, 18, 18)
										.addComponent(jLabel3)
										.addGap(18, 18, 18)
										.addComponent(
												jTextField3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												89,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel4)
										.addGap(18, 18, 18)
										.addComponent(
												jPasswordField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												153,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(25, 25, 25)
										.addComponent(jButton1)
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(jButton1)
														.addComponent(jLabel4)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel8)));

		jPanel2.setBorder(javax.swing.BorderFactory
				.createTitledBorder("SearchCondition"));

		jLabel5.setText("ID");

		jLabel6.setText("Time");

		jLabel7.setText("Content");

		jButton2.setText("Search");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(25, 25, 25)
										.addComponent(jLabel5)
										.addGap(72, 72, 72)
										.addComponent(
												jTextField5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												89,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(27, 27, 27)
										.addComponent(jLabel6)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jTextField6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												232,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jLabel7)
										.addGap(18, 18, 18)
										.addComponent(
												jTextField7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												157,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(14, 14, 14)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jLabel5)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))));

		jButton3.setText("\u663e\u793a\u6570\u636e");
		jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {}, new String[] { "ID", "Time", "Content" }));
		jScrollPane1.setViewportView(jTable1);

		jLabel9.setText("\u8868\u540d");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "" }));
		jComboBox1
				.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
					public void popupMenuCanceled(
							javax.swing.event.PopupMenuEvent evt) {
					}

					public void popupMenuWillBecomeInvisible(
							javax.swing.event.PopupMenuEvent evt) {
					}

					public void popupMenuWillBecomeVisible(
							javax.swing.event.PopupMenuEvent evt) {
						jComboBox1PopupMenuWillBecomeVisible(evt);
					}
				});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																817,
																Short.MAX_VALUE)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(55,
																				55,
																				55)
																		.addComponent(
																				jLabel9)
																		.addGap(28,
																				28,
																				28)
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				178,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(102,
																				102,
																				102)
																		.addComponent(
																				jButton3)))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton3))));

		jDataBaseStr.setText("\u5c1a\u672a\u8fde\u63a5\u6570\u636e\u5e93");

		jLabel2.setForeground(new java.awt.Color(255, 51, 51));
		jLabel2.setText("\u7248\u6743\u6240\u6709(C) \u676d\u5dde\u8bfa\u6717\u79d1\u6280\u6709\u9650\u516c\u53f8");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanel3,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jPanel2,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jDataBaseStr)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		551,
																		Short.MAX_VALUE)
																.addComponent(
																		jLabel2)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel3,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jDataBaseStr,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														25, Short.MAX_VALUE)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														15,
														javax.swing.GroupLayout.PREFERRED_SIZE))));

		jDataBaseStr.getAccessibleContext().setAccessibleName("DatabaseStr");

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jComboBox1PopupMenuWillBecomeVisible(
			javax.swing.event.PopupMenuEvent evt) {
		// TODO add your handling code here:
		Object oriTemp=jComboBox1.getSelectedItem();
		dealWithDataBase.addDtuToCombox(jComboBox1);
		jComboBox1.setSelectedItem(oriTemp);
		
//		Object obj[]=jComboBox1.getSelectedObjects();
//		for(int i=0;i<obj.length;i++)
//		{
//			if(obj[i]==oriTemp)
//			{
//				jComboBox1.setSelectedItem(oriTemp);
//			}
//		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		//		handleService.showTableCondition(jTable1, jTextField5.getText(),
		//				jTextField6.getText(), jTextField7.getText());
		dealWithDataBase.findCondition(jTable1, jComboBox1.getSelectedItem()
				.toString(), jTextField5.getText(), jTextField6.getText(),
				jTextField7.getText());

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		if (jTextField1.getText().equals("")
				&& jTextField3.getText().equals("")
				&& new String(jPasswordField1.getPassword()).equals("")) {
			//			if (true == handleService.testConnection()) {
			//				JOptionPane.showMessageDialog(null,
			//						"default connection success��");
			//				this.jDataBaseStr
			//						.setText("default database connection success��");
			//				return;
			//			}
			JOptionPane.showMessageDialog(null,
					"please enter the database ,userid,pasword");
			this.jDataBaseStr
					.setText("please enter the database ,userid,pasword��");
			return;
		}
		if (true == dealWithDataBase.testConnection(jTextField1.getText(),
				jTextField3.getText(),
				new String(jPasswordField1.getPassword()))) {
			JOptionPane.showMessageDialog(null,
					"database " + this.jTextField1.getText()
							+ "  connection success��");
			this.jDataBaseStr.setText("database " + this.jTextField1.getText()
					+ "  connection success��");
		} else {
			JOptionPane.showMessageDialog(null,
					"database " + this.jTextField1.getText()
							+ "  connection failed��");
			this.jDataBaseStr.setText("database " + this.jTextField1.getText()
					+ "  connection failed��");
		}
		//if (-1 == jComboBox1.getSelectedIndex()) {
		dealWithDataBase.addDtuToCombox(jComboBox1);
		//	jComboBox1.setSelectedIndex(-1);
		//}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		// my define

		//tableHandle.showAllDatas();

		if (jTextField1.getText().equals("")
				&& jTextField3.getText().equals("")
				&& new String(jPasswordField1.getPassword()).equals("")
				&& jComboBox1.getSelectedItem().toString().equals("")) {
			//			if (true == handleService.testConnection()) {
			//				JOptionPane.showMessageDialog(null,
			//						"default connection success��");
			//				this.jDataBaseStr
			//						.setText("default database connection success��");
			//				return;
			//			}
			JOptionPane.showMessageDialog(null,
					"please enter the database ,userid,pasword");
			this.jDataBaseStr
					.setText("please enter the database ,userid,pasword��");
			return;
		}
		if (true == dealWithDataBase.testConnection(jTextField1.getText(),
				jTextField3.getText(),
				new String(jPasswordField1.getPassword()))) {
			//			JOptionPane.showMessageDialog(null,
			//					"database " + this.jTextField1.getText()
			//							+ "  connection success��");
			this.jDataBaseStr.setText("database " + this.jTextField1.getText()
					+ "  connection success��");
			if (null == jComboBox1.getSelectedItem()) {
				dealWithDataBase.showDtuData(jTable1, null);
				return;
			}
			dealWithDataBase.showDtuData(jTable1, jComboBox1.getSelectedItem()
					.toString());
			//handleService.showTableAllData(jTable1);
		} else {
			JOptionPane.showMessageDialog(null,
					"database " + this.jTextField1.getText()
							+ "  connection failed��");
			this.jDataBaseStr.setText("database " + this.jTextField1.getText()
					+ "  connection failed��");
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ShowData().setVisible(true);
			}
		});
	}

	private DealWithDataBase dealWithDataBase = null;
	//my define
	//private ApplicationContext ac;
//	private IHandleService handleService;
	//private ITableHandleService tableHandle = null;
	private String[] column = new String[] { "ID", "Time", "Content" };
	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jDataBaseStr;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	// End of variables declaration//GEN-END:variables

}