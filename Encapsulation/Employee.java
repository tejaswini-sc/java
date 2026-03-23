package Encapsulation;
import java.util.Scanner;
class Emp
{
	private int empId;
	private String empName;
	private double salary;
	
	public Emp() {
	}
	public Emp(int empId ,String empName, double salary) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}
public class Employee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of employee");
		int n=sc.nextInt();
		
		Emp[] empArr = new Emp[n];
		sc.nextLine();
		for(int i=0;i<empArr.length;i++)
		{
			empArr[i] = new Emp();

			System.out.println("enter the data of emp"+(i+1));
			
			String str =sc.nextLine();
			
			String[] ar = str.split(",");
			
			empArr[i].setEmpId(Integer.parseInt(ar[0].trim()));
			empArr[i].setEmpName(ar[1]);
			empArr[i].setSalary(Integer.parseInt(ar[2].trim()));			
		} 
		for(int i=0;i<n;i++)
		{
			System.out.println(empArr[i].getEmpId()+" "+empArr[i].getEmpName()+" "+empArr[i].getSalary());
		}
		
	}

}
