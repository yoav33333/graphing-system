import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class MyFrame extends Frame{

    public MyFrame(){
        runFrame();

    }

    private void runFrame(){
        setTitle("Graphing system");

        setVisible(true);

        setBounds(0, 0, 1920, 1080);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }

}
