// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ThreadMain {
    public static void main(String[] args) {
        Thread thread =new Thread();

        thread.start();

        for (int i = 1; i <= 5; i++) {


            System.out.println("i = " + i);
        }
    }
}