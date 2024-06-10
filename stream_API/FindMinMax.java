package stream_API;

import java.util.ArrayList;
import java.util.List;

public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(80);
        list.add(7);
        list.add(50);
            
        int minElement = list.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        int maxElement = list.stream().max((o1, o2) -> o1.compareTo(o2)).get();

        System.out.println(minElement);
        System.out.println(maxElement);
    }
}
