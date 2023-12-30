class Annotation1{
    /**
   * @deprecated
   * This method is deprecated and a compliment of this will be released soon
   */

    @Deprecated
    void deprecatedMethod(){
        System.out.println("This is a deprecated method");
    }

    @SuppressWarnings("deprecated")
    public static void main(String[] args){
        Annotation1 ant=new Annotation1();
        ant.deprecatedMethod();
    }
}