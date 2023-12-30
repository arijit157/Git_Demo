interface Polygon{
    void getArea(int length, int breadth);  //similar to an abstract method

    //we can also define a method in interface, such methods are called default methods
    default void getSides(){
        System.out.println("I can get the sides of polygon");
    }
}

class Rectangle implements Polygon{
    public void getArea(int length, int breadth){
        System.out.println("Area: "+(length*breadth));
    }
}

class Main{
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.getArea(20, 5);
        r.getSides();
    }
}