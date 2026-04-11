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

