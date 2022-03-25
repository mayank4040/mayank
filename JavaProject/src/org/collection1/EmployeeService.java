package org.collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	List<Employee> list = EmployeeRepository.getEmployees();

	public Employee getEmployee(int id, String name) {
		//display the Employee details based on id or name
		for(Employee e:list)
		{
			if(e.getId()==id && e.getName().equals(name))
			{
				return e;
			}
		}
		return null;
	}

	public List<Employee> getEmployees(Double salary) {
		// display the names of employees who are getting the salary greater than the
		// salary given
		List<Employee> ee=new ArrayList<Employee>();
		for(Employee e:list)
		{
			if(e.getSalary()>salary)
				ee.add(e);
		}
		
		return ee;
	}

	public Double getMaxSalary() {
		// display the max salary
		
		list.sort((Employee e1,Employee e2)->e1.getSalary().compareTo(e2.getSalary()));
		return list.get(list.size()-1).getSalary();
	}

	public Double getSumOfSalary() {
		// display the sum of salaries of all the employees
		double sum=0;
		for(Employee e:list)
		{
			sum+=e.getSalary();
		}
		
		return sum;
		

	}

	public List<String> getNames(String city) {
		// display the names of all employees who are working in 'Pune'
		ArrayList<String> e1=new ArrayList<String>();
		for(Employee e:list)
			if(e.getLocation().equals(city))
				e1.add(e.getName());
		return e1;
	}

	public List<Employee> getDetails() {
		// display all employees based on salary ascending
		list.sort((Employee e1,Employee e2)->e1.getSalary().compareTo(e2.getSalary()));
		return list;
	}

	public List<Employee> getManagers() {
		// display all employees who are working as managers
		ArrayList<Employee> e1=new ArrayList<Employee>();
		for(Employee e:list)
			if(e.getDesignation().equals("Manager"))
				e1.add(e);
		return e1;
	}

	public Double getSumOfManagerSalaries() {
		// display the sum of salaries of employees who are working as managers
		double sal=0;
		for(Employee e:list)
			if(e.getDesignation().equals("Manager"))
				sal+=e.getSalary();
		return sal;
	}

	public List<String> getIds() {
		// display the ids of all employees
		ArrayList<String> e1=new ArrayList<String>();
		for(Employee e:list)
			e1.add(e.getId().toString());
			
		return e1;
	}
}
