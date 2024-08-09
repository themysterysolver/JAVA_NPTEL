import java.util.Scanner;
class W03_P3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.print(factorial(x));   
  }
  static int factorial(int n){
        if(n<=1){
            return 1;
        }
        
        else{
            return n*factorial(n-1);
        }
    }
}

