public class MutliThread {
    //used MultiThread1 and MyRunnable
    //here we can observe that the 2 threads run independently if one thread stops because of error the other one continues without stop the process
    public static void main(String[] args) throws InterruptedException {
    MultiThread1 thread1=new MultiThread1();
        MyRunnable runnable=new MyRunnable();
        Thread thread2=new Thread(runnable);

     thread1.start();
//     thread1.join();        // basically it starts executing the second thread only after thread 1 is done executing totally
     thread2.start();
    }
}
