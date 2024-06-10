package stream_API;

import java.util.Arrays;

public class ArrayToStream {
    public static void main(String[] args){
        int arr[]=new int[] {10,20,30,40,50,60,70};

        Arrays.stream(arr).forEach(el -> System.out.println(el));
    }
}
