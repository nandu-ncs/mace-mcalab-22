import java.awt.*;
import java.awt.event.*;

// Our class extends Frame class and implements ActionListener interface  
public class AWTMax3 extends Frame implements ActionListener {
    // creating instances of TextField and Button class
    Label L1, L2, L3, Res;
    TextField tf1, tf2, tf3, tf4;
    Button b1, b2;

    // instantiating using constructor
    AWTMax3() {
        // instantiating objects of text field and button
        // setting position of components in frame
        L1 = new Label("First No");
        L1.setBounds(65, 50, 80, 30);
        L2 = new Label("Second No");
        L2.setBounds(65, 100, 80, 30);
        L3 = new Label("Third No");
        L3.setBounds(65, 150, 80, 30);
        Res = new Label("Maximum");
        Res.setBounds(65, 200, 80, 30);

        tf1 = new TextField();
        tf1.setBounds(150, 50, 150, 30);
        tf2 = new TextField();
        tf2.setBounds(150, 100, 150, 30);
        tf3 = new TextField();
        tf3.setBounds(150, 150, 150, 30);
        tf4 = new TextField();
        tf4.setBounds(150, 200, 150, 30);
        tf4.setEditable(false);

        b1 = new Button("Find");
        b1.setBounds(50, 250, 80, 35);
        b2 = new Button("Exit");
        b2.setBounds(230, 250, 80, 35);
        // adding action listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        // adding components to frame
        add(L1);
        add(L2);
        add(L3);
        add(Res);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(b1);
        add(b2);
        // setting size, layout and visibility of frame
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // defining the actionPerformed method to generate an event on buttons
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            System.exit(0);
        }
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        String s3 = tf3.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int val = 0;
        if (e.getSource() == b1) {
            if (a > b && a > c)
                val = a;
            else if (b > a && b > c)
                val = b;
            else
                val = c;
        }
        String result = String.valueOf(val);
        tf4.setText(result);
    }

    // main methods
    public static void main(String args[]) {
        new AWTMax3();
    }
}