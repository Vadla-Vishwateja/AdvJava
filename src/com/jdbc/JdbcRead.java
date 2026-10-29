package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcRead {
	public static void main(String[] args) {	
		String url="jdbc:mysql://localhost:3306/my_db";
		String user="root";
		String pass="Vishwa@1107";
		
		String query="select * from stu;";
		
		try {
			
			Connection conn=DriverManager.getConnection(url, user, pass);
			
			Statement st=conn.createStatement();
			
	        ResultSet rs=st.executeQuery(query);
			
	        System.out.println("Id   Name  Marks  Age ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"   "+
								   rs.getString(2)+"   "+
								   rs.getInt(3)+"   "+
								   rs.getInt(4));
			}
			conn.close();
			st.close();
			rs.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
