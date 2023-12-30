import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(25);
        al.add(30);
        System.out.println(al);
        System.out.println(al.size());  //returns the length of the array
        al.add(1, 45);
        System.out.println(al);

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(56);
        al2.add(89);
        al2.add(67);

        al.addAll(al2);   //to merge one array with the other
        System.out.println(al);

        System.out.println(al.get(3));  //similar to al[3]
        System.out.println(al2.get(2)); //similar to al2[2]

        al.remove(2);  //removes 25 from the array
        System.out.println("After removal: "+al);

        al.remove(Integer.valueOf(56));   //removes the specified element
        System.out.println("After second removal: "+al);

        // al.clear(); //delete all the elements from the array
        // System.out.println(al);

        al.set(2, 60);  //to update an element of the given index 
        System.out.println(al);

        System.out.println(al.contains(57));  //checks whether an element is present or not into an array

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));   //traversing all elements
        }

        for(Integer el: al){
            System.out.println(el);  //for-each loop
        }
    }
}
