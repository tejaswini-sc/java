import java.util.Scanner;
public class Lcm {

    static int Hcf(int n1 ,int n2)
    {
        for(int i=n1;i>1;i--)
        {
            if(n1%i==0 || n2%i==0)
                return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // implement your logic here
        int HCF=Hcf(n,m);
        System.out.println(HCF);
        int LCM =(n*m)/HCF;
        System.out.println(LCM);
    }
}