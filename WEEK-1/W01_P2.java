import java.util.Scanner;
public class W01_P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        long n = input.nextLong();
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }
    static long sumDigits(long n){
        long sum=0;
        while(n!=0){
            long a=n%10;
            sum=sum+a;
            n=Math.round(n/10);
        }
        return sum;
    }
}