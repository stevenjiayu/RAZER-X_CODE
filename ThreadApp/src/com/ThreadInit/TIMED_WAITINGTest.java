package com.ThreadInit;

public class TIMED_WAITINGTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(() -> {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        //main啟動之後(0.5)再看狀態,還在休眠(1)->TIMED_WAITING
        Thread.sleep(500);
        System.out.println(t1.getState());

    }
}
