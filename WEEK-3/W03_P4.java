import java.util.*;

public class W03_P4{
    public static void main(String[] args) {
        String choice = "";
        Scanner input = new Scanner(System.in);int sum=0,product=1,count=0;
        while(true){
            String a=input.nextLine();
            if(a.charAt(0)=='q'){
            break;
            }
            int b=Integer.parseInt(a);
            sum+=b;
            count++;
            product*=b;
            
        }
        float avg=(float)sum/count; 
        System.out.println("Product is: "+product);
        System.out.println("Average is: "+avg);
    }
}