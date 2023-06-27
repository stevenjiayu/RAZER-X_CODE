import java.util.HashMap;
import java.util.Map;

public class HashTest {

    HashMap map;

    int threshold;
    int MAXIMUN_CAPACITY = 1;
    int initialCapacity =16;
    float loadFactor = 0.75F;
    transient Map.Entry<Integer,String>[] table;

    public void HashMapApp(){

        int capacity =1;

        this.initialCapacity = initialCapacity;
        while (capacity < initialCapacity)

            capacity <<=1;

        this.loadFactor = loadFactor;
        //threshold2 = (int) (capacity * loadFactor);
        threshold = (int)Math.min(capacity * loadFactor,MAXIMUN_CAPACITY +1);
        System.out.println(threshold);
        table =new Map.Entry[capacity];
    }


    public String put (Integer key,String value){


        //get hash code
        int hash = hash(key);

        int i =indexFor(hash,table.length);
        return "";
    }


    //calculate hashcode
    int hash(Object key) {
        int h=0;

        h ^=key.hashCode();

        h ^= (h>>>20)^(h>>>12);
        return h^(h>>>7)^(h>>>4);
    }

    //與運算(either 0 or 1)calculate index in table
    int indexFor(int hash, int length){


        //等同hash % (length-1) 取餘數---->效率低
        //與運算效率高
        return hash & (length-1);
    }



}


