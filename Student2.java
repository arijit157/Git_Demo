// public class Student implements Comparable<Student>{
public class Student2 {
    private String name;
    private int roll;
    private int age;
    private String stream;

    public Student2(String name, int roll, int age, String stream) {
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.stream = stream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public int getRoll() {
        return roll;
    }

    public int getAge() {
        return age;
    }

    public String getStream() {
        return stream;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.roll + " " + this.stream;
    }

    // @Override
    // public int compareTo(Student that) {
    //     if (this.getAge() < that.getAge()) {
    //         return -1;
    //     } else if (this.getAge() > that.getAge()) {
    //         return 1;
    //     } else {
    //         return 0;
    //     }
    // }
}
