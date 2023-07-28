package com.dynamicJavaProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectDB {
	String dburl="jdbc:mysql://localhost:3307/studentdb2";
	String dbuser="root";
	String dbpwd="";
	String dbdriver="com.mysql.cj.jdbc.Driver";
	Connection con=null;
	
	public void loadDriver() {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("No driver !!"+e.getMessage());
		}
	}
	
	public Connection dbConnection() {
		try {
			con=DriverManager.getConnection(dburl,dbuser,dbpwd);
		} catch (Exception e) {
		System.out.println("Not connected "+e.getMessage());
			e.printStackTrace();
		}
		return con;
		
	}
	
	public String addUser(User user1) {
		String mssg="Created ";
		loadDriver();
		Connection cnx =dbConnection();
		String sql ="INSERT INTO users (Names, Email,Username,Typeuser,password) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement st=cnx.prepareStatement(sql);
			st.setString(1, user1.getName());
			st.setString(2, user1.getEmail());
			st.setString(3, user1.getUsername());
			st.setString(4, user1.getTypuser());
			st.setString(5, user1.getPswd());
			st.executeUpdate();
		} catch (SQLException e) {
			
			System.out.println("not inserted");
			e.printStackTrace();
		}
		
		return mssg;
		
	}
	

}
