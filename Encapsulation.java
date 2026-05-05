import java.util.Scanner;

class Bank
{
    private int bal;
    void setData(int x)
    {
        if(x>=0)
            bal=x;
        else
        {
            System.out.println("not possible");
            System.exit(0);
        }
        
    }
    int getData()
    {
        return bal;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int bal = s.nextInt();
    Bank b = new Bank();   
    b.setData(bal);
    int res= b.getData();
    System.out.println(res);
    
    }
}
