interface AnoDemo{
    public void meth1();
    public void meth2();
}

public class AnonymousClass1{

    /**
     * This is the main method
     * @param args An array of strings
     */
    public static void main(String[] args){
        AnoDemo ad=new AnoDemo() {
            @Override
            public void meth1(){
                System.out.println("I am inside of meth1()");
            }

            @Override
            public void meth2(){
                System.out.println("I am inside of meth2()");
            }
        };

        ad.meth1();
        ad.meth2();
    }
}
