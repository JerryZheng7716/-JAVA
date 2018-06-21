package com.yhs.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import other.wzbcOrg.AdminLogin;

import com.yhs.helper.*;
import com.yhs.model.*;

public class OrganizationDao {
	Connection con;
	SqlHelper sqlHelper;
	private String AdminOrgName = AdminLogin.getOrgName();

	// �����֯
	public int AddOrg(Organization org) {
		int a = 0;
		try {
			sqlHelper = new SqlHelper();
			con = sqlHelper.getConnection();
			String sql = "INSERT INTO tb_organization VALUES (?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, org.getOrgName());

			a = pstmt.executeUpdate();
			System.out.println("��֯��ӳɹ�");
			return a;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sqlHelper.clossConnection();
		}
		return a;
	}

	// �޸���֯����
	public int UpdateOrg(Organization org, String oldOrgName) {
		int a = 0;
		try {
			sqlHelper = new SqlHelper();
			con = sqlHelper.getConnection();
			String sql = "Update tb_organization set OrgName = '"
					+ org.getOrgName() + "' where OrgName = '" + oldOrgName
					+ "' ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.println(sql);
			// pstmt.setString(1, org.getOrgName());
			// pstmt.setString(2, oldOrgName);
			a = pstmt.executeUpdate();
			System.out.println("��֯�޸ĳɹ�");
			return a;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sqlHelper.clossConnection();
		}
		return a;
	}

	// ɾ����֯����
	public int DeleteOrg(Organization org) {
		int a = 0;
		try {
			sqlHelper = new SqlHelper();
			con = sqlHelper.getConnection();
			String sql = "Delete tb_organization where OrgName = ? ";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, org.getOrgName());
			a = pstmt.executeUpdate();
			System.out.println("��֯ɾ���ɹ�");
			return a;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			sqlHelper.clossConnection();
		}
		return a;
	}

	public List<Organization> list(Organization org) {
		List<Organization> listOrg = new ArrayList<Organization>();
		try {
			sqlHelper = new SqlHelper();
			con = sqlHelper.getConnection();
			String sql = "select * from tb_organization";
			if (!AdminOrgName.equals("������ѧԺ")) {
				sql = sql + " where OrgName like '" + AdminLogin.getOrgName()
						+ "'";
				if (!StringHelper.isEmpty(org.getOrgName())) {
					sql = sql + " and OrgName like '%" + org.getOrgName()
							+ "%'";
				}
			}
			else {
				if (!StringHelper.isEmpty(org.getOrgName())) {
					sql = sql + " where OrgName like '%" + org.getOrgName()
							+ "%'";
				}
			}

			// System.out.println(sql);
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			Organization org1 = null;
			while (rs.next()) {
				org1 = new Organization(rs.getString("OrgName"));
				listOrg.add(org1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlHelper.clossConnection();
		}
		return listOrg;
	}
}
