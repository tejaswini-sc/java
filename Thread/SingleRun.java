package Thread;

import java.util.Scanner;

class Demo extends Thread {
    public void run(){

        String name = getName();
        // if(name.equals("AddNumber"))
        //     add();
        // else if(name.equals("Characters"))
        //     printChars();
        // else
        //     printNums();
        name.equals("AddNumber")?add():name.equals("Characters")?printChars():printNums();        
    }  
    void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("task 1"+getName());
        System.out.println(sc.nextInt()+sc.nextInt());
    }

    void printChars(){
        System.out.println(getName());
        for(int i=65;i<72;i++){
            System.out.println("task 2: "+(char)i);
        }
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    void printNums(){
        System.out.println(getName());
        for(int i=0;i<10;i++){
            System.out.println("Task 3:"+i);
        }
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


public class SingleRun {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.setName("AddNumber");
        d.start();

        Demo d1 =new Demo();
        d1.setName("Characters");
        d1.start();
.
    }
}
