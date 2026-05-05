import java.util.Scanner;

public class Checkno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[] =new int[n];
        System.out.println("enter values");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int num;
        System.out.println("enter num which u want to search");
        num=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(a[i]==num)
            {
                System.out.println("found at index "+i);
                found =true;
                break;
            }                   
        }    
        if(!found)
        {
            System.out.println("not found");
        }    
    }
}
