class thread implements Runnable{
    public void run(){
        try{
            System.out.println("Thread:"+Thread.currentThread().getName());
        }
        catch(Exception e){
            System.out.println("Exception is caught!");
        }
    }
} 
public class id1{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            Thread a=new Thread(new thread());
            a.start();
        }
    }
}