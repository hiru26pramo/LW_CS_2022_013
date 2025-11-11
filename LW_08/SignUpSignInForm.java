package LW_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpSignInForm extends JFrame implements ActionListener {

    // Declare components
    private Container c;
    private JLabel title, nameLabel, emailLabel, genderLabel, dobLabel, passLabel;
    private JTextField nameField, emailField, loginEmailField;
    private JPasswordField passField, loginPassField;
    private JRadioButton male, female;
    private ButtonGroup genderGroup;
    private JComboBox<String> dateBox, monthBox, yearBox;
    private JCheckBox robotCheck;
    private JButton signUpButton, signInButton1, signInButton2;

    // Constructor
    public SignUpSignInForm() {
        setTitle("Registration Form");
        setBounds(450, 100, 400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        // Title
        title = new JLabel("Sign Up");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(Color.BLUE);
        title.setSize(200, 30);
        title.setLocation(150, 20);
        c.add(title);

        // Name
        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel.setSize(100, 20);
        nameLabel.setLocation(50, 70);
        c.add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameField.setSize(200, 20);
        nameField.setLocation(150, 70);
        c.add(nameField);

        // Email
        emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setSize(100, 20);
        emailLabel.setLocation(50, 110);
        c.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 15));
        emailField.setSize(200, 20);
        emailField.setLocation(150, 110);
        c.add(emailField);

        // Gender
        genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        genderLabel.setSize(100, 20);
        genderLabel.setLocation(50, 150);
        c.add(genderLabel);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(150, 150);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(225, 150);
        c.add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // DOB
        dobLabel = new JLabel("Birthday");
        dobLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        dobLabel.setSize(100, 20);
        dobLabel.setLocation(50, 190);
        c.add(dobLabel);

        String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        String years[] = { "1990", "1991", "1992", "1993", "1994", "1995", "1996",
                "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" };

        dateBox = new JComboBox<>(dates);
        dateBox.setFont(new Font("Arial", Font.PLAIN, 15));
        dateBox.setSize(50, 20);
        dateBox.setLocation(150, 190);
        c.add(dateBox);

        monthBox = new JComboBox<>(months);
        monthBox.setFont(new Font("Arial", Font.PLAIN, 15));
        monthBox.setSize(90, 20);
        monthBox.setLocation(210, 190);
        c.add(monthBox);

        yearBox = new JComboBox<>(years);
        yearBox.setFont(new Font("Arial", Font.PLAIN, 15));
        yearBox.setSize(70, 20);
        yearBox.setLocation(310, 190);
        c.add(yearBox);

        // Password
        passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passLabel.setSize(100, 20);
        passLabel.setLocation(50, 230);
        c.add(passLabel);

        passField = new JPasswordField();
        passField.setFont(new Font("Arial", Font.PLAIN, 15));
        passField.setSize(200, 20);
        passField.setLocation(150, 230);
        c.add(passField);

        // Checkbox
        robotCheck = new JCheckBox("I am not a robot.");
        robotCheck.setFont(new Font("Arial", Font.PLAIN, 15));
        robotCheck.setSize(200, 20);
        robotCheck.setLocation(100, 270);
        c.add(robotCheck);

        // Sign Up Button
        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 15));
        signUpButton.setBackground(Color.BLUE);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setSize(300, 30);
        signUpButton.setLocation(50, 310);
        signUpButton.addActionListener(this);
        c.add(signUpButton);

        // Sign In Section Title
        signInButton1 = new JButton("Sign In");
        signInButton1.setFont(new Font("Arial", Font.BOLD, 18));
        signInButton1.setBorderPainted(false);
        signInButton1.setOpaque(false);
        signInButton1.setForeground(Color.BLUE);
        signInButton1.setBackground(Color.WHITE);
        signInButton1.setSize(100, 30);
        signInButton1.setLocation(150, 360);
        signInButton1.setFocusPainted(false);
        c.add(signInButton1);

        // Sign In Email
        JLabel loginEmailLabel = new JLabel("Email");
        loginEmailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        loginEmailLabel.setSize(100, 20);
        loginEmailLabel.setLocation(50, 410);
        c.add(loginEmailLabel);

        loginEmailField = new JTextField();
        loginEmailField.setFont(new Font("Arial", Font.PLAIN, 15));
        loginEmailField.setSize(200, 20);
        loginEmailField.setLocation(150, 410);
        c.add(loginEmailField);

        // Sign In Password
        JLabel loginPassLabel = new JLabel("Password");
        loginPassLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        loginPassLabel.setSize(100, 20);
        loginPassLabel.setLocation(50, 450);
        c.add(loginPassLabel);

        loginPassField = new JPasswordField();
        loginPassField.setFont(new Font("Arial", Font.PLAIN, 15));
        loginPassField.setSize(200, 20);
        loginPassField.setLocation(150, 450);
        c.add(loginPassField);

        // Sign In Button
        signInButton2 = new JButton("Sign In");
        signInButton2.setFont(new Font("Arial", Font.BOLD, 15));
        signInButton2.setBackground(Color.BLUE);
        signInButton2.setForeground(Color.WHITE);
        signInButton2.setSize(300, 30);
        signInButton2.setLocation(50, 490);
        signInButton2.addActionListener(this);
        c.add(signInButton2);

        setVisible(true);
    }

    // Action Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            if (!robotCheck.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please verify 'I am not a robot'!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String name = nameField.getText();
            String email = emailField.getText();
            String gender = male.isSelected() ? "Male" : "Female";
            String dob = dateBox.getSelectedItem() + " " + monthBox.getSelectedItem() + " " + yearBox.getSelectedItem();
            String password = new String(passField.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(this, "Sign Up Successful!\n\nName: " + name + "\nEmail: " + email +
                    "\nGender: " + gender + "\nBirthday: " + dob, "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == signInButton2) {
            String loginEmail = loginEmailField.getText();
            String loginPass = new String(loginPassField.getPassword());

            if (loginEmail.isEmpty() || loginPass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter Email and Password!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Welcome back, " + loginEmail + "!", "Sign In", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}

