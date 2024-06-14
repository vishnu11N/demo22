package com.Linkedin.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import linkedinentity.Entity;

public class LinkedinDAO implements LinkedinDAOInterface {

	@Override
	public int createprofileDAO(Entity e1) {
		// TODO Auto-generated method stub
		int i =0;
		System.out.println("Hey this is DAO layer "+" "+e1.getName()+" "+e1.getPassword()+" "+e1.getEmail()+" "+e1.getLocation());
		try {
			//step 1 load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nakka","root","root");
			
			//step 3 generate query
			PreparedStatement ps=con.prepareStatement("insert into linkedin values(?,?,?,?)");
			ps.setString(1, e1.getName());
			ps.setString(2, e1.getPassword());
			ps.setString(3, e1.getEmail());
			ps.setString(4, e1.getLocation());
			
			//step 4 execute query
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

}
