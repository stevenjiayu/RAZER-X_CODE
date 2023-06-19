package com.ThreadInit;

public class NEWTest {

    public static void main(String[] args) {

        Thread t2 =new Thread(() -> {

        });

        System.out.println(t2.getState());

    }


}
