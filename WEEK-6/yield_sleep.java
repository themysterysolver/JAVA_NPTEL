//yields stops until next thread executes!!
class thread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" is running!!!-->yield");
            Thread.yield();
        }
    }
}
class thread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                System.out.println(Thread.currentThread().getName()+" is running--->sleep(5k)");
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                System.out.println("thread interrupted");
            }
        }
    }

}
class yield_sleep{
    public static void main(String[] args){
        thread t1=new thread();
        thread1 t2=new thread1();
        t1.start();
        t2.start();
    }
}
/*Execution Flow:
When the program starts, both threads are started nearly simultaneously.

Thread-0 starts executing and prints:

Thread-0 is running!!!-->yield
Then it calls Thread.yield(). After yielding, the thread pauses and allows Thread-1 a chance to run (if the scheduler decides to let it).

Thread-1 starts and prints:

Thread-1 is running--->sleep(5k)
Then it calls Thread.sleep(5000), which causes it to sleep for 5 seconds.

Now, Thread-0 has yielded, but since Thread-1 is sleeping for 5 seconds, the scheduler switches back to Thread-0 because there's nothing else to run. It resumes execution and prints more messages:

Thread-0 is running!!!-->yield
Thread-0 is running!!!-->yield
Thread-0 is running!!!-->yield
Thread-0 is running!!!-->yield
Each time, it calls Thread.yield(), but Thread-1 is still sleeping, so Thread-0 continues executing until its loop ends.

After 5 seconds, Thread-1 wakes up from sleep(5000) and resumes execution. It prints:

Thread-1 is running--->sleep(5k)
Then it sleeps again for another 5 seconds.

This pattern continues, with Thread-1 running every 5 seconds, while Thread-0 has already completed its execution by the time Thread-1 finishes all of its sleep cycles. */