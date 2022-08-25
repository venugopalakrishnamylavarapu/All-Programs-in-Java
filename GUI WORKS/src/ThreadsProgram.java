import java.util.Scanner;

import static java.lang.System.in;
//used MyThread class
public class ThreadsProgram {
    public static void main(String[] args) throws InterruptedException {        //exception is added
//        System.out.println(Thread.activeCount());       //to know how many threads are active
//        System.out.println(Thread.currentThread().getPriority());        //to know the default priority of the current thread.
//        Thread.currentThread().setPriority(10);         //to set the prority of the thread,basically it between 1-10.
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getName());      //to know the default name of the current thread
//        Thread.currentThread().setName("New Main");        //to set the name of the current thread
//        System.out.println(Thread.currentThread().getName());
//        System.out.println( Thread.currentThread().isAlive());      //to check the current thread is alive or not

        // lets create a counter by using thread
//        Scanner sc=new Scanner(in);
//        int n=sc.nextInt();
//        for (int i = n; i>0 ; i--) {
//            System.out.println(i);
//            Thread.sleep(10000);        //here loop will get delay for a second(1000ms) and then loops again
//        }
//        System.out.println("Happy New Year Mowa!!");

        MyThread thread1=new MyThread();
        System.out.println(thread1.isAlive()); // here we check if the thread is alive now or not
        System.out.println();       //see its returning false because we never called the methods in the thread or started the threaad
        System.out.println();
        thread1.start();        //we can either instantiate or start the thread here i started the thread
        //if we used the thread.run() it runs the thread and destroys itself after the call is done
        System.out.println(thread1.isAlive());      //Here we can say the thread is started
   }
}
