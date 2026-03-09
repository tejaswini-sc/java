package SortedArray;

public class NonRepeat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int n1=scanner.nextInt();
        int b[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=scanner.nextInt();
        }
        for(int i=n1,k=0;i>=0,k<b.length;i--,k++)
        {
            b[k]=b[i];
            System.out.print(b[k]+" ");
            
        }
        
    }
}
