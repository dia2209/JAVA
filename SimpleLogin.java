/*Create a simple login form using Swing (if username =”admin” & password = 123, show successful)*/
//Name:Diya Manandhar
import javax.swing.*;
import java.awt.event.*;

public class SimpleLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");

        userLabel.setBounds(30, 30, 80, 25);
        userField.setBounds(120, 30, 100, 25);

        passLabel.setBounds(30, 70, 80, 25);
        passField.setBounds(120, 70, 100, 25);

        loginButton.setBounds(80, 110, 100, 30);

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.equals("admin") && password.equals("123")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials!");
                }
            }
        });
    }
}
