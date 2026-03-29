import java.util.*;

class Plant {
    private String species;
    private String height;

    public void setData(String species, String height) {
        this.species = species;
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public String getHeight() {
        return height;
    }

    public String getDetails() {
        return "Species: " + species + ", Height: " + height;
    }
}

class FloweringPlant extends Plant {
    private String flowerColor;

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Flower Color: " + flowerColor;
    }
}

class Rose extends FloweringPlant {
    private boolean thorns;

    public void setThorns(boolean thorns) {
        this.thorns = thorns;
    }

    public boolean getThorns() {
        return thorns;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Thorns: " + thorns;
    }
}

public class RoseDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] a = s.split(",");

        String species = a[0];
        String height = a[1];
        String flowerColor = a[2];
        boolean thorns = Boolean.parseBoolean(a[3]);

        Rose r = new Rose();
        r.setData(species, height);
        r.setFlowerColor(flowerColor);
        r.setThorns(thorns);

        
    }
}