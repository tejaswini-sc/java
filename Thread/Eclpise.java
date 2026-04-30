package Thread;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class autoSave extends Thread {
    
    @Override
    public void run() {
        for(;;){
            try {
                
            System.out.println("Main thread started");
            Thread.sleep(2000);
            System.out.println("Auto-save daemon thread started");
            Thread.sleep(2000);
            System.out.println("Saving file automatically...");
            Thread.sleep(2000);
            System.out.println("Working on Eclipse editor...");
            Thread.sleep(2000);
            System.out.println("Main thread completed");
            Thread.sleep(2000);
            System.out.println("Daemon thread will stop automatically when main thread ends");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Eclpise {
    public static void main(String[] args) {
       
        autoSave as=new autoSave();
        as.setDaemon(true);
        as.start();

    }
}
