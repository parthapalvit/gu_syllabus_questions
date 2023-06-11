//30


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PushButtonDemo extends JFrame {

    private JLabel label;

    public PushButtonDemo() {
        setTitle("Push Button Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("No button clicked");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 1 clicked");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 2 clicked");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PushButtonDemo::new);
    }
}
