package Inheritance;
import java.util.*;

class Gadget {
    private String brand;
    private int price;

    public void setData(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getDetails() {
        return "Brand: " + brand + ", Price: " + price;
    }
}

class Wearable extends Gadget {
    private String batteryLife;

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Battery Life: " + batteryLife;
    }
}

class SmartWatch extends Wearable {
    private boolean waterResistant;

    public void setWaterResistant(boolean waterResistant) {
        this.waterResistant = waterResistant;
    }

    public boolean getWaterResistant() {
        return waterResistant;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Water Resistant: " + waterResistant;
    }
}

public class SmartWatchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] a = s.split(",");

        String brand = a[0];
        int price = Integer.parseInt(a[1]);
        String batteryLife = a[2];
        boolean wr = Boolean.parseBoolean(a[3]);

        SmartWatch sw = new SmartWatch();
        sw.setData(brand, price);
        sw.setBatteryLife(batteryLife);
        sw.setWaterResistant(wr);

        System.out.println("Smart Watch Details: " + sw.getDetails());
    }
}