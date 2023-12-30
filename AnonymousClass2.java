//implementing a functional interface using lambda expression

@FunctionalInterface
interface MyInterface{
    public void method1(int val);
}

public class AnonymousClass2 {
    public static void main(String args[]){
        MyInterface obj=(val)->{
            System.out.println("This is method1 "+val); 
        };

        // MyInterface obj=new MyInterface() {
        //     @Override
        //     public void method1(){
        //         System.out.println("This is method1");
        //     }
        // };

        obj.method1(6);
    }
}
