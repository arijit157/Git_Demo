package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted2 {
    public static void main(String args[]){
        List<String> list=Arrays.asList("Saurabh", "Arijit", "Rahul", "Laxman", "Anil");

        List<String> newList = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());

        newList.forEach(name -> System.out.println(name));
    }
}
