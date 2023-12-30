import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LearnLinkedHashMap {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> myMap1=new LinkedHashMap<>();

        myMap1.put("one", 10);
        myMap1.put("two", 20);
        myMap1.put("three", 30);
        myMap1.put("four", 40);

        System.out.println(myMap1);

        LinkedHashMap<String, Integer> myMap2=new LinkedHashMap<>(myMap1);     // Creating a LinkedHashMap from other LinkedHashMap

        System.out.println(myMap2);

        myMap2.put("five", 50);
        System.out.println(myMap2);

        System.out.println(myMap2.entrySet());   //returns the set view of the map

        System.out.println(myMap2.keySet());

        System.out.println(myMap2.values());

        System.out.println(myMap2.getOrDefault("six", 60));   //returns the default value if the key is not present in the map
        
        myMap2.remove("three");

        System.out.println(myMap2);

        myMap2.clear();  //removes all elements of the map

        System.out.println(myMap2);

        System.out.println(myMap2.size());

        for(Entry<String, Integer> entry : myMap2.entrySet()){
            System.out.println(entry);
        }

    }
}
