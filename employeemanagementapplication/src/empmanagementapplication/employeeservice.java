package empmanagementapplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class employeeservice {

	HashSet<employee> empset=new HashSet<employee>();

	employee emp1=new employee(101, "Shital", 24, "Developer", "IT", 25000);
	employee emp2=new employee(102, "Meena", 26, "Tester","CO", 57000);
	employee emp3=new employee(103, "Bob", 20, "DevOps Eng","Admin", 5000);
	employee emp4=new employee(104, "Max", 27, "System Eng","CO",  70000);

	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;

	public employeeservice() {

		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);

	}

	//view all employees
	public void viewAllEmps() {
		for(employee emp:empset) {
			System.out.println(emp);
		}
	}
	//view emp based on there id
	public void viewEmp(){

		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}

		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update the employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	//delete emp
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		employee empdelete=null;
		for(employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	//add emp
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter Desiganation");
		desiganation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter sal");
		sc.nextDouble();

		employee emp=new employee(id, name, age, desiganation, department, sal);

		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");

	}

	}