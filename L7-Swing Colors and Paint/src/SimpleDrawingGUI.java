import javax.swing.*;
import java.awt.*;

public class SimpleDrawingGUI {

    JFrame frame;

    public SimpleDrawingGUI(){
        frame = new JFrame("Simple Drawing");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new DrawingPanel();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class DrawingPanel extends JPanel{

        //Constructor for the class
        public DrawingPanel(){
            //set the Background color
            setBackground(Color.GREEN);

        }
        public void paintComponent (Graphics g){
            super.paintComponent(g);
            g.fillRect(50, 50, 200, 100);
            g.setColor(Color.BLACK;

            g.setColor(Color.MAGENTA);
            g.drawRect(150, 100, 100, 200);

            g.setColor(Color.WHITE);
            g.drawLine(0,0, 400, 600);
        }
    }
}
