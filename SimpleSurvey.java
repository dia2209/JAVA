/*Create a GUI for a basic survey. (On submitting show all details in a message Dialog box)*/
//Name:Diya Manandhar
import javax.swing.*;
import java.awt.event.*;

public class SimpleSurvey {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Survey Form");

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        String[] genders = {"Male", "Female", "Other"};
        JComboBox<String> genderBox = new JComboBox<>(genders);

        JLabel feedbackLabel = new JLabel("Feedback:");
        JTextArea feedbackArea = new JTextArea();

        JButton submitButton = new JButton("Submit");

        // Set positions
        nameLabel.setBounds(30, 20, 80, 25);
        nameField.setBounds(120, 20, 150, 25);

        ageLabel.setBounds(30, 60, 80, 25);
        ageField.setBounds(120, 60, 150, 25);

        genderLabel.setBounds(30, 100, 80, 25);
        genderBox.setBounds(120, 100, 150, 25);

        feedbackLabel.setBounds(30, 140, 80, 25);
        feedbackArea.setBounds(120, 140, 150, 60);

        submitButton.setBounds(100, 220, 100, 30);

        // Add to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(genderLabel);
        frame.add(genderBox);
        frame.add(feedbackLabel);
        frame.add(feedbackArea);
        frame.add(submitButton);

        frame.setSize(350, 320);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Action on Submit
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String gender = (String) genderBox.getSelectedItem();
                String feedback = feedbackArea.getText();

                String message = "Name: " + name +
                                 "\nAge: " + age +
                                 "\nGender: " + gender +
                                 "\nFeedback: " + feedback;

                JOptionPane.showMessageDialog(frame, message);
            }
        });
    }
}
