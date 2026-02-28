import java.util.*;

public class EvenPair {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int n=scanner.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=scanner.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]%2==0 && a[j]%2==0)
            {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
  }
}