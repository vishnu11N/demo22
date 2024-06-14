package com.Linkedin.Service;

import com.Linkedin.DAO.LinkedinDAO;
import com.Linkedin.DAO.LinkedinDAOInterface;

import linkedinentity.Entity;

public class LinkedinService implements LinkedinServiceInterface {
	@Override
	public int createprofileService(Entity e1) {
		
		LinkedinDAOInterface ld = new LinkedinDAO();
		int i =ld.createprofileDAO(e1);
		
		
		//System.out.println("Hey this is Service layer "+e1.getName()+" "+e1.getPassword()+" "+e1.getEmail()+" "+e1.getLocation());
		return i;
	}
	
	

}
