/*A GUI that asks user to enter two number and then displays the sum when a button is clicked*/
//Name:Diya Manandhar
import javax.swing.*;
import java.awt.event.*;

public class SimpleSum {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Two Numbers");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton addButton = new JButton("Add");
        JLabel result = new JLabel("Result:");

        num1.setBounds(50, 30, 100, 25);
        num2.setBounds(50, 70, 100, 25);
        addButton.setBounds(50, 110, 100, 30);
        result.setBounds(50, 150, 200, 25);

        frame.add(num1);
        frame.add(num2);
        frame.add(addButton);
        frame.add(result);

        frame.setSize(250, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    int sum = n1 + n2;
                    result.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    result.setText("Enter valid numbers!");
                }
            }
        });
    }
}
