import java.awt.*;
import java.awt.event.*;

public class AWTCalc extends Frame implements ActionListener {
    Label L1, L2, Res;
    TextField tf1, tf2, tf3;
    Button add, sub, mul, div, clear;

    AWTCalc() {
        L1 = new Label("First No");
        L1.setBounds(70, 50, 80, 30);
        L2 = new Label("Second No");
        L2.setBounds(70, 100, 80, 30);
        Res = new Label("Result");
        Res.setBounds(70, 150, 80, 30);

        tf1 = new TextField();
        tf1.setBounds(160, 50, 150, 30);
        tf2 = new TextField();
        tf2.setBounds(160, 100, 150, 30);
        tf3 = new TextField();
        tf3.setBounds(160, 150, 150, 30);
        tf3.setEditable(false);

        add = new Button("+");
        add.setBounds(50, 200, 35, 35);
        sub = new Button("-");
        sub.setBounds(100, 200, 35, 35);
        mul = new Button("*");
        mul.setBounds(150, 200, 35, 35);
        div = new Button("/");
        div.setBounds(200, 200, 35, 35);
        clear = new Button("Clear");
        clear.setBounds(250, 200, 80, 35);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        add(L1);
        add(L2);
        add(Res);

        add(tf1);
        add(tf2);
        add(tf3);

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(clear);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setSize(380, 380);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a, b;
        if (e.getSource() == clear) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        } else {
            a = Integer.parseInt(tf1.getText());
            b = Integer.parseInt(tf2.getText());
            if (e.getSource() == add) {
                tf3.setText(String.valueOf(a + b));
            } else if (e.getSource() == sub) {
                tf3.setText(String.valueOf(a - b));
            } else if (e.getSource() == mul) {
                tf3.setText(String.valueOf(a * b));
            } else if (e.getSource() == div) {
                tf3.setText(String.valueOf((float) a / b));
            }
        }
    }

    public static void main(String args[]) {
        new AWTCalc();
    }
}
