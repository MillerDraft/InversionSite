import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TradeMarket {
    private StockMarket wallStreet;
    private Timer timer;
    private TimerTask task;

    public void startSesion(StockMarket market){
        Random r = new Random();
        double random = (r.nextInt(21) - 10) / 10;


    }
}
