import java.util.Scanner;

abstract class Shape {
    static Scanner sc = new Scanner(System.in); // ✅ single shared Scanner
    float area;

    abstract void acceptInput();
    abstract void calcArea();

    float getArea() {
        return area;
    }
}

class Square extends Shape {
    float side;

    @Override
    void acceptInput() {
        side = sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = side * side;
    }
}

class Rectangle extends Shape {
    float length, breadth;

    @Override
    void acceptInput() {
        length = sc.nextFloat();
        breadth = sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = length * breadth;
    }
}

// Subclass Circle
class Circle extends Shape {
    float radius;

    @Override
    void acceptInput() {
        radius = sc.nextFloat();
    }

    @Override
    void calcArea() {
        area = (float)(Math.PI * radius * radius);
    }
}

public class CaluclateArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.next();  

        Shape s;

        if(type.equals("Square")){
            s = new Square();
        }
        else if(type.equals("Rectangle")){
            s = new Rectangle();
        }
        else if(type.equals("Circle")){
            s = new Circle();
        }
        else{
            System.out.println("Invalid Shape");
            return;
        }

        s.acceptInput();
        s.calcArea();
        System.out.println("Area of " + type + ": " + s.getArea());
    }
}