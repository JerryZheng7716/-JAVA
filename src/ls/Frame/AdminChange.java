package ls.Frame;

import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.NEW;

import other.wzbcOrg.Adapte_SHA1;
import other.wzbcOrg.AdminLogin;
import other.wzbcOrg.OpenSituation;
import other.wzbcOrg.SHA1;
import other.wzbcOrg.SqlFunction;

/*
 * AdminChange.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class AdminChange extends javax.swing.JInternalFrame {

	/** Creates new form AdminChange */
	public AdminChange() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jPasswordField2 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();

		setTitle("\u4fee\u6539\u5f53\u524d\u7528\u6237\u540d\u6216\u5bc6\u7801");
		addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
			public void internalFrameActivated(
					javax.swing.event.InternalFrameEvent evt) {
			}

			public void internalFrameClosed(
					javax.swing.event.InternalFrameEvent evt) {
				formInternalFrameClosed(evt);
			}

			public void internalFrameClosing(
					javax.swing.event.InternalFrameEvent evt) {
			}

			public void internalFrameDeactivated(
					javax.swing.event.InternalFrameEvent evt) {
			}

			public void internalFrameDeiconified(
					javax.swing.event.InternalFrameEvent evt) {
			}

			public void internalFrameIconified(
					javax.swing.event.InternalFrameEvent evt) {
			}

			public void internalFrameOpened(
					javax.swing.event.InternalFrameEvent evt) {
				formInternalFrameOpened(evt);
			}
		});

		jLabel1.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jLabel2.setText("\u65b0\u7528\u6237\u540d\uff1a");

		jLabel3.setText("\u5f53\u524d\u7528\u6237\u540d\uff1a");

		jLabel4.setText("\u65b0\u5bc6\u7801\uff1a");

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/ico/checkmark.png"))); // NOI18N
		jButton1.setText("\u786e\u8ba4\u4fee\u6539");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel5.setText("0000");
		jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								org.jdesktop.layout.GroupLayout.TRAILING,
								layout
										.createSequentialGroup()
										.add(56, 56, 56)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																org.jdesktop.layout.GroupLayout.TRAILING,
																layout
																		.createSequentialGroup()
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.TRAILING)
																						.add(
																								layout
																										.createSequentialGroup()
																										.add(
																												31,
																												31,
																												31)
																										.add(
																												jLabel4,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																												0,
																												Short.MAX_VALUE))
																						.add(
																								org.jdesktop.layout.GroupLayout.LEADING,
																								layout
																										.createSequentialGroup()
																										.add(
																												16,
																												16,
																												16)
																										.add(
																												jLabel1,
																												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE))
																						.add(
																								org.jdesktop.layout.GroupLayout.LEADING,
																								layout
																										.createSequentialGroup()
																										.add(
																												layout
																														.createParallelGroup(
																																org.jdesktop.layout.GroupLayout.TRAILING)
																														.add(
																																jLabel3)
																														.add(
																																jLabel2))
																										.add(
																												1,
																												1,
																												1)))
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								jLabel5,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								67,
																								Short.MAX_VALUE)
																						.add(
																								jPasswordField2,
																								0,
																								0,
																								Short.MAX_VALUE)
																						.add(
																								jTextField2,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								67,
																								Short.MAX_VALUE)
																						.add(
																								jPasswordField1,
																								0,
																								0,
																								Short.MAX_VALUE)))
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				42,
																				42,
																				42)
																		.add(
																				jButton1)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)))
										.add(46, 46, 46)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								layout
										.createSequentialGroup()
										.add(43, 43, 43)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(
																jLabel3,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																20,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jLabel5))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING,
																false)
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				6,
																				6,
																				6)
																		.add(
																				jLabel2,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				20,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(
																jTextField2,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING,
																false)
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				4,
																				4,
																				4)
																		.add(
																				jLabel4,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				20,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(
																jPasswordField1,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING,
																false)
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				4,
																				4,
																				4)
																		.add(
																				jLabel1,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				20,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(
																jPasswordField2,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.add(26, 26, 26)
										.add(jButton1)
										.addContainerGap(
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		SqlFunction sqlFunction = new SqlFunction();
		String adminName, adminPassword, adminOldName;
		adminOldName = jLabel5.getText();
		adminName = jTextField2.getText();
		if (jTextField2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "用户名不能为空！");
			return;
		}
		if (jPasswordField1.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		String sqlLanguage1 = "SELECT * FROM tb_admin where AdminName=?";
		String[] psString1 = { adminName };
		try {
			if (sqlFunction.doSqlSelect(sqlLanguage1, psString1, false).next()
					&& !adminName.equals(adminOldName)) {
				JOptionPane.showMessageDialog(null, "已经存在当前用户名！");
			} else {
				if (jPasswordField1.getText().equals(jPasswordField2.getText())) {
//					Base64 base64=new Base64();
//			        adminPassword = base64.encode(jPasswordField1.getText());
			        SHA1 sha1=new SHA1();
			        Adapte_SHA1 adapte_new = new Adapte_SHA1(sha1);
			        adminPassword = adapte_new.encode(jPasswordField1.getText());
					
					
//					adminPassword = SHA1.encode(jPasswordField1.getText());
					String sqlLanguage = "UPDATE tb_admin SET AdminName=?,AdminPassword=? where AdminName=?";
					System.out.println();
					String[] psString = { adminName, adminPassword,
							adminOldName };
					int x = sqlFunction.doSqlUpdate(sqlLanguage, psString);
					if (x > 0) {
						JOptionPane.showMessageDialog(null, "修改成功！");
						AdminLogin.setAdminName(adminName);
						jLabel5.setText(adminName);
					} else {
						JOptionPane.showMessageDialog(null, "修改失败！");
					}
				} else {
					JOptionPane.showMessageDialog(null, "两次密码输入不一致!!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void formInternalFrameClosed(
			javax.swing.event.InternalFrameEvent evt) {
		OpenSituation.setOpenAdminChange(false);
	}

	private void formInternalFrameOpened(
			javax.swing.event.InternalFrameEvent evt) {
		OpenSituation.setOpenAdminChange(true);
		jLabel5.setText(AdminLogin.getAdminName());
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}