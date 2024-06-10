import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<Student2>();

        students.add(new Student2("Arijit Bhakta", 11, 23, "CSE"));
        students.add(new Student2("Saurabh Kumar", 25, 22, "ECE"));
        students.add(new Student2("Raktim Karmakar", 5, 20, "EE"));
        students.add(new Student2("Ramesh Agarwal", 20, 23, "ME"));

        Collections.sort(students);
    }
}
