import java.awt.*;
import java.util.ArrayList;

public class LINE{

    Circle circle;
    ArrayList<Integer> x;
    ArrayList<Integer> y;
    int X;
    int Nx;
    int Y;
    int Ny;
    public LINE(ArrayList<Integer> posX, ArrayList<Integer> posY, Graphics graphics) {
       // this.graphics = graphics;
        x = posX;
        y = posY;
        paint(graphics);
    }
    public LINE(int X, int Nx, int Y,int Ny, Graphics graphics) {
        this.X = X;
        this.Nx = Nx;
        this.Y = Y;
        this.Ny = Ny;
        CreateLine(graphics, X, Nx, Y, Ny);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < x.size()-1; i++){

            CreateLine(g, x.get(i), x.get(i+1), y.get(i), y.get(i+1));
        }
        for (int i = 0; i < x.size()-1; i++){
            circle = new Circle(x.get(i),y.get(i),5.3,g);
        }


    }
    public void CreateLine(Graphics g, int X, int Nx, int Y, int Ny){
        double m = (double) (Y - Ny) /(X- Nx);
        double b = (double) Y-m*X;
        int x;
        int y;
        for (int i = 0; i< Math.abs(X-Nx); i++){
            x = X+i;
            g.drawRect(x, (int) (m*x+b), 1,1);
        }
        for (int i = 0; i< Math.abs(Y-Ny); i++) {
            y = Y + i;
            g.drawRect((int) ((y - b) / m), y, 1, 1);
        }
            circle = new Circle(X,Y,5.3,g);
    }
}
