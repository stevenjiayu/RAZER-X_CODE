package com.ThreadInit;

public class NotifyTest {
    public static void main(String[] args) {
        Thread t1 =new Thread(()->{
            sync();
        },"t1");

        Thread t2 =new Thread(()->{
            sync();
        },"t2");

        t1.start();
        t2.start();


        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (NotifyTest.class){
            NotifyTest.class.notifyAll();
        }



    }


    public static synchronized void sync(){

        for (int i = 0 ; i<10 ;i++){

            if(i==5){
                try {
                    NotifyTest.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }


    }
}
