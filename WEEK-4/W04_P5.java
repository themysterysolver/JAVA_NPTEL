import java.util.Scanner;

public class W04_P5{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            if (n >= 0) {
                while (n >= 0) {
                    if (n % 2 == 0 && n % 3 == 0) {
                    sum += n;
                    }
                    n--;
                }
    }System.out.print("Sum: "+sum);
            sc.close();
    }
}