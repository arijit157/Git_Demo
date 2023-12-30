package stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args){
        List<Integer> list1=new ArrayList<Integer>();
        Predicate<? super Integer> p=(item) -> item%2==0;
        List<Integer> list2=list1.stream().filter(p).collect(Collectors.toList());
        list2.forEach(el -> System.out.println(el));
    }
}
