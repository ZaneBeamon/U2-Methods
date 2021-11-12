import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class ColorSwitchGUI {
    JFrame window;
    JPanel panel;
    JButton colorthemeDark;
    JButton colorthemePrimary;
    JButton colorthemeWarren;

    //Declare your frame, panel and three buttons.
    public ColorSwitchGUI() {
        window = new JFrame("color changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);


        colorthemeDark.addActionListener(new ThemeDark());
        colorthemePrimary.addActionListener(new ThemePrimary());
        colorthemeWarren.addActionListener(new ThemeWarren());

        panel.add(colorthemeDark);
        panel.add(colorthemePrimary);
        panel.add(colorthemeWarren);

        window.add(panel);
        window.setVisible(true);

        private class ThemeDark implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Color darkPanel = new Color(9, 8, 8);
                Color darkButton = new Color(48, 197, 2);
                Color darkText = new Color(216, 233, 168);

                colorthemeDark.setBackground(darkButton);
                colorthemeDark.setForeground(darkText);
                colorthemeWarren.setBackground(darkButton);
                colorthemeWarren.setForeground(darkText);
                colorthemePrimary.setBackground(darkButton);
                colorthemePrimary.setForeground(darkText);
                panel.setBackground(darkPanel);

            }
        }
        private class ThemePrimary implements ActionListener{
            @Override
            public void actionPerformed (ActionEvent actionEvent){



                colorthemePrimary.setBackground(Color.magenta);
                colorthemePrimary.setBackground(Color.white);
                colorthemeWarren.setBackground(Color.MAGENTA);
                colorthemeWarren.setForeground(Color.MAGENTA);
                colorthemeDark.setBackground(Color.WHITE);
                colorthemeDark.setForeground(Color.MAGENTA);


            }

        }
        private class ThemeWarren implements ActionListener{
            @Override
            public void actionPerformed (ActionEvent actionEvent){

                Color WarrenPanel = new Color(23, 5, 12);
                Color WarrenButton = new Color(49, 8, 234);
                Color WarrenText = new Color(255,255,255);

                colorthemeWarren.setBackground(WarrenButton);
                colorthemeWarren.setForeground(WarrenText);
                colorthemePrimary.setBackground(WarrenButton);
                colorthemePrimary.setForeground(WarrenText);
                colorthemeDark.setBackground(WarrenButton);
                colorthemeDark.setForeground(WarrenText);
                panel.setBackground(WarrenPanel);
            }
        }

    }
    //add listeners to change the colors. Don't forget to link them to buttons.
}
