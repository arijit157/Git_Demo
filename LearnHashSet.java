import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {
    public static void main(String[] args){
        HashSet<Integer> mySet1=new HashSet<>();

        mySet1.add(10);
        mySet1.add(50);
        mySet1.add(45);
        mySet1.add(10);   //duplicate entry
        mySet1.add(20);
        // mySet1.add(35);
        // mySet1.add(86);

        System.out.println(mySet1);

        HashSet<Integer> mySet2=new HashSet<>();

        mySet2.add(56);
        mySet2.add(69);
        mySet2.add(35);
        mySet2.add(86);

        mySet1.addAll(mySet2);   //union operation
        System.out.println(mySet1);

        mySet1.retainAll(mySet2);   //intersection operation
        
        System.out.println(mySet1);    

        System.out.println(mySet1.containsAll(mySet2));    //subset operation

        mySet1.removeAll(mySet2);   //set difference

        System.out.println(mySet1);  

        mySet1.remove(45);   //to remove a specific element

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
