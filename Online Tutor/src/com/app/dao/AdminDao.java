package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.MathsTutorBean;
import com.app.bean.RegisterBean;
import com.app.bean.StudentRegisterBean;

public class AdminDao {
	public static Connection connect() {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/onlinetutor", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

	public static int register(String sql, RegisterBean rb) {
		int i = 0;
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, rb.getName());
			ps.setString(2, rb.getEmail());
			ps.setString(3, rb.getPassword());
			ps.setString(4, rb.getMobile());
			ps.setString(5, rb.getExperience());
			ps.setString(6, rb.getSubject());
			ps.setString(7, rb.getLocation());
			i = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

	public static boolean login(String sql) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection con = connect();
		try {
			Statement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			b = rs.next();
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;

	}

	public static int studentRegister(String sql, StudentRegisterBean rb) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, rb.getName());
			ps.setString(2, rb.getEmail());
			ps.setString(3, rb.getPassword());
			ps.setString(4, rb.getMobile());
			ps.setString(5, rb.getLocation());
			ps.setString(6, rb.getCardnumber());
			ps.setString(7, rb.getCardholderName());
			ps.setString(8, rb.getCdmobile());
			ps.setString(9, rb.getYear());
			ps.setString(10, rb.getMonths());
			ps.setString(11, rb.getCvv());
			i = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public static boolean Studentlogin(String sql) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection con = connect();
		try {
			Statement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			b = rs.next();
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	public static int MathsTutor(String sql, MathsTutorBean rb) {
		int i = 0;
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, rb.getName());
			ps.setString(2, rb.getName());
			ps.setString(3, rb.getEmail());
			i = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

	public static List<String> getTutor(String sql) {
		// TODO Auto-generated method stub
		List<String> lt = new ArrayList<String>();
		Connection con = connect();
		try {
			Statement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				lt.add(rs.getString(1));
				lt.add(rs.getString(2));
				lt.add(rs.getString(4));
				lt.add(rs.getString(5));
				lt.add(rs.getString(6));
				lt.add(rs.getString(7));
			}
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lt;
	}

	public static int studentDetails(String sql, com.app.bean.StudentD rb) {
		int i = 0;
		Connection con = connect();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, rb.getID());
			ps.setString(2, rb.getStudentID());
			ps.setString(4, rb.getSubject());
			ps.setString(3, rb.getTutorID());
			ps.setString(6, rb.getAnswer());
			ps.setString(5, rb.getQuestion());
			i = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
