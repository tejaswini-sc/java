
import java.util.*;

public class Day4 {
	
	// prime no
	static String CheckPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)   // or for(int i=2;i<=n/2;i++) // use less time
		{
			if(n%i==0)
			{
				 count++;
			}
		}
		if(count==2)			// if(count==0)
			return "prime";
		else
			return "not prime";
	}
	// effecient way
	static String CheckPrime1(int n)
	{
		for(int i=1;i<=n;i++)   // or for(int i=2;i*i<n=;i++) // one more efficient way
		{
			if(n%i==0)
			{
				return "not prime";
			}
		}
		return "prime";
	}

	static void PrintPrimes(int n,int m)
	{
		for(int i=n;i*i<=m;i++)   // or for(int i=2;i*i<n=;i++) // one more efficient way
		{
			if(m%i==0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//		string res= CheckPrime(n);
		String res1=CheckPrime1(n);
		System.out.println(res1);
		System.out.println(res1);
		
	}

}
