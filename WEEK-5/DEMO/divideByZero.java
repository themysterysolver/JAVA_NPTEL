class divideByZero{
    static int divide(int a,int b){
        try{
            int c=a/b;
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println("divisor is zero!");
            return 0;
        }
    }
    public static void main(String[] args){
        int c=divide(25,0);
        System.out.println("The ans is "+c);
    }
}