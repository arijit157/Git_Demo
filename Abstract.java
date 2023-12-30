abstract class A{
    void method1(){
        System.out.println("I'm in method1");
    }

    abstract void method2();
}

public class Abstract extends A{
    void method2(){
        System.out.println("I'm in method2");
    }
    public static void main(String args[]){
        Abstract abs=new Abstract();
        abs.method1();   //calls the abstract class method
        abs.method2();
    }
}
