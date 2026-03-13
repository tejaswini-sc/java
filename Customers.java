class Zeptocustm {
    private int cId;
    private String cName;
    private long cPhone;

    public void setData(int cId,String cName,long cPhone)
    {
        this.cId=cId;
        this.cName=cName;
        this.cPhone=cPhone;

    }
    public int getcId()
    {
        return cId;
    }
    public String getcName()
    {
        return cName;
    }
    public long getcPhone()
    {
        return cPhone;
    }
}


public class Customers {

    public static void main(String [] args)

    {
        Zeptocustm c= new Zeptocustm();
        c.setData(2, "teju", 1234567890);
        System.out.println(c.getcId());
        System.out.println(c.getcName());
        System.out.println(c.getcPhone());
    }    
}
