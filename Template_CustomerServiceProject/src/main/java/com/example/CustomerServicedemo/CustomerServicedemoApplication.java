package com.example.CustomerServicedemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServicedemoApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CustomerCare customerCare=null;
		String department=null;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to our Customer Care application ");
		System.out.println("Please enter your name:");
		String name=s.nextLine();
		
		System.out.println("Thanks for reaching us "+name);
		System.out.println("Please select a department to connect to:\n1. Payment Department\n2. Query Department\n3. Sales Department\n0. Exit");
		
		int choice=s.nextInt();
		s.nextLine();
		if(choice>=0 && choice<4) {
			switch (choice) {
			case 1: {
				
				department="paymentDepartment";
				break;
			}
			case 2: {
				
				department="queryDepartment";
				break;
			}
			case 3: {
				
				department="salesDepartment";
				break;
			}
			default:
				System.out.println("You have exited the application");
				return;
				
			}
		}
		customerCare=department!=null?(CustomerCare) context.getBean(department):null;
		customerCare.setCustomerName(name);
		customerCare.getService();
		String issue=s.nextLine();
		customerCare.setProblem(issue);
		
		customerCare.getProblem();
		
	}
}
