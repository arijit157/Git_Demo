import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args){
        Set<Integer> mySet1=new HashSet<>();

        mySet1.add(10);
        mySet1.add(50);
        mySet1.add(45);
        mySet1.add(10);   //duplicate entry
        mySet1.add(20);
        // mySet1.add(35);
        // mySet1.add(86);

        System.out.println(mySet1);

        Set<Integer> mySet2=new HashSet<>();

        mySet2.add(56);
        mySet2.add(69);
        mySet2.add(35);
        mySet2.add(86);

        mySet1.addAll(mySet2);   //union operation
        System.out.println(mySet1);

        mySet1.retainAll(mySet2);

        System.out.println(mySet1);    //intersection operation

        System.out.println(mySet1.containsAll(mySet2));    //subset operation

        mySet1.removeAll(mySet2);   //doubt

        System.out.println(mySet1);  

        mySet1.remove(45);

        System.out.println(mySet1);

        System.out.println(mySet1.contains(20));

        System.out.println(mySet1.hashCode());   //returns the address of a specific element

        // mySet2.clear();
        // System.out.println(mySet2);

        System.out.println(mySet2.size());

        Iterator<Integer> iterate=mySet2.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
}
