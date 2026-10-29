package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDelete {

	public static void main(String[] args) {
		
		
		String url="jdbc:mysql://localhost:3306/my_db";
		String user="root";
		String pass="Vishwa@1107";
		
		String query="Delete from stu where roll_no=102";
		
		try {
			
			Connection conn=DriverManager.getConnection(url, user, pass);
			
			Statement st=conn.createStatement();
			
			int a=st.executeUpdate(query);
			
			System.out.println(a+" row  deleted");
			
			conn.close();
			st.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
