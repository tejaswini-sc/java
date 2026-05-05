package array.SortedArray;
import java.util.*;
public class printUniqueValue {

    public static void uniqueNum(int a[])
    {
        int uniquecount=0;
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
                    uniquecount++;
                }
                count=1;
            }
        }
        if(count==1)
        {
            System.out.println(a[a.length-1]);
            uniquecount++;
        }
        System.out.print("unique counts "+uniquecount );
        
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
