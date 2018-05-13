package ls.Frame;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import other.wzbcOrg.OtherFunction;
import other.wzbcOrg.SqlFunction;
import other.wzbcOrg.StringUtil;
import other.wzbcOrg.AdminLogin;
import java.sql.*;

;

/*
 * LoginFrame.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 * 
 * @author __USER__
 */
public class LoginFrame extends javax.swing.JFrame {
	String OrgName;
	StringUtil stringUtil = new StringUtil();
	Main Main;
	private SqlFunction sqlFunction;
	private String AdminLevel;
	private String AdminOrgCount;

	/** Creates new form LoginFrame */
	public LoginFrame() {
		initComponents();
		final JLabel jLabel2 = new JLabel();
		//
		jDesktopPane1.addComponentListener(new ComponentAdapter() {
			public void componentResized(final ComponentEvent e) {
				Dimension size = e.getComponent().getSize();
				jLabel2.setBounds(0, 0, size.width, size.height);
				// jLabel2.setSize(e.getComponent().getSize());
				jLabel2.setText("<html><img width=" + size.width + " height="
						+ size.height + " src='"
						+ this.getClass().getResource("/images/LoginForm.jpg")
						+ "'></html>");
				// jDesktopPane1.add(jLabel2, new Integer(Integer.MIN_VALUE));
			}
		});
		// 项目初始化时调用
		// JLabel jLabel2 = new JLabel();
		jLabel2.setBounds(0, 0, 980, 680);
		jLabel2.setText("<html><img width=" + 980 + " height=" + 680 + " src='"
				+ this.getClass().getResource("/images/LoginForm.jpg")
				+ "'></html>");
		jDesktopPane1.add(jLabel2, new Integer(Integer.MIN_VALUE));
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jDesktopPane1 = new javax.swing.JDesktopPane();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u7ba1\u7406\u5458\u767b\u5f55");
		jLabel1.setBounds(430, 220, 120, 40);
		jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u5bc6\u3000\u7801\uff1a");
		jLabel2.setBounds(410, 320, 60, 40);
		jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u7528\u6237\u540d\uff1a");
		jLabel3.setBounds(410, 260, 60, 40);
		jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jTextField1.setBounds(410, 290, 170, 30);
		jDesktopPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jPasswordField1.setBounds(410, 350, 170, 30);
		jDesktopPane1.add(jPasswordField1,
				javax.swing.JLayeredPane.DEFAULT_LAYER);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/loginButton.jpg"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jButton1.setBounds(410, 410, 170, 30);
		jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	// GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		sqlFunction = new SqlFunction();
		String sql = "select AdminLevel,OrgName from tb_admin where adminName=?";
		String sql1 = "EXEC proc_SelectCountPerson ?";
		String AdminName = this.jTextField1.getText();
		String[] psString = { AdminName };

		String AdminPassWord = this.jPasswordField1.getText();
		ResultSet resultSet = sqlFunction.doSqlSelect(sql, psString, false);
		try {
			while (resultSet.next()) {
				AdminLevel = resultSet.getString(1);
				OrgName = resultSet.getString(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] psString1 = { OrgName };

		ResultSet resultSet1 = sqlFunction.doSqlSelect(sql1, psString1, false);
		try {
			while (resultSet1.next()) {
				System.out.println(psString1[0] + "45454545");
				AdminOrgCount = resultSet1.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		OtherFunction otherFunction = new OtherFunction();

		System.out.println(AdminName + AdminPassWord);
		if (otherFunction.Login(AdminName, AdminPassWord).equals("Success")) {
			int x = JOptionPane.showConfirmDialog(null,
					"登陆成功,是否打开商学院学生组织人事系统？", "登陆成功", JOptionPane.YES_NO_OPTION);
			if (x == 0) {

				AdminLogin.setAdminName(AdminName);
				AdminLogin.setAdminPassword(AdminPassWord);
				AdminLogin.setAdminLevel(AdminLevel);
				AdminLogin.setOrgName(OrgName);
				AdminLogin.setAdminOrgCount(AdminOrgCount);
				Main = new Main();
				Main.setVisible(true);
				this.dispose();
			} else {
				return;
			}
		} else {
			return;
		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginFrame().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JDesktopPane jDesktopPane1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}