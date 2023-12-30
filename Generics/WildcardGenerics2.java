package Generics;

import java.util.Arrays;
import java.util.List;

public class WildcardGenerics2 {
    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(1,2,3,4,5,6);

        method(list1);

        List<Double> list2=Arrays.asList(12.3,45.6,78.2);

        method(list2);

        List<String> list3=Arrays.asList("Arijit", "Saurabh", "Raktim");

        method(list3);  //because String is not a subclass of Number
    }

    public static void method(List<? extends Number> list){
        System.out.println(list);
    }
    
}
