public class Operator {
    public static void main(String[] args) {
        byte b= 127;
        b++;
        System.out.println(b);
        int c = 5;
        int a= 10;
        System.out.println(c & a);
        System.out.println("10" + 20 + 30);
        System.out.println(a++ + ++a);
        byte d = 10;
        d = (byte)(d*2); 
        System.out.println(d);
        System.out.println(10 / 3);
        double d1 = 10 / 4;
        System.out.println(d1);
        int e = 5;
        e *=3+2;
        System.out.println(e);
        char c1 = 'A';
        c1++;
        System.out.println(c1);

int x = 10;
x = x++ + ++x;
System.out.println(x);
int a1 = 10;
a1 = a1++ + a1++ + ++a1;
System.out.println(a1);

char z = 'Z';
z++;
z++;
System.out.println(z);


    }
}
