class thread extends Thread{
    public void run(){
        try{
            System.out.println("Thread:"+Thread.currentThread().getId());
        }
        catch(Exception e){
            System.out.println("Exception is caught!");
        }
    }
} 
public class id{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            thread a=new thread();
            a.start();
        }
    }
}