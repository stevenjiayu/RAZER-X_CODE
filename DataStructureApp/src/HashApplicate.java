public class HashApplicate {



    public static void main(String[] args) {

        int h=10;
        HashTest hashTest =new HashTest();

        //hashTest.HashMapApp();

        hashTest.hash(12);

        int a = h >>> 4;

        h ^= (h>>>20)^(h>>>12);

        System.out.println(a);

    }

}
