package stream_API;

import java.util.ArrayList;
import java.util.List;

public class StreamSorted4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(80);
        list.add(70);
        list.add(50);

        list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).forEach(System.out::println);

        // list.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(System.out::println);   //same output as above
    }
}
