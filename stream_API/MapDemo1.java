package stream_API;

import java.util.ArrayList;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.stream().map(i -> i*2).forEach(i -> System.out.println(i));
    }
}
