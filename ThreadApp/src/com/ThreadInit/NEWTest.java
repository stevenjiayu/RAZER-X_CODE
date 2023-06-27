package com.ThreadInit;

import java.util.HashMap;

public class NEWTest {


    public static int hash(int h){

        h ^= (h >>> 20) ^ (h >>> 12);
        return h^ (h >>> 7) ^ (h >>> 4);

    }

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();

        Thread t2 =new Thread(() -> {

        });

        int a =hash(20);



        //System.out.println(t2.getState());



        System.out.println(a);



    }


}
