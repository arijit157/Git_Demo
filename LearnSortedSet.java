import java.util.SortedSet;
import java.util.TreeSet;

public class LearnSortedSet {
    public static void main(String[] args){
        SortedSet<Integer> mySet=new TreeSet<>();

        mySet.add(10);
        mySet.add(32);
        mySet.add(12);
        mySet.add(55);
        mySet.add(42);
        mySet.add(20);

        System.out.println(mySet);

        System.out.println(mySet.first());

        System.out.println(mySet.last());

        System.out.println(mySet.headSet(32));

        System.out.println(mySet.tailSet(32));

        System.out.println(mySet.subSet(20, 55));
    }
}
