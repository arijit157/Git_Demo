class MyCustomException extends Exception{
    public MyCustomException(String message){
        super(message);
    }
}

public class Exception5{
    public static void main(String[] args){
        int a=99;
        try {
            if(a==99){
                throw new MyCustomException("I am a custom exception");
            }
            else{
                System.out.println("I am inside of an else block");
            }
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
    }
}