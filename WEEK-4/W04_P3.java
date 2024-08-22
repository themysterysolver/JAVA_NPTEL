import java.util.Scanner;
class QuestionScope {
    int sum(int a,int b){
	return a+b;
}
static int multiply(int a,int b){
	return a*b;
}
}
public class W04_P3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0, prod = 0;
        QuestionScope st = new QuestionScope(); 
                                             
        sum = st.sum(n1, n2);
        prod = QuestionScope.multiply(n1, n2);  
                                        
        System.out.println("Sum: "+sum);
        System.out.print("Product: "+prod);
        sc.close();
    }
}
