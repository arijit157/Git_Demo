import java.util.*;

public class ComparatorDemo1 {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(20,40,10,30,60,50);
        
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return o2.compareTo(o1);
            }
        };

        Collections.sort(list, comp);
        System.out.println(list);
    }
}
