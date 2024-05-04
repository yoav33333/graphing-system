import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DrawFrame extends MyFrame{
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    Main.GraphType type;
    Circle circle;
    PATH path;
    HashMap<Integer, int[]> TimeToXY = new HashMap<Integer, int[]>();
    int Radios;
    int posX;
    int posY;
    LINE line;
    public DrawFrame(Main.GraphType type, ArrayList<Integer> posX, ArrayList<Integer> posY) {
        x = posX;
        y = posY;
        this.type = type;
    }
    public DrawFrame(Main.GraphType type, int posX, int posY, int Radios) {
        this.posX = posX;
        this.posY = posY;
        this.type = type;
        this.Radios = Radios;
    }
    public DrawFrame(Main.GraphType type, HashMap<Integer, int[]> TimeToXY) {
        this.type = type;
        this.TimeToXY = TimeToXY;
    }

    @Override
    public void paint(Graphics g) {
        switch (type){
            case Line -> line = new LINE(x, y, g);
            case circle -> circle = new Circle(posX, posY, Radios, g);
            case PATH -> {
                try {
                    path = new PATH(TimeToXY, g);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
