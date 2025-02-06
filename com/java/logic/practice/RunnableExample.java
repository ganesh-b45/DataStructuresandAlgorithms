package com.java.logic.practice;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t=new Thread(obj);
        t.start();


    }
}
