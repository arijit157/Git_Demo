package stream_API;

import java.util.Arrays;
import java.util.List;

public class ConstructorReference {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(25, 59, 47, 89, 20);

        Integer[] array = list.stream().toArray(Integer[]::new);   //int arr[]=new int[10]

        System.out.println(array[3]);
    }
}
