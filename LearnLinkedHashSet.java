import java.util.Iterator;
import java.util.LinkedHashSet;

public class LearnLinkedHashSet {
    public static void main(String[] args){
        LinkedHashSet<Integer> mySet1=new LinkedHashSet<>();
        mySet1.add(10);
        mySet1.add(25);
        mySet1.add(45);
        mySet1.add(62);

        LinkedHashSet<Integer> mySet2=new LinkedHashSet<>();
        mySet2.add(20);
        mySet2.add(10);
        mySet2.add(25);
        mySet2.add(69);
        mySet2.add(30);
        mySet2.add(85);

        mySet1.addAll(mySet2);   //union

        System.out.println("union: "+mySet1);

        System.out.println( mySet1.retainAll(mySet2));   //intersection

        System.out.println(mySet2.containsAll(mySet1));   //subset

        mySet1.removeAll(mySet2);   //set difference

        System.out.println(mySet1);   

        mySet2.remove(69);

        System.out.println(mySet2);

        Iterator<Integer> iterate=mySet1.iterator();

        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println(mySet2.size());

        mySet2.clear();

        System.out.println(mySet2);
    }
}
