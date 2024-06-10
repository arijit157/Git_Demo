public class GenericDemo1 {
    public static void main(String[] args){
        printValue(20);
        printValue("Java");
        printValue(20.5f);

        System.out.println(returnSomeThing(58));
        System.out.println(returnSomeThing("JavaScript"));

        Printer<Audi> obj1 = new Printer<Audi>(new Audi(4, 4, "Q3 Sportback", 2000000));
        obj1.print();

        Printer<Car> obj2 = new Printer<Car>(new Car(4, 2));
        obj2.print();

        Printer<Ford> obj3 = new Printer<Ford>(new Ford(4, 2, "Mustang", 1500000));
        obj3.print();
    }

    public static <T> void printValue(T value){
        System.out.println(value);
    }

    public static <T> T returnSomeThing(T value){
        return value;
    }
}
