class ShapeAreaCalculator {

	int calculateArea(int a) {
        return a * a;
    }

    double calculateArea(double l, double w) {
        return l * w;
    }

    double calculateArea(double r) {
        return Math.PI * r * r;
    }

    double calculateArea(int b, double h) {
        return 0.5 * b * h;
    }
}
class AreaCalc {
    public static void main(String[] args) {
        ShapeAreaCalculator s = new ShapeAreaCalculator();

        int square = s.calculateArea(5);
        System.out.println("Area of the square: " + square);

        double rectangle = s.calculateArea(7.5, 4.0);
        System.out.println("Area of the rectangle: " + rectangle);

        double circle = s.calculateArea(3.0);
        System.out.println("Area of the circle: " + circle);

        double triangle = s.calculateArea(8, 6.5);
        System.out.println("Area of the triangle: " + triangle);
    }
}