package com.codegnan.oopexamples;

public class Main_02 {

	public static void main(String[] args) {
		Employee_01 emp1=new Employee_01(01,"Ramu",500000);
		emp1.displayEmployeeInfo();
		emp1.setEmployeeid(2);
		emp1.setname("Raju");
		emp1.setSalary(400000);
		System.out.println("-------------------");
		System.out.println("Updated Employee id : "+emp1.getemployeeid());
		System.out.println("Updated Employee Name : "+emp1.getname());
		System.out.println("Updated Employeee Salary: "+emp1.getsalary());
	}
}
