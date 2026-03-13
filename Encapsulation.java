class Bank
{
    private int bal;
    void setData(int x)
    {
        if(x>=0)
            bal=x;
        else
            System.out.println("not possible");
        
    }
    int getData()
    {
        return bal;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
    Bank b = new Bank();   
    b.setData(-1000);
    int res= b.getData();
    System.out.println(res);
    }
}
