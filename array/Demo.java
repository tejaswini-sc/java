import java.util.*;
public class Demo {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int []a= new int[5];
    for(int i=0;i<5;i++)
    {
       System.out.println("enetr age");
       a[i]=sc.nextInt();
    }
    System.out.println("ages");
    for(int j=0;j<5;j++)
    {
       System.out.println(a[j]);
    }
 }
}