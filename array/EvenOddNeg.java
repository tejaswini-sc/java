import java.util.*;
public class EvenOddNeg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // implement your logic here
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
        	if(a[i]%2!=0 && a[i]>0)
             {
                 System.out.print(a[i]+" ");
             }
		}
        System.out.println();
        for (int k = 0; k < a.length; k++) {
        	if(a[k]%2==0 && a[k]>0)      
        	{
        		System.out.print(a[k]+" ");
        	}			
		}
	}

}

