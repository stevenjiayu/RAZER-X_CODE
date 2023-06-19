package com.ThreadInit;

public class JoinTest {


    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(() -> {

            for (int i=0 ;i<10;i++){
                System.out.println("t1:"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread t2 =new Thread(() -> {

            for (int i=0 ;i<10;i++){
                System.out.println("t2:"+i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if (i==1){
                    try {
                        t1.join(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //加入時間後，t2不用進入waiting(阻塞)狀態，每等t1線程結束2秒，t2線程就走一次循環
                }
            }

        });

        t1.start();
        t2.start();

        for (int i=0 ;i<10;i++){
            System.out.println("Main"+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (i==1){
                t1.join();
                //如果==1->主線程進入waiting(阻塞)狀態，每等t1線程結束，主線程就走一次循環
            }



        }
    }





}
