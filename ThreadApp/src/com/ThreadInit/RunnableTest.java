package com.ThreadInit;

public class RunnableTest{
    public static void main(String[] args) throws InterruptedException {
        Thread t2 =new Thread(() -> {

            while (true){

            }

        });
        t2.start();
        Thread.sleep(5000);
        System.out.println(t2.getState());
    }





}
