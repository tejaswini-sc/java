package Thread;

class Virat extends Thread {

    public void run(){
     try{
     System.out.println(getName()+" Departed Hotel");
     Thread.sleep(5000);
     System.out.println(getName()+" Reached stadium");
     Thread.sleep(5000);
     System.out.println(getName()+" Started practice");
     Thread.sleep(5000);
     System.out.println(getName()+" took break");
     Thread.sleep(5000);
     System.out.println(" getName()+Continued practice");
     Thread.sleep(5000);   
     System.out.println(getName()+" Arrived Hotel");
     Thread.sleep(5000);
     } 
     catch (Exception e) {
      e.printStackTrace();  
     }
    }
}

class BatCoach extends Thread{
    public void run(){
     try{
     System.out.println(getName()+" Departed Hotel");
     Thread.sleep(5000);
     System.out.println(getName()+" Reached stadium");
     Thread.sleep(5000);
     System.out.println(getName()+" Started practice");
     Thread.sleep(5000);
     System.out.println(getName()+" took break");
     Thread.sleep(5000);
     System.out.println(getName()+" helped to Continued practice");
     Thread.sleep(5000);   
     System.out.println(getName()+" Arrived Hotel");
     Thread.sleep(5000);
     } 
     catch (Exception e) {
      e.printStackTrace();  
     }
    }
}

class BallCoach extends Thread{
    public void run(){
     try{
     System.out.println(getName()+" Departed Hotel");
     Thread.sleep(5000);
     System.out.println(getName()+" Reached stadium");
     Thread.sleep(5000);
     System.out.println(getName()+" Started practice");
     Thread.sleep(5000);
     System.out.println(getName()+" took break");
     Thread.sleep(5000);
     System.out.println(getName()+" helped to Continued practice");
     Thread.sleep(5000);   
     System.out.println(getName()+" Arrived Hotel");
     Thread.sleep(5000);
     } 
     catch (Exception e) {
      e.printStackTrace();  
     }
    }
}

public class deamon {
    public static void main(String args[]){
        Virat v=new Virat();
        v.setName("Virat");
        v.start();

        BatCoach bat=new BatCoach();
        bat.setName("Bat");
        bat.start();

        BallCoach ball =new BallCoach();
        ball.setName("Ball");
        ball.start();
    }
}
