abstract class Bird {
    
    final abstract void eat();
    abstract void fly();
}
abstract class Egale extends Bird{
    final abstract void eat();
    final int a=10;
    @Override
    void fly() {
        System.out.println("Eagle is flying");        
    }
}
class SEgale extends Egale {
    @Override
    void eat() {
        System.out.println("SurpentEgale eats");
    }
    @Override
    void fly() {
        System.out.println("Surpentegale flyes");
    }
}
class GEgale extends Egale {
    @Override
    void eat() {
        System.out.println("GoldenEgale eats");
    }
    @Override
    void fly() {
        System.out.println("GoldenEgale flyes");
    }
}
public class Demo {
    public static void main(String[] args) {
        Bird g=new GEgale();
        Bird s=new SEgale();
        g.eat();
        g.fly();
        s.eat();
        s.fly();
   } 
}
