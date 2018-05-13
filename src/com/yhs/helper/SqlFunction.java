package com.yhs.helper;

import java.sql.*;

public class SqlFunction {
	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String link = "jdbc:sqlserver://localhost:1433;DatabaseName=WZBCORG";
	String userName = "sa";
	String passWord = "123456";
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	boolean b = true;
	int x = 0;
	ResultSet resultSet = null;

	public ResultSet doSqlSelect(String sql, String[] psString, boolean isLike) {
		try {
			Class.forName(driver);
			System.out.println("�ɹ���������");
			connection = DriverManager.getConnection(link, userName, passWord);
			System.out.println("�ɹ��������ݿ�");
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < psString.length; i++) {
				if (isLike) {
					preparedStatement.setString(i + 1, "%" + psString[i] + "%");
				} else {
					preparedStatement.setString(i + 1, psString[i]);
				}

			}
			// System.out.println(sql);
			resultSet = preparedStatement.executeQuery();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	public int doSqlUpdate(String sql, String[] psString) {
		try {
			Class.forName(driver);
			System.out.println("�ɹ���������");
			connection = DriverManager.getConnection(link, userName, passWord);
			System.out.println("�ɹ��������ݿ�");
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < psString.length; i++) {
				preparedStatement.setString(i + 1, psString[i]);
			}
			x = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeAllLink();
		return x;
	}

	public void closeAllLink() {
		try {
			if (connection != null) {
				connection.close();
			}
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
