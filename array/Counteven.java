import java.util.Scanner;

public class Counteven {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner sc = new Scanner(System.in);
        int count =0;
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++)
        {
            if(a[j]%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
