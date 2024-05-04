import java.awt.*;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TAKE_DATA{

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i<100; i++) {
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println("TimeToXY.put(" + i + ", new int[]{" + MouseInfo.getPointerInfo().getLocation().x+", "+ MouseInfo.getPointerInfo().getLocation().y + "});") ;
        }
    }
}
