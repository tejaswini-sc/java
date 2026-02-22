import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[n];
        boolean sorted=true;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                 sorted=false;
                 break;
            }   
        }
        if(!sorted)
            System.out.println("not soted");
        else
            System.out.println("sorted");
    }
}
