import java.util.Scanner;

public class LargestOccurance {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // implement your logic here
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
                count++;
        }
        System.out.println(count);

    }   
}
