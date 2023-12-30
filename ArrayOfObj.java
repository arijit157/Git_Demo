import java.util.Scanner;
class Student{
    String name;
    int roll;
    int age;
    String dept;

    public Student(String name, int roll, int age, String dept){
        this.name=name;
        this.roll=roll;
        this.age=age;
        this.dept=dept;
    }
}

public class ArrayOfObj {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student arr[]=new Student[2];   //array of object

        arr[0]=new Student("Arijit Bhakta", 11, 22, "CSE");
        arr[1]=new Student("Raktim Karmakar", 12, 23, "CST");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].name+" "+arr[i].roll+" "+arr[i].age+" "+arr[i].dept);
        }
        sc.close();
    }
}
