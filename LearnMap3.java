import java.util.HashMap;
import java.util.Map.Entry;

public class LearnMap3 {
    public static void main(String[] args){
        HashMap<String, Integer> myMap=new HashMap<>();
        HashMap<String, Integer> myMap2=new HashMap<>();

        myMap.put("one", 10);
        myMap.put("two", 20);
        myMap.put("three", 30);
        myMap.put("four", 40);

        myMap2.put("five", 50);
        myMap2.put("six", 60);
        myMap2.put("seven", 70);
        myMap2.put("eight", 80);

        System.out.println(myMap);   //prints the map

        System.out.println(myMap.entrySet());   //converts the map into a set

        myMap.remove("three");

        System.out.println(myMap);

        System.out.println(myMap.keySet());

        System.out.println(myMap.values());

        System.out.println("Value of the 4th key: "+myMap.get("four"));

        myMap.putAll(myMap2);   //to merge two map
        System.out.println(myMap);

        int size=myMap.size();  //size of the map
        System.out.println(size);

        //to iterate the map, we have used the Entry class of the map interface
        for(Entry<String, Integer> entry : myMap.entrySet()){
            System.out.println(entry);
        }
    }
}
