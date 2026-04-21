package Inheritance;
import java.util.*;

class Building {
    private String address;
    private int floors;

    public void setData(String address, int floors) {
        this.address = address;
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public int getFloors() {
        return floors;
    }

    public String getDetails() {
        return "Address: " + address + ", Floors: " + floors;
    }
}

class ResidentialBuilding extends Building {
    private int numberOfApartment;

    public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Number of Apartments: " + numberOfApartment;
    }
}

class Apartment extends ResidentialBuilding {
    private String unitNumber;

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Unit Number: " + unitNumber;
    }
}

public class ApartmentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] a = s.split(",");

        String address = a[0];
        int floors = Integer.parseInt(a[1]);
        int noOfApt = Integer.parseInt(a[2]);
        String unitNo = a[3];

        Apartment ap = new Apartment();
        ap.setData(address, floors);
        ap.setNumberOfApartment(noOfApt);
        ap.setUnitNumber(unitNo);

        System.out.println("Apartment Details: " + ap.getDetails());
    }
}