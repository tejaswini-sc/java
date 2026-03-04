
import java.util.Scanner;

class Emp
{
	int id;
	String Name;
	float Salary;
	
}

public class ArrObj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp a[]=new Emp[2];
		a[0]=e1;
		a[1]=e2;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the id of emp "+ (i+1) +" ");
			a[i].id=sc.nextInt();
			System.out.println("enter the name of emp "+ (i+1) +" ");
			a[i].Name=sc.next();
			System.out.println("enter the salary of emp "+ (i+1) +" ");
			a[i].Salary=sc.nextFloat();
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].id);
			System.out.println(a[i].Name);
			System.out.println(a[i].Salary);
		}
		
	}

}
