package com.company;

public class NewThread2 implements Runnable {
    private boolean isActive;

    public void disable(){
        isActive = false;
    }

    NewThread2(){
        isActive = true;
    }

    @Override
    public void run() {
        System.out.printf("%s started \n", Thread.currentThread().getName());
        NewThread2 nt = new NewThread2();
        Thread t = new Thread(new NewThread2(), "Newthread2");
        t.start();
        try{
            Thread.sleep(1000);
            nt.disable();
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Thread is Interrupted");
        }
        System.out.printf("Thread %s is finished \n",Thread.currentThread().getName());
    }
}
