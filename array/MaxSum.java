import java.util.*;
public class MaxSum {

	static int sumArray(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	static int maxArray(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	static int minArray(int a[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter n size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=sumArray(a);
		int min=minArray(a);
		int max=maxArray(a);
		System.out.println("max sum "+(sum-max));
		System.out.println("min sum "+(sum-min));		
	}

}
