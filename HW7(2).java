import java.util.Timer;
import java.util.TimerTask;

class Helper extends TimerTask
{
    public static int i = 0;
    public void run()
    {
        System.out.println("Malik's Timer ran " + ++i);
    }
}
  
class Test
{
    public static void main(String[] args)
    {
          
        Timer timer = new Timer();
        TimerTask task = new Helper();
          
        timer.schedule(task, 2000, 3000);
          
    }
}
