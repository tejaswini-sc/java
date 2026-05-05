import java.util.*;

class Product {
    private int pId;
    private String pName;
    private int quantity;
    private float price;

    public void setData(int pId, String pName, int quantity, float price) {
        this.pId = pId;
        this.pName = pName;
        this.quantity = quantity;
        this.price = price;
    }

    public void getId() {
        System.out.println(pId);
    }

    public void getName() {
        System.out.println(pName);
    }

    public void getQun() {
        System.out.println(quantity);
    }

    public void getPrice() {
        System.out.println(price);
    }
}

class ProductApp {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println("enter product details");
        int pId = sc.nextInt();
        sc.nextLine();
        String pname = sc.nextLine();
        int quantity = sc.nextInt();
        float price = sc.nextFloat();

        p.setData(pId, pname, quantity, price);
        System.out.println(" product details");
        p.getId();
        p.getName();
        p.getQun();
        p.getPrice();
    }
}