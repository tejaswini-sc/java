package SortedArray;
import java.util.*;
public class printUniqueValue {

    public static void uniqueNum(int a[])
    {
        int count=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count++;
            }
            else
            {
                if(count==1)
                {
                    System.out.println(a[i]);
                }
                count=1;
            }
        }
        if(count==1)
        {
            System.out.print(a[a.length-1]);
        }
        
    }
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        uniqueNum(a);
    }
    
}
