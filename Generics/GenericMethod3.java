package Generics;

public class GenericMethod3 {
    public static void main(String args[]){
        int ans=method1(25);
        System.out.println(ans);
    }

    public static <T> T method1(T val){
        return val;
    }
}
