class Operations{
    public static void main(String[] args){
        String opArr[]={"++X","++X","X--"};
        int val=finalValueAfterOperations(opArr);
        System.out.println(val);
    }

    public static int finalValueAfterOperations(String operations[]){
        int x=0;

        for(int i=0; i<operations.length; i++){
            if(operations[i]=="++X" || operations[i]=="X++"){
                x=x+1;
            }
            else{
                x=x-1;
            }
        }
        return x;
    }
}