package stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamLength {
    public static void main(String[] args){
        List<String> list=Arrays.asList("Saurabh", "Arijit", "Rahul", "Laxman");
        long streamLength = list.stream().count();
        System.out.println(streamLength);
    }
}
