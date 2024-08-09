import java.util.Scanner;
class cls1
{
    void add(int p,int q)
    {
        System.out.println(p+q);
    }
}
public class W03_P2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    
        cls2 obj=new cls2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        //String tilde=sc.next();
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
    
    }
}
//Create subclass cls2 of cls1 which perform task of multiplication and sum of squares of passing two parameters.
class cls2 extends cls1{
	void add(int a,int b){
  		int sum=a+b;
    	System.out.println(sum);
  }
  void mul(int a,int b){
  		int m=a*b;
    	System.out.println(m);
  }
  void task(int a,int b){
  		int t=a*a+b*b;
    	System.out.println(t);
  }
}
