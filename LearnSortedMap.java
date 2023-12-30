import java.util.SortedMap;
import java.util.TreeMap;

public class LearnSortedMap {
    public static void main(String[] args){
        SortedMap<String, Integer> myMap=new TreeMap<>();

        myMap.put("two", 10);
        myMap.put("one", 20);
        myMap.put("four", 20);

        System.out.println(myMap);

        System.out.println(myMap.firstKey());

        System.out.println(myMap.lastKey());

        System.out.println(myMap.headMap("two"));

        System.out.println(myMap.tailMap("four"));

        System.out.println(myMap.subMap("four", "two"));

        
    }
}
