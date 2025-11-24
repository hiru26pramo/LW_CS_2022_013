package src.LW_01;/*Write a Java program that displays a frame window 300 pixels wide and 200 pixels high with the title My First Frame. Place the frame so that its top left corner is at a position
 50 pixels from the top of the screen and 100 pixels from the left of the screen.
     ● To position a window at a specified location, you can use the setLocation method like this, frame.setLocation( 50, 50 );
     ● Through experimentation, determine how the two arguments in the setLocation method affect the positioning of the window.
  */

import javax.swing.*;

public class Q_04 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");

        frame.setSize(300,200);
        frame.setLocation(100,50);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
