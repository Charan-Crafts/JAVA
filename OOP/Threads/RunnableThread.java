
class Thread1 implements Runnable{

    @Override
    public void run(){

        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}


public class RunnableThread {
    public static void main(String[] args) {
        
        Thread1 t1 = new Thread1();
        Thread thread = new Thread(t1);
        thread.start();

        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
