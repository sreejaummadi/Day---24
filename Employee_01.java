package com.codegnan.oopexamples;

public class Employee_01 {
	private int employeeid;
	private String name;
	private double salary;
	public Employee_01(int employeeid, String name, double salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.salary = salary;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid=employeeid;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}
	}
	public int getemployeeid() {
		return employeeid;
	}
	public String getname() {
		return name;
	}
	public double getsalary() {
		return salary;
	}
	public void displayEmployeeInfo() {
		System.out.println("Employeeid "+employeeid);
		System.out.println("Employee Name "+name);
		System.out.println("Employee Salary "+salary);
		
	}

}
