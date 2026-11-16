package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPreparedStmt {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		String url="jdbc:mysql://localhost:3306/my_db";
		String user="root";
		String pass="Vishwa@1107";
		
		String query="insert into stu values(?,?,?,?)";
		
		try {
			
			Connection conn=DriverManager.getConnection(url, user, pass);
			
			PreparedStatement ps=conn.prepareStatement(query);
			
			System.out.println("Enter Id : ");
			int id=s.nextInt();
			
			System.out.println("Enter Name : ");
			String name=s.next();
			
			s.nextLine();
			
			System.out.println("Enter Marks : ");
			int marks=s.nextInt();
			
			System.out.println("Enter Age : ");
			int age=s.nextInt();
			
			ps.setInt(1, id);
			
			ps.setString(2, name);
			
			ps.setInt(3, marks);
			
			ps.setInt(4, age);
			
			int rows = ps.executeUpdate();
			System.out.println(rows + " row(s) inserted successfully!");
		
			
			conn.close();
			ps.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
