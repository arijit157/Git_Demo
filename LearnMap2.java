import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

class LearnMap2{
    public static void main(String[] args){
        Map<String, Integer> myMap=new TreeMap<>();
        
        myMap.put("one", 10);
        myMap.put("two", 20);
        myMap.put("three", 30);
        myMap.put("four", 40);

        System.out.println("My map: "+myMap.entrySet());   //converts the map into a set and returns it

        System.out.println(myMap);   //prints the map

        myMap.remove("three");
        System.out.println(myMap.entrySet());

        System.out.println(myMap.keySet());

        System.out.println(myMap.values());

        System.out.println("Value of the 4th key: "+myMap.get("four"));

        myMap.replace("two",50);   //replaces the value associated with the key by the specified value
        System.out.println(myMap);

        int size=myMap.size();  //size of the map
        System.out.println(size);

        //to iterate the map, we have used the Entry class of the map interface
        for(Entry<String, Integer> entry : myMap.entrySet()){
            System.out.println(entry);
        }

    }
}