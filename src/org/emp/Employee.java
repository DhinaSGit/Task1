package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	public void empName() {
		System.out.println("Employee Name : Dhina");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		
		Company c = new Company();
		c.companyName();
		
		Client ci = new Client();
		ci.clientName();
		
		Project p = new Project();
		p.projectName();
	}
}
