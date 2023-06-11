//29

import javax.swing.*;
import java.awt.*;

public class WindowWithoutApplet {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Window Without Applet");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);
                frame.setVisible(true);
            }
        });
    }
}
