package LW_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {

    // Components
    private Container container;
    private JLabel title, nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel, resultLabel;
    private JTextField nameField, mobileField;
    private JRadioButton male, female;
    private ButtonGroup genderGroup;
    private JComboBox<String> dateBox, monthBox, yearBox;
    private JTextArea addressArea, outputArea;
    private JCheckBox terms;
    private JButton submitButton, resetButton;

    // Constructor
    public RegistrationForm() {
        setTitle("Registration Form");
        setBounds(300, 90, 700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        // Title
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setSize(300, 30);
        title.setLocation(250, 30);
        container.add(title);

        // Name Label
        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel.setSize(100, 20);
        nameLabel.setLocation(100, 100);
        container.add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameField.setSize(190, 20);
        nameField.setLocation(200, 100);
        container.add(nameField);

        // Mobile Label
        mobileLabel = new JLabel("Mobile");
        mobileLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileLabel.setSize(100, 20);
        mobileLabel.setLocation(100, 150);
        container.add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileField.setSize(150, 20);
        mobileField.setLocation(200, 150);
        container.add(mobileField);

        // Gender Label
        genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        genderLabel.setSize(100, 20);
        genderLabel.setLocation(100, 200);
        container.add(genderLabel);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        container.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        container.add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // DOB Label
        dobLabel = new JLabel("DOB");
        dobLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        dobLabel.setSize(100, 20);
        dobLabel.setLocation(100, 250);
        container.add(dobLabel);

        String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String years[] = { "1990", "1991", "1992", "1993", "1994", "1995",
                "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" };

        dateBox = new JComboBox<>(dates);
        dateBox.setFont(new Font("Arial", Font.PLAIN, 15));
        dateBox.setSize(50, 20);
        dateBox.setLocation(200, 250);
        container.add(dateBox);

        monthBox = new JComboBox<>(months);
        monthBox.setFont(new Font("Arial", Font.PLAIN, 15));
        monthBox.setSize(60, 20);
        monthBox.setLocation(250, 250);
        container.add(monthBox);

        yearBox = new JComboBox<>(years);
        yearBox.setFont(new Font("Arial", Font.PLAIN, 15));
        yearBox.setSize(60, 20);
        yearBox.setLocation(320, 250);
        container.add(yearBox);

        // Address Label
        addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        addressLabel.setSize(100, 20);
        addressLabel.setLocation(100, 300);
        container.add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setFont(new Font("Arial", Font.PLAIN, 15));
        addressArea.setSize(200, 75);
        addressArea.setLocation(200, 300);
        addressArea.setLineWrap(true);
        container.add(addressArea);

        // Terms Checkbox
        terms = new JCheckBox("Accept Terms And Conditions.");
        terms.setFont(new Font("Arial", Font.PLAIN, 15));
        terms.setSize(250, 20);
        terms.setLocation(150, 400);
        container.add(terms);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setSize(100, 20);
        submitButton.setLocation(150, 430);
        submitButton.addActionListener(this);
        container.add(submitButton);

        // Reset Button
        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15));
        resetButton.setSize(100, 20);
        resetButton.setLocation(270, 430);
        resetButton.addActionListener(this);
        container.add(resetButton);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setFont(new Font("Arial", Font.PLAIN, 15));
        outputArea.setSize(250, 200);
        outputArea.setLocation(450, 100);
        outputArea.setLineWrap(true);
        outputArea.setEditable(false);
        container.add(outputArea);

        // Result Label
        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        resultLabel.setSize(500, 25);
        resultLabel.setLocation(100, 460);
        container.add(resultLabel);

        setVisible(true);
    }

    // Action Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            if (terms.isSelected()) {
                String data1 = "Name : " + nameField.getText() + "\n"
                        + "Mobile : " + mobileField.getText() + "\n";
                String data2 = "Gender : "
                        + (male.isSelected() ? "Male" : "Female") + "\n";
                String data3 = "DOB : "
                        + (String) dateBox.getSelectedItem() + "/"
                        + (String) monthBox.getSelectedItem() + "/"
                        + (String) yearBox.getSelectedItem() + "\n";
                String data4 = "Address : " + addressArea.getText() + "\n";

                outputArea.setText(data1 + data2 + data3 + data4);
                resultLabel.setText("Registration Successfully..");
            } else {
                outputArea.setText("");
                resultLabel.setText("Please accept the terms & conditions!");
            }
        } else if (e.getSource() == resetButton) {
            String def = "";
            nameField.setText(def);
            mobileField.setText(def);
            addressArea.setText(def);
            resultLabel.setText(def);
            outputArea.setText(def);
            terms.setSelected(false);
            dateBox.setSelectedIndex(0);
            monthBox.setSelectedIndex(0);
            yearBox.setSelectedIndex(0);
            male.setSelected(true);
        }
    }


}
