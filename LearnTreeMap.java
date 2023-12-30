import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String args[]){
        TreeMap<Integer, String> myMap=new TreeMap<>();

        myMap.put(1, "apple");
        myMap.put(3, "banana");
        myMap.put(2, "guava");
        myMap.put(5, "kiwi");
        myMap.put(4, "lemon");

        System.out.println(myMap);

        System.out.println(myMap.get(3));

        myMap.replace(4, "jackfruit");

        System.out.println(myMap);

        System.out.println(myMap.entrySet());

        System.out.println(myMap.keySet());

        System.out.println(myMap.values());

        System.out.println(myMap.headMap(4, false));    //like NavigableMap's headMap()

        System.out.println(myMap.tailMap(2));    //like NavigableMap's tailMap()

        System.out.println(myMap.subMap(2, false, 5, false));

        System.out.println("ceilingEntry: "+myMap.ceilingEntry(2));

        System.out.println("higherEntry: "+myMap.higherEntry(2));

        System.out.println("floorEntry: "+myMap.floorEntry(4));

        System.out.println("lowerEntry: "+myMap.lowerEntry(4));

        System.out.println("ceiling key: "+myMap.ceilingKey(2));

        System.out.println("higherKey: "+myMap.higherKey(2));

        System.out.println("floorKey: "+myMap.floorKey(4));

        System.out.println("lowerKey: "+myMap.lowerKey(4));

        System.out.println(myMap.firstEntry());

        System.out.println(myMap.lastEntry());

        System.out.println(myMap.firstKey());

        System.out.println(myMap.lastKey());

        System.out.println(myMap.remove(3));

        System.out.println(myMap);

        System.out.println(myMap.pollFirstEntry());

        System.out.println(myMap.pollLastEntry());

        System.out.println(myMap.size());

        myMap.clear();

        System.out.println(myMap);
    }
}
