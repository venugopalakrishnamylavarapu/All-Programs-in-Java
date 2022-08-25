public class MultiThread1 extends Thread {
    //extendded thread class
    public void run()
    {
        for (int i = 0; i<10 ; i++) {
            System.out.println("Thread 2 value is :"+i);
            try {
                Thread.sleep(1000);        //here loop will get delay for a second(1000ms) and then loops again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1 is completed,lessggoooo!!!");
    }
}
