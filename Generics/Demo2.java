package Generics;


class Container2<T extends Number> {
    T value;

    public Container2() {
        //
    }

    public Container2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class Demo2 {
    public static void main(String args[]) {
        Container2<Float> c1 = new Container2<Float>(25.78f);

        System.out.println(c1.value);
    }
}
