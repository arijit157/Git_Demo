class Throw{
    public static void func(){
        throw new ArithmeticException("Divided by zero");  //explicitely throwing an exception using throw keyword
    }
    public static void main(String[] args){
        try {
            func();
        } catch (Exception e) {
            System.out.println(e.getMessage());  
        }
    }
}