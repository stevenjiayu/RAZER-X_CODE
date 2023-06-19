package com.ThreadInit;

public class TerminateTest {
    public static void main(String[] args) throws InterruptedException {

        Thread t2 =new Thread(() -> {

            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        //main啟動之後,可是執行程式早就執行完->TERMINATED
        t2.setName("模塊設計-01式");
        t2.start();

        Thread.sleep(1000);
        System.out.println(t2.getState());

    }


}
