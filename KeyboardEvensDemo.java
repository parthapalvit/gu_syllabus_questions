
//27

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEventsDemo extends JFrame implements KeyListener {

    private JLabel label;

    public KeyboardEventsDemo() {
        setTitle("Keyboard Events Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("No keyboard event");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        addKeyListener(this);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        label.setText("Key Typed: " + c);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        String keyText = KeyEvent.getKeyText(keyCode);
        label.setText("Key Pressed: " + keyText);
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        String keyText = KeyEvent.getKeyText(keyCode);
        label.setText("Key Released: " + keyText);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(KeyboardEventsDemo::new);
    }
}
