import java.util.*;

public class CountPair {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
    int n=scanner.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=scanner.nextInt();
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
          count++;   
        }
    }
    System.out.print(count);
  }
}