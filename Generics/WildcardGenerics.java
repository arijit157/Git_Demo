package Generics;

import java.util.Arrays;
import java.util.List;

public class WildcardGenerics {
    public static void main(String args[]){
        List<Integer> list1=Arrays.asList(1,2,3,4,5,6);

        method(list1);

        List<Double> list2=Arrays.asList(12.3,45.6,78.2);

        method(list2);
    }

    public static void method(List<?> list){
        System.out.println(list);
    }
}
