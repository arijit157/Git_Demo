package Generics;

public class GenericMethod {
    public static void main(String args[]){
        shout(123);
        shout("Hey there");
        shout(true);
    }

    public static <T> void shout(T val){
        System.out.println(val+"!!!");
    }
}
