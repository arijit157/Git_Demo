import java.util.HashSet;

public class SetRemoveAll {
    public static void main(String[] args){
        HashSet<Integer> mySet1=new HashSet<>();

        mySet1.add(10);
        mySet1.add(20);
        mySet1.add(35);
        mySet1.add(59);

        HashSet<Integer> mySet2=new HashSet<>();

        mySet2.add(26);
        mySet2.add(20);
        mySet2.add(10);
        mySet2.add(67);

        mySet1.removeAll(mySet2);

        System.out.println(mySet1);
    }
}