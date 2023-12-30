import java.util.HashMap;
import java.util.Map;

public class LearnMap1 {
    public static void main(String[] args){

        Map<String, Integer> map=new HashMap<>();

        Map<String, Integer> map2=new HashMap<>();

        map.put("one", 56);
        map.put("two", 52);
        map.put("three", 69);
        map.put("four", 24);

        System.out.println(map.entrySet());   //to print all the key-value pairs of the map
        
        System.out.println(map.keySet());   //to print all the keys of the map

        System.out.println(map.values());     //to print all the values of the map

        map.remove("three");    //to delete the value associated with the specified key
        System.out.println(map.entrySet()); 

        map2.putAll(map);   //to copy a map into another map
        System.out.println(map2.entrySet());


    }
}
