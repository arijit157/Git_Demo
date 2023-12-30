@FunctionalInterface
interface FunctionInterface{
    public void display1();
    public void display2();
}


class MyClass implements FunctionInterface {
        public void display1(){
            System.out.println("display1");
        }
        public void display2(){
            System.out.println("display2");
        }
}

class Annotation2{
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.display1();
        obj.display2();
    }
}