package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        CommonResurce commonResurce = new CommonResurce();
        for (int i = 1; i<5; i++){
            Thread t = new Thread(new Thread(new CountThread(commonResurce), "Thread + i";
            t.start();
        }
        System.out.println("Main thread finished");

    }
}






        /*Thread t = Thread.currentThread();
	    System.out.println(t.getName());
        t.setName("ASD");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.isAlive(); // Проверка на то, жив ли поток
        t.isInterrupted(); // Проверка на прерванность
        t.run();
        //t.sleep(100); - Приостановка потока не 100мс
        t.start();
        for(int i = 0; i < 10; i++)
            new NewThread("Thread" + i).start();
        System.out.println("Main thread finished");
        NewThread nt = new NewThread("Thread1");
        nt.start();
        try{
            nt.interrupt();
            Thread.sleep(100);

        }catch (InterruptedException e){
            System.out.println("Thread has been interrupted");
        }

        System.out.printf("Thread %s is finished \n", Thread.currentThread().getName() );

        */