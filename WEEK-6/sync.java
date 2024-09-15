class Counter{
    private int count=0;
    public synchronized void increment(){ //comment synchronized
        count++;
    }
    public int getCount(){
        return count;
    }
}
class cthread extends Thread{
    private Counter counter;
    public cthread(Counter counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=0;i<10000;i++){
            counter.increment();
        }
    }
}
class sync{
    public static void main(String[] args){
        Counter c=new Counter();//shared common counter!
        //these threads increments the same counter!!
        Thread t1=new cthread(c);
        Thread t2=new cthread(c);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(c.getCount());
    }
}