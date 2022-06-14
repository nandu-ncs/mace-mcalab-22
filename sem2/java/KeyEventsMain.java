import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.awt.Window.*;

public class KeyEventsMain implements KeyListener {
    Label lb1, lbl2, lb;
    TextField tf1;
    Frame fr;
    String s;

    KeyEventsMain() {
        // create a frame
        fr = new Frame("KeyEventListener Example");

        // create labels lb1, lbl2 and lb
        lb1 = new Label(" Key Events will be displayed based on the actions", Label.CENTER);
        lbl2 = new Label();
        lb = new Label();

        // create a text field
        tf1 = new TextField(20);

        // add label 1 to the frame
        fr.add(lb1);
        // add textfield to the frame
        fr.add(tf1);
        // add label 2 to the frame
        fr.add(lbl2);

        // set the layout for frame
        fr.setLayout(new FlowLayout());
        // on clicking the button, text field data will be read
        tf1.addKeyListener(this);
        // set the size of frame
        fr.setSize(460, 250);
        // set the visibility as true
        fr.setVisible(true);

        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    // events to be done on pressing key
    public void keyPressed(KeyEvent ev) {
        lbl2.setText("Pressed Key");
    }

    // events to be done on releasing key
    public void keyReleased(KeyEvent ev) {
        lbl2.setText("Released key");
    }

    // events to be done on typing key
    public void keyTyped(KeyEvent ev) {
        lbl2.setText("Key is typed");
        // set the visibility as true
        fr.setVisible(true);
    }

    public static void main(String args[]) {
        new KeyEventsMain();
    }
}