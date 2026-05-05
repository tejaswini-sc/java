import java.util.Scanner;

abstract class ThreeDShape {
    float volume;

    abstract void acceptInput(Scanner sc);
    abstract void calVolume();
}

class Cube extends ThreeDShape {
    float side;

    @Override
    void acceptInput(Scanner sc) {
        side = sc.nextFloat();
    }

    @Override
    void calVolume() {
        volume = side * side * side;
        System.out.printf("Volume of Cube: %.2f\n", volume);
    }
}

class Cylinder extends ThreeDShape {
    float radius, height;

    @Override
    void acceptInput(Scanner sc) {
        radius = sc.nextFloat();
        height = sc.nextFloat();
    }

    @Override
    void calVolume() {
        volume = (float)(Math.PI * radius * radius * height);
        System.out.printf("Volume of Cylinder: %.2f\n", volume);
    }
}

class Sphere extends ThreeDShape {
    float radius;

    @Override
    void acceptInput(Scanner sc) {
        radius = sc.nextFloat();
    }

    @Override
    void calVolume() {
        volume = (float)((4.0/3) * Math.PI * radius * radius * radius);
        System.out.printf("Volume of Sphere: %.2f\n", volume);
    }
}

public class Volume {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        ThreeDShape shape;

        if(type.equals("Cube")) {
            shape = new Cube();
        }
        else if(type.equals("Cylinder")) {
            shape = new Cylinder();
        }
        else if(type.equals("Sphere")) {
            shape = new Sphere();
        }
        else {
            System.out.println("Invalid Shape");
            return;
        }

        shape.acceptInput(scanner);
        shape.calVolume();
    }
}