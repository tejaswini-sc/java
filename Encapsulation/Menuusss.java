package Encapsulation;
import java.util.*;

class Menu {
    private int id;
    private String name;
    private double price;
    private String description;

    public Menu(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDesc() {
        return description;
    }
}

class Menuusss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split(",");

        Menu r = new Menu(
            Integer.parseInt(arr[0]),
            arr[1],
            Double.parseDouble(arr[2]),
            arr[3]
        );

        System.out.println(r.getId());
        System.out.println(r.getName());
        System.out.println(r.getPrice());
        System.out.println(r.getDesc());
    }
}