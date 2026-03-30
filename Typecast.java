// import java.util.Scanner;

abstract class Alpha{
  static int a;
  static
  {
    a=10;
  }
   static void hello(){
    System.out.println("hello");
  }
  int b=5;
}
public class Typecast {
    public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       // String word= sc.nextLine();
//       // System.out.print(word);
//       int n=sc.nextInt();
//       int a[] =new int[n];
//       System.out.println(a.length/2);
//     System.out.println((a.length+1)/2);
Alpha a=new Alpha();
System.out.println(Alpha.a);
Alpha.hello();

    }    
}
