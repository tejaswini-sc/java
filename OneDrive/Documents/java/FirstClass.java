import java.util.*;
class FirstClass{
    static int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    static float calavg(int total){
        return total/3.0f;
    }
    static void result(float avg){
        if(avg>=75){
            System.out.print("A");
        }
        else if(avg>=60){
            System.out.print("B");
        }
        else if(avg>=40){
            System.out.print("C");
        }
        else{
            System.out.print("Fail");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter name"); 
        String name =sc.next();
        System.out.println("student name is "+ name);
        System.out.println("enter 3 subjects marks");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int total=add(n1, n2, n3);
        float avg=calavg(total);
        System.out.println("total marks"+total);
        System.out.println("avarage marks"+avg);
        result(avg);
        
    }

}