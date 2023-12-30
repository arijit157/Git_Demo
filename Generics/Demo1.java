package Generics;

class Container<T>{
    T value;

    public Container(){
        //
    }

    public Container(T value){
        this.value=value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Container<String> c1=new Container<String>("Arijit Bhakta");

        System.out.println(c1.value);

        Container<Double> c2=new Container<Double>(25.5);

        c2.setValue(58.4);

        System.out.println(c2.value);
    }
}
