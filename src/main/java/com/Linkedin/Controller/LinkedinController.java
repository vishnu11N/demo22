package com.Linkedin.Controller;
import java.util.*;

import com.Linkedin.Service.LinkedinService;
import com.Linkedin.Service.LinkedinServiceInterface;

import linkedinentity.Entity;

public class LinkedinController implements LinkedinControllerInterface {
	public void createProfile()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey enter the name");
		String name = sc.next();
		System.out.println("Hey enter the password");
		String password = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter location");
		String location = sc.next();
		
		Entity e1 = new Entity();
		e1.setName(name);
		e1.setPassword(password);
		e1.setEmail(email);
		e1.setLocation(location);
		
		LinkedinServiceInterface ls = new LinkedinService();
		
		int i = ls.createprofileService(e1);
		
		if(i>0)
		{
			System.out.println("REGISTRATION SUCESSFULL");
		}
		else
		{
			System.out.println("Registration not done");
		}
		
	}
	

}
