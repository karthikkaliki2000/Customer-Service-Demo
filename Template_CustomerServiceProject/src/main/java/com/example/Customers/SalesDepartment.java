package com.example.Customers;

/*
     This class is an implementation of a CustomerCare Interface based on the selection 
     in the console the department type is selected.You need to complete this class 
     based on the following tasks.

     Tasks:
       1. Override the methods of CustomerCare Interface:
       2. Build your logic for all the method based on the description given in CustomerCare Interface.
 */
public class SalesDepartment implements CustomerCare {

	private String department = "Sales Department";
	private String customerName;
	private String issue;
	private double refId;
	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return department;
	}
	@Override
	public void getService() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to "+this.department+this.customerName+".");
		System.out.println("How may i assist you with your sales inquiry?");
		
	}
	@Override
	public void setCustomerName(String name) {
		// TODO Auto-generated method stub
		this.customerName=name;
		
	}
	@Override
	public void setProblem(String problem) {
		// TODO Auto-generated method stub
		this.issue=problem;
		
	}
	@Override
	public void getProblem() {
		// TODO Auto-generated method stub
		this.refId=Math.random()*(1000-1+1)+1;
		this.refId=Math.round(refId);
		System.out.println("Dear "+customerName+" your  issue for "+issue+" has been recorded, your reference id is:"+refId);
	} 

}
