import java.util.NavigableSet;
import java.util.TreeSet;

public class LearnNavigableSet {
    public static void main(String[] args){
        NavigableSet<Integer> mySet=new TreeSet<>();

        mySet.add(20);
        mySet.add(10);
        mySet.add(69);
        mySet.add(35);
        mySet.add(12);
        mySet.add(75);

        System.out.println(mySet);

        System.out.println(mySet.headSet(69));

        System.out.println(mySet.tailSet(69));

        System.out.println(mySet.subSet(20, 69));

        System.out.println(mySet.subSet(20, false, 69, false));

        System.out.println(mySet.subSet(20, false, 69, true));

        System.out.println(mySet.ceiling(35));

        System.out.println(mySet.higher(35));

        System.out.println(mySet.floor(35));

        System.out.println(mySet.lower(35));

        System.out.println(mySet.descendingSet());

        mySet.pollFirst();

        System.out.println(mySet);

        mySet.pollLast();

        System.out.println(mySet);

        System.out.println(mySet.first());

        System.out.println(mySet.last());
    }
}