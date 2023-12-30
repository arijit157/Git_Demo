class Person{
    private int age=26;
    void showAge(){
        System.out.println(age);
    }
}

public class DataHiding {
    public static void main(String[] args){
        Person p1=new Person();
        System.out.println(p1.age);   //ERROR: age has private access
        p1.showAge();
    }
}
