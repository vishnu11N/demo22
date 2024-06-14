package com.Linkedin.view;
import java.util.*;

import com.Linkedin.Controller.LinkedinController;
import com.Linkedin.Controller.LinkedinControllerInterface;
public class Linkedinview {
	
	public static void main(String[] args) {
		
	 System.out.println("**********MAIN MENU***********");
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("please enter the choice you want to operate");
	 System.out.println("please press 1 to create profile");
	 System.out.println("please press 2 to view profile");
	 System.out.println("please press 3 to login");
	 int choice;
	 choice = sc.nextInt();
	 
	 LinkedinControllerInterface lv = new LinkedinController(); 
	 switch(choice)
	 {
	 case 1 : lv.createProfile();
		 break;
	default: 
		System.out.println("Enter correct choice");
	 }

	
	}

}
