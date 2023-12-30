package stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamSorted {
    public static void main(String args[]){
        List<String> list=Arrays.asList("Saurabh", "Arijit", "Rahul", "Laxman");
        
        list.stream().sorted().forEach(name -> System.out.println(name));
    }
}
