package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private double salary;
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Id"+eid+" name "+ename+" sal "+salary;
	}
	
	@Override
	public int compareTo(Employee e2) {

		return -1*Double.valueOf(this.salary).compareTo(e2.salary);	 
	}	
}

public class Emp {
	public static void main(String[] args) {
		Employee e1= new Employee(2, "sundar", 50000);
		Employee e3= new Employee(5,"tim",2000);
		Employee e2= new Employee(1,"arun",10);
		
		System.out.println("enter sort type 1: id 2: name 3:salary");
			
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Collections.sort(al);
		System.out.println(al);
	}
}
