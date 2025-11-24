package LW_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class SignUpSignInForm extends JFrame implements ActionListener {

    private final String[] date = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private final String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private final String[] year = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"};
    private final JTextField nameField;
    private final JTextField emailField;
    private final JRadioButton maleButton;
    private final JRadioButton femaleButton;
    private final JComboBox dateBox;
    private final JComboBox monthBox;
    private final JComboBox yearBox;
    private final JPasswordField passwordField;
    private final JCheckBox robot;
    private final JButton SUButton;
    private final JTextField SIEmailField;
    private final JPasswordField SIPasswordField;
    private final JButton SIButton;
    DBConnector dbConnector;


    public SignUpSignInForm(){
        setTitle("Registration Form");
        setResizable(false);
        setSize(500,670);
        setLocation(200,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.white);

        JLabel SUTitle = new JLabel("Sign Up");
        SUTitle.setFont(new Font("Arial",Font.BOLD,30));
        SUTitle.setForeground(Color.blue);
        SUTitle.setSize(500,30);
        SUTitle.setLocation(200,10);
        container.add(SUTitle);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setForeground(Color.black);
        nameLabel.setFont(new Font("Arial",Font.BOLD,20));
        nameLabel.setSize(100,30);
        nameLabel.setLocation(30,50);
        container.add(nameLabel);


        nameField = new JTextField();
        nameField.setFont(new Font("Arial",Font.PLAIN,20));
        nameField.setSize(250,30);
        nameField.setLocation(180,50);
        container.add(nameField);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setForeground(Color.black);
        emailLabel.setFont(new Font("Arial",Font.BOLD,20));
        emailLabel.setSize(100,30);
        emailLabel.setLocation(30,100);
        container.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial",Font.PLAIN,20));
        emailField.setSize(250,30);
        emailField.setLocation(180,100);
        container.add(emailField);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setForeground(Color.black);
        genderLabel.setFont(new Font("Arial",Font.BOLD,20));
        genderLabel.setSize(100,30);
        genderLabel.setLocation(30,150);
        container.add(genderLabel);

        maleButton = new JRadioButton("Male");
        maleButton.setFont(new Font("Arial",Font.BOLD,20));
        maleButton.setSelected(false);
        maleButton.setBackground(Color.white);
        maleButton.setSize(125,30);
        maleButton.setLocation(180,150);
        container.add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setFont(new Font("Arial",Font.BOLD,20));
        femaleButton.setSelected(false);
        femaleButton.setBackground(Color.white);
        femaleButton.setSize(125,30);
        femaleButton.setLocation(320,150);
        container.add(femaleButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(femaleButton);
        genderGroup.add(maleButton);

        JLabel BODLabel = new JLabel("Birthday");
        BODLabel.setForeground(Color.black);
        BODLabel.setFont(new Font("Arial",Font.BOLD,20));
        BODLabel.setSize(100,30);
        BODLabel.setLocation(30,200);
        container.add(BODLabel);

        dateBox = new JComboBox(date);
        dateBox.setFont(new Font("Arial",Font.BOLD,20));
        dateBox.setSize(50,30);
        dateBox.setLocation(180,200);
        container.add(dateBox);

        monthBox = new JComboBox(month);
        monthBox.setFont(new Font("Arial",Font.BOLD,20));
        monthBox.setSize(120,30);
        monthBox.setLocation(230,200);
        container.add(monthBox);

        yearBox = new JComboBox(year);
        yearBox.setFont(new Font("Arial",Font.BOLD,20));
        yearBox.setSize(70,30);
        yearBox.setLocation(350,200);
        container.add(yearBox);

        JLabel password = new JLabel("Password");
        password.setForeground(Color.black);
        password.setFont(new Font("Arial",Font.BOLD,20));
        password.setSize(100,30);
        password.setLocation(30,250);
        container.add(password);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial",Font.PLAIN,20));
        passwordField.setSize(250,30);
        passwordField.setLocation(180,250);
        container.add(passwordField);

        robot = new JCheckBox("I am not a robot.");
        robot.setFont(new Font("Arial",Font.PLAIN,18));
        robot.setSize(250,30);
        robot.setLocation(30,300);
        robot.setBackground(Color.white);
        container.add(robot);

        SUButton = new JButton("Sign UP");
        SUButton.setFont(new Font("Arial",Font.BOLD,20));
        SUButton.setBackground(Color.blue);
        SUButton.setForeground(Color.white);
        SUButton.setSize(420,40);
        SUButton.setLocation(30,350);
        SUButton.addActionListener(this);
        container.add(SUButton);


        JLabel SITitle = new JLabel("Sign In");
        SITitle.setFont(new Font("Arial",Font.BOLD,30));
        SITitle.setForeground(Color.blue);
        SITitle.setSize(500,50);
        SITitle.setLocation(200,400);
        container.add(SITitle);

        JLabel SIemailLabel = new JLabel("Email");
        SIemailLabel.setForeground(Color.black);
        SIemailLabel.setFont(new Font("Arial",Font.BOLD,20));
        SIemailLabel.setSize(100,30);
        SIemailLabel.setLocation(30,450);
        container.add(SIemailLabel);

        SIEmailField = new JTextField();
        SIEmailField.setFont(new Font("Arial",Font.PLAIN,20));
        SIEmailField.setSize(250,30);
        SIEmailField.setLocation(180,450);
        container.add(SIEmailField);

        JLabel SIPassword = new JLabel("Password");
        SIPassword.setForeground(Color.black);
        SIPassword.setFont(new Font("Arial",Font.BOLD,20));
        SIPassword.setSize(100,30);
        SIPassword.setLocation(30,500);
        container.add(SIPassword);

        SIPasswordField = new JPasswordField();
        SIPasswordField.setFont(new Font("Arial",Font.PLAIN,20));
        SIPasswordField.setSize(250,30);
        SIPasswordField.setLocation(180,500);
        container.add(SIPasswordField);

        SIButton = new JButton("Sign In");
        SIButton.setFont(new Font("Arial",Font.BOLD,20));
        SIButton.setBackground(Color.blue);
        SIButton.setForeground(Color.white);
        SIButton.setSize(420,40);
        SIButton.setLocation(30,550);
        SIButton.addActionListener(this);
        container.add(SIButton);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SUButton){
            if(robot.isSelected()){
                String name = nameField.getText();
                String email = emailField.getText();
                String gender =  maleButton.isSelected() ? "Male" : "Female";
                String BOD = dateBox.getSelectedItem() + "/" + monthBox.getSelectedItem() + "/" + yearBox.getSelectedItem();
                String password = passwordField.getText();

                if (!maleButton.isSelected() && ! femaleButton.isSelected()){
                    JOptionPane.showMessageDialog(this,"Please select your gender.");
                }else{
                        dbConnector = new DBConnector();
                    try {
                        dbConnector.addData(name,email,gender,BOD,password);
                        System.out.println("Adding data to database.");
                        System.out.println("Name \t\t: " + name);
                        System.out.println("Email \t\t: " + email);
                        System.out.println("Gender \t\t: " + gender);
                        System.out.println("Birthday \t: " + BOD);
                        System.out.println("Password \t: " + password);
                        System.out.println();
                        JOptionPane.showMessageDialog(this,"Sign Up Success!");


                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }

                nameField.setText("");
                emailField.setText("");
                maleButton.setSelected(false);
                femaleButton.setSelected(false);
                dateBox.setSelectedIndex(0);
                monthBox.setSelectedIndex(0);
                yearBox.setSelectedIndex(0);
                passwordField.setText("");

            }else {
                JOptionPane.showMessageDialog(this,"Sign Up Unsuccessful!");
                JOptionPane.showMessageDialog(this,"Please confirm that you are not a robot.");
            }
        }else if(e.getSource() == SIButton){
            String email = SIEmailField.getText();
            String password = SIPasswordField.getText();
            try {
                if(dbConnector.getData(email,password)){
                    JOptionPane.showMessageDialog(this,"Sign IN Success!");
                    System.out.println(email);
                    System.out.println(password);
                }else {
                    JOptionPane.showMessageDialog(this,"Sign IN Unsuccessful!");

                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            SIEmailField.setText("");
            SIPasswordField.setText("");

        }
    }
}

