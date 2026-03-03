package SortedArray;
import java.util.*;
public class PrintNums {
    public static void arraywithoutrepeat(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                System.out.println(a[i]);
            }
        }
        System.out.print(a[a.length-1]);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        arraywithoutrepeat(a);
    }    
}
