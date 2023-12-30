package stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamLength2 {
    public static void main(String args[]){
        List<Integer> marks=Arrays.asList(35,58,67,45,32,29,46,23);

        long count = marks.stream().filter(el -> el<=35).count();

        System.out.println("Number of failed students: "+count);
    }
}
