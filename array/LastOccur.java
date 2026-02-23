import java.util.Scanner;
public class LastOccur {
    static int lastocurance(int []ar,int k)
    {
        int lastIndex=-1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==k)
            {
                lastIndex=i;
            }
        }
        if(lastIndex==-1)
        {
            return -1;
        }
        else
        {
            return lastIndex;    
        }        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("enter k value to seacrch");
        int k=sc.nextInt();
        System.out.println(lastocurance(ar,k));
    }
}
