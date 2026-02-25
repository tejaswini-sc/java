import java.util.Scanner;

class Customer
{
	int id;
	String Name;
	String product;
	float price;
}

public class CustomerObj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer();
		System.out.println("enter custome id ");
		c1.id=sc.nextInt();
		System.out.println("enter custome Name ");
		c1.Name=sc.next();
		System.out.println("enter custome product ");
		c1.product=sc.next();
		System.out.println("enter custome price ");
		c1.price=sc.nextFloat();
		Customer c2 = new Customer();
		System.out.println("enter custome id ");
		c2.id=sc.nextInt();
		System.out.println("enter custome Name ");
		c2.Name=sc.next();
		System.out.println("enter custome product ");
		c2.product=sc.next();
		System.out.println("enter custome price ");
		c2.price=sc.nextFloat();
		Customer c3 = new Customer();
		System.out.println("enter custome id ");
		c3.id=sc.nextInt();
		System.out.println("enter custome Name ");
		c3.Name=sc.next();
		System.out.println("enter custome product ");
		c3.product=sc.next();
		System.out.println("enter custome price ");
		c3.price=sc.nextFloat();
		
		Customer []a=new Customer[3];
		a[0]=c1;
		a[1]=c2;
		a[2]=c3;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].id+" "+ a[i].Name+ " "+ a[i].product+" "+ a[i].price+" ");
		}
	}

}
