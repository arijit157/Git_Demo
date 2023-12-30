import java.util.NavigableMap;
import java.util.TreeMap;

class LearnNavigableMap{
    public static void main(String[] args){
        NavigableMap<Integer, String> myMap=new TreeMap<>();

        myMap.put(1, "apple");
        myMap.put(3, "banana");
        myMap.put(2, "guava");
        myMap.put(5, "kiwi");
        myMap.put(4, "lemon");

        System.out.println(myMap);

        System.out.println("ceilingEntry: "+myMap.ceilingEntry(2));

        System.out.println("higherEntry"+myMap.higherEntry(2));

        System.out.println("floorEntry"+myMap.floorEntry(4));

        System.out.println("lowerEntry: "+myMap.lowerEntry(4));

        System.out.println("ceiling key: "+myMap.ceilingKey(2));

        System.out.println("higherKey: "+myMap.higherKey(2));

        System.out.println("floorKey: "+myMap.floorKey(4));

        System.out.println("lowerKey: "+myMap.lowerKey(4));

        System.out.println(myMap.firstEntry());

        System.out.println(myMap.lastEntry());

        System.out.println(myMap.pollFirstEntry());

        System.out.println(myMap.pollLastEntry());

        System.out.println(myMap);

        System.out.println("headMap: "+myMap.headMap(4));

        System.out.println("tailMap: "+myMap.tailMap(2));

        System.out.println("subMap: "+myMap.subMap(2, true, 5, false));
    }
}