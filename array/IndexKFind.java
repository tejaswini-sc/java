import java.util.*;

public class IndexKFind {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        int found=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                found=i;
                break;
            }
        }
        System.out.print(found);      
   
    }
}