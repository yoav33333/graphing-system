import java.awt.*;
import java.util.ArrayList;

public class Circle {

    int RadiosX;
    int RadiosY;
    public Circle(int posX, int posY, double Radios, Graphics graphics) {
        // this.graphics = graphics;

        paint(graphics, posX, posY, Radios);
    }

    public void paint(Graphics graphics, int x, int y, double radios) {

        FullCircle(graphics, x, y, radios);

    }

    public void CreateCircle(Graphics graphics, int x, int y, double radios){
        for (int i = 0; i< radios*2; i++) {
            RadiosX = (int) (x+radios-i);
            RadiosY = (int)Math.round(Math.sqrt(radios * radios - (x - RadiosX)*(x - RadiosX)) + y);
            graphics.drawRect(RadiosX, RadiosY, 1, 1);
            RadiosX = (int) (x+radios-i);
            RadiosY = (int)Math.round(-Math.sqrt(radios * radios - (x - RadiosX)*(x - RadiosX)) + y);
            graphics.drawRect(RadiosX, RadiosY, 1, 1);
            RadiosY = (int) (y+radios-i);
            RadiosX = (int)Math.round(Math.sqrt(radios * radios - (y - RadiosY)*(y - RadiosY)) + x);;
            graphics.drawRect(RadiosX, RadiosY, 1, 1);
            RadiosY = (int) (y+radios-i);
            RadiosX = (int)Math.round(-Math.sqrt(radios * radios - (y - RadiosY)*(y - RadiosY)) + x);;
            graphics.drawRect(RadiosX, RadiosY, 1, 1);
        }
    }
    public void FullCircle(Graphics graphics, int x, int y, double radios){
        for (int i = 0; i<radios; i++) {
            CreateCircle(graphics, x, y, radios-i);
        }
    }
}
