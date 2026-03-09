import java.util.Scanner;

class PrimeSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n=scanner.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        boolean found=false;
        for(int len=1; len<=a.length; len++)
        {
            for(int i=0; i<=a.length-len; i++)
            {
                int sum=0;

                for(int j=i;j<i+len;j++)
                {
                    sum+=a[j];
                }

                boolean prime=true;

                if(sum<=1)
                {
                    prime=false;
                }
                else
                {
                    for(int k=2;k<sum;k++)
                    {
                        if(sum%k==0)
                        {
                            prime=false;
                            break;
                        }
                    }
                }

                if(prime)
                {
                    for(int x=i;x<i+len;x++)
                    {
                        System.out.print(a[x]+" ");
                    }
                    System.out.println();
                    found=true;
                }
            }
        }
        if(!found)
        {
            System.out.print("None");
        }
    }
}
