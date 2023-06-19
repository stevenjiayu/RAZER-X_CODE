package com.ThreadInit;

public class Wait {

    public static void main(String[] args) throws InterruptedException {

        Object obj =new Object();

        Thread t1 =new Thread(() -> {
            synchronized (obj){
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        Thread.sleep(5000);
        System.out.println(t1.getState());


    }
}
