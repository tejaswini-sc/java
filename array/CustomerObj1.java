import java.util.Scanner;

class Customers
{
	int id;
	String Name;
	String product;
	float price;
}

public class CustomerObj1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Customers []a=new Customers[n];
		
		for(int i=0;i<3;i++)
		{
			a[i] = new Customers();
			System.out.println("enter custome id "+(i+1));
			a[i].id=sc.nextInt();
			System.out.println("enter custome Name "+(i+1));
			a[i].Name=sc.next();
			System.out.println("enter custome product "+(i+1));
			a[i].product=sc.next();
			System.out.println("enter custome price "+(i+1));
			a[i].price=sc.nextFloat();

		}	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].id+" "+ a[i].Name+ " "+ a[i].product+" "+ a[i].price+" ");
		}
	}

}
