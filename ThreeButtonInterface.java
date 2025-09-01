import javax.swing.*;  // For JFrame, JButton
import java.awt.*;     // For layout
import java.awt.event.*; // For button events

public class ThreeButtonInterface {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Simple Interface");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());  // Simple layout manager

        // Create three buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Add action listeners to the buttons
        button1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button 1 clicked!"));
        button2.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button 2 clicked!"));
        button3.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button 3 clicked!"));                   

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Make the frame visible
        frame.setVisible(true);
    }
}
