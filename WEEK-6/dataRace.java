class thread extends Thread{
    static int x;
    public void run(){
        for(int i=0;i<1000;i++){
            x=x+1;
            x=x-1;
        }
    }
} 
class dataRace{ 
    public static void main(String[] args){
        thread.x=0;
        for(int i=0;i<1000;i++){
            new thread().start();
            System.out.println(thread.x);
        }
    }
}