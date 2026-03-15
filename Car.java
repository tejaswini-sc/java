import java.util.*;

class Car1
{
    private String make;
    private String model;
    private int year;
    private float price;

    public void setdata(String make,String model,int year,float price)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public float getPrice()
    {
        return price;
    }
}

class Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car1 s = new Car1();

        String make = sc.nextLine();
        String model = sc.nextLine();
        int year = sc.nextInt();
        float price = sc.nextFloat();

        s.setdata(make,model,year,price);

        System.out.println(s.getMake());
        System.out.println(s.getModel());
        System.out.println(s.getYear());
        System.out.println(s.getPrice());
    }
}