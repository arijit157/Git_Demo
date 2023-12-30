package Generics;

public class GenericMethod2 {
    public static void main(String args[]){
        shout("John", 45.5f);
    }

    public static <T, V> void shout(T val1, V val2){
        System.out.println(val1+"!!!");
        System.out.println(val2+"!!!");
    }
}
