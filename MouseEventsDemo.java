
//26


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends JFrame implements MouseListener, MouseMotionListener {

    private JLabel label;

    public MouseEventsDemo() {
        setTitle("Mouse Events Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("No mouse event");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        addMouseListener(this);
        addMouseMotionListener(this);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged");
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseEventsDemo::new);
    }
}
