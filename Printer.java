// public class Printer<T> {
public class Printer<T extends Car> {
    T car;

    public Printer(T car){
        this.car=car;
    }

    public void print(){
        System.out.println(car.toString());
    }
}
