class Emp
{
	int id;
	String Name;
	float Salary;
	
}

public class ArrObj {

	public static void main(String[] args) {
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.id=1;
		e1.Name="aaa";
		e1.Salary=1000;
		Emp ar[]=new Emp[2];
		ar[0]=e1;
		System.out.println(ar[0].id);
		ar[1]=e2;
		ar[1].id=3;
		System.out.println(ar);
		System.out.println(e1);
		System.out.println(e1.Name);
		System.out.println(e1.Salary);
		System.out.println(ar[0].id);
		
	}

}
