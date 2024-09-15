class thread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("THREAD1 SAYS"+i);
        }
        System.out.println("THREAD-1 got completed");
    }
}
class thread2 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("THREAD2 SAYS"+(-i));
        }
        System.out.println("THREAD-2 got completed");
    }
}
class thread3 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("THREAD3 SAYS"+(i+100));
        }
        System.out.println("THREAD-3 got completed");
    }
}
class thread_1{
    public static void main(String[] args){
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3=new thread3();
        /*t1.run();
        t2.run();
        t3.run();*/
        System.out.println("------------------");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("MAIN METHOD!");
    }
}