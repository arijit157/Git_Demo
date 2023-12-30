package stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamSorted5 {
    public static void main(String args[]){
        List<String> list=Arrays.asList("Sunny Leone", "Kajal Agarwal", "Prabhash", "Anushka Shetty", "Mallika Sherawat");

        list.stream().sorted((s1, s2) -> (s1.length() < s2.length()) ? -1 : (s1.length() > s2.length()) ? 1 : 0).forEach(el -> System.out.println(el));
    }
}
