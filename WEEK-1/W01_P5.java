import java.util.Scanner;

public class W01_P5 {
    public static void main(String args[]) {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();
        quot = dec_num;while(quot!=0){
        if(quot%2==0){
            bin_num[i]=0;
        }
        if(quot%2==1){
            bin_num[i]=1;
        }
        i++;
        quot=Math.round(quot/2);
        }
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}