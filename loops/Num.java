package loops;
public class Num {

    static void evennum(int n)
    {
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        evennum(25);
    }
}
