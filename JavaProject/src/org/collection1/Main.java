package org.collection1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService e1=new EmployeeService();
		System.out.println("Get Employee:\n"+e1.getEmployee(156507, "pavan kumar"));
		System.out.println("Get All Employees\n"+e1.getEmployees(80000.0));
		System.out.println("Get Max Salary:\n"+e1.getMaxSalary());
		System.out.println("Sum of all salaries:  "+e1.getSumOfSalary());
		System.out.println("Names of employees work in pune:\n"+e1.getNames("Pune"));
		System.out.println("All employees in ascending order of their salary\n"+e1.getDetails());
		System.out.println("Name of Employees who are managers:"+e1.getManagers());
		System.out.println("sum of salaries of manager:"+e1.getSumOfManagerSalaries());
		System.out.println("All id's:"+e1.getIds());
	}

}
