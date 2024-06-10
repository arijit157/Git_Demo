package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 25, 36, 49, 13, 58);

        List<Integer> list2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        list2.forEach(el -> System.out.println(el));
    }
}
