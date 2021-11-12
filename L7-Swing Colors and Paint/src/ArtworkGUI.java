import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    JFrame frame;

    //DECLARE VARIABLES

    public ArtworkGUI(){

        frame = new JFrame("Literly just a square");
        frame.setSize(360, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
        //CREATE THE GUI
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            setBackground(Color.BLUE);
            //Set the background color
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.fillRect(50, 50, 160, 520);
            g.setColor(Color.WHITE);

            g.drawRect(50, 50,160, 540);
            g.setColor(Color.BLACK);


        }
    }
}
