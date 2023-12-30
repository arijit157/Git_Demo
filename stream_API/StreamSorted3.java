package stream_API;

import java.util.ArrayList;
import java.util.List;

public class StreamSorted3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0).forEach(System.out::println);
    }
}
