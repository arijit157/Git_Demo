import java.util.*;

public class ComparatorDemo2 {
    public static void main(String[] args){
        List<Student2> students = new ArrayList<>();

        students.add(new Student2("Arijit Bhakta", 11, 23, "CSE"));
        students.add(new Student2("Saurabh Kumar", 25, 22, "ECE"));
        students.add(new Student2("Raktim Karmakar", 5, 20, "EE"));
        students.add(new Student2("Ramesh Agarwal", 20, 23, "ME"));

        Comparator<Student2> comp = new Comparator<Student2>() {

            @Override
            public int compare(Student2 o1, Student2 o2) {
                if(o1.getAge() < o2.getAge()){
                    return -1;
                }
                else if(o1.getAge() > o2.getAge()){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            
        };

        Collection.sort(students,comp);

        System.out.println(students);
    }
}
