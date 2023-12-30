import java.util.WeakHashMap;

public class LearnWeakHashMap {
    public static void main(String[] args){
        WeakHashMap<Integer, String> myMap=new WeakHashMap<>();

        Integer key1=1;
        String value1=new String("apple");
        myMap.put(key1, value1);

        Integer key2=2;
        String value2=new String("banana");
        myMap.put(key2, value2);

        key2=null;

        System.gc();

        System.out.println(myMap);
    }
}
