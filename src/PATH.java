import java.awt.*;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class PATH {
    LINE line;
    HashMap<Integer, int[]> TimeToXY = new HashMap<Integer, int[]>();    public PATH(HashMap<Integer, int[]> TimeToXY, Graphics graphics) throws InterruptedException {
        this.TimeToXY = TimeToXY;
        paint(graphics);
    }

    public void paint(Graphics graphics) throws InterruptedException {
        CreatePoints(graphics);

    }

    public void CreatePoints(Graphics graphics) throws InterruptedException {
        int[] XY;
        int[] NXY;
        for (int i = 0; i<TimeToXY.size()-1; i++){
            XY = TimeToXY.get(i);
            NXY = TimeToXY.get(i+1);
            //graphics.drawRect(XY[0], XY[1], 1, 1);
            line = new LINE(XY[0], NXY[0],XY[1], NXY[1], graphics);
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
}
