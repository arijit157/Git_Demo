class Super{
    int x;
    Super(int x){
        this.x=x;
    }
    void display(){
        System.out.println("Super x = "+x);
    }
}

class Sub extends Super{
    int y;
    Sub(int x, int y){
        super(x);
        this.y=y;   //this -> refers to the object of this class (i.e. Sub)
    }
    void display(){  //overrides the super class method
        System.out.println("Super x = "+x);
        System.out.println("Sub y = "+y);
    }
}

public class OverrideTest {
    public static void main(String[] args){
        Sub s=new Sub(10, 20);
        s.display();
    }
}
