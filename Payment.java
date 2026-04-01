
interface PaymentGateway{
    void transaction();
    void process();
    default void refaundpayment(){
        System.out.println("refund in process");
    }
    static void balance(){
        System.out.println("balnce is processing");
    }
}
class PhonePay implements PaymentGateway {
    @Override
    public void transaction() {
        System.out.println("phonepay tracastion proces");
    }

    @Override
    public void process() {
        System.out.println("phonepay processing");
    }
}
class GPay implements PaymentGateway {
    @Override
    public void transaction() {
        System.out.println("Gpay transcation Process");
    }
    @Override
    public void process() {
       System.out.println("Gpay processing");
    }
}
class Paytm implements PaymentGateway {
    @Override
    public void transaction() {
        System.out.println("Paytm transcation Process");
    }
    @Override
    public void process() {
       System.out.println("Paytm processing");
    }    
}

class Upi{
    void upi(PaymentGateway pg){
        pg.transaction();
        pg.process();
    }
}
class Payment{
    public static void main(String[] args) {
        Upi u=new Upi();
        PhonePay pp=new PhonePay();
        GPay gp=new GPay();
        Paytm py=new Paytm();
        u.upi(pp);
        u.upi(gp);
        u.upi(py);
        pp.refaundpayment();
        PaymentGateway.balance();

    }
}