package com.ThreadInit;

public class priorityTest {

    public static void main(String[] args) {
        Thread t1 =new Thread(() -> {

            for (int i=0 ;i<100 ;i++){
                System.out.println("t1"+i);
            }

        });

        Thread t2 =new Thread(() -> {

            for (int i=0 ;i<100 ;i++){
                System.out.println("t2"+i);
            }

        });

        t1.setPriority(10);
        t2.setPriority(1);

        t2.start();
        t1.start();
    }

}
