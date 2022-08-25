import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAndTimerTask {
    public static void main(String[] args) {
        Timer timer=new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hammaya.... intha sepatiki cherukunna");
            }
        };
        timer.schedule(task,4000);          //it will take 4 seconds and after it get executes
        // this concept is also used in the making of countdown or stop watch;

    }
}
