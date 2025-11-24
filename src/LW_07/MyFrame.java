package LW_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;

class MyFrame extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 500;
    private static final int FRAME_Y_ORIGIN = 500;
    private final JButton cancelButton;
    private final JButton okButton;
    private final JButton logoutButton;

    public MyFrame() {
        Container contentPane = getContentPane();
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program JButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        //set the layout manager
        contentPane.setLayout(new FlowLayout());
        //create and place two buttons on the frame's content pane
        okButton = new JButton("OK");
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);
        logoutButton = new JButton("LogOut");
        contentPane.add(logoutButton);


        //register this frame as an action listener of the two buttons
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);
        logoutButton.addActionListener(this);




        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton)event.getSource();
        String buttonText = clickedButton.getText();
        setTitle(buttonText);
        System.out.println(buttonText);
    }
}

