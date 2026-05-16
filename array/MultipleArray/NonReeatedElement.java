package array.MultipleArray;
import java.util.*;;
public class NonReeatedElement {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int n1 = scanner.nextInt();
        int b[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=scanner.nextInt();
        }
        int i=0,j=0;
        while(i<n && j<n1)
        {
         if(a[i]==b[j])
         {
            i++;
            j++;
         }   
         else if(a[i]<b[j])
         {
            System.out.print(a[i]+" ");
            i++;
         }
         else{
            System.out.print(b[j]+" ");
            j++;
         }
        }
        while(i<n)
        {
            System.out.print(a[i]+" ");
            i++;
        }        
        while(j<n1)
        {
            System.out.print(a[i]+" ");
        }        
    }

}

