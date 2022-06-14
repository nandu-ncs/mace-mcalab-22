import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

// class which inherits Frame class and implements WindowListener interface   
class WindowExample extends Frame implements WindowListener, MouseListener, MouseMotionListener {
    int x = 0, y = 0;
    Label l;
    String strEvent = "", strPos = "";

    // class constructor
    WindowExample() {
        super("Mouse & Window Events");
        // adding WindowListener to the frame
        l = new Label();
        l.setBounds(10, 370, 100, 20);
        add(l);

        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // overriding windowActivated() method of WindowListener interface which prints
    // the given string when window is set to be active
    public void windowActivated(WindowEvent arg0) {
        System.out.println("activated");
    }

    // overriding windowClosed() method of WindowListener interface which prints the
    // given string when window is closed
    public void windowClosed(WindowEvent arg0) {
        System.out.println("closed");
    }

    // overriding windowClosing() method of WindowListener interface which prints
    // the given string when we attempt to close window from system menu
    public void windowClosing(WindowEvent arg0) {
        System.out.println("closing");
        dispose();
    }

    // overriding windowDeactivated() method of WindowListener interface which
    // prints the given string when window is not active
    public void windowDeactivated(WindowEvent arg0) {
        System.out.println("deactivated");
    }

    // overriding windowDeiconified() method of WindowListener interface which
    // prints the given string when window is modified from minimized to normal
    // state
    public void windowDeiconified(WindowEvent arg0) {
        System.out.println("deiconified");
    }

    // overriding windowIconified() method of WindowListener interface which prints
    // the given string when window is modified from normal to minimized state
    public void windowIconified(WindowEvent arg0) {
        System.out.println("iconified");
    }

    // overriding windowOpened() method of WindowListener interface which prints the
    // given string when window is first opened
    public void windowOpened(WindowEvent arg0) {
        System.out.println("opened");
    }

    public void mouseClicked(MouseEvent e) {
        strEvent = "MouseClicked";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        strEvent = "MousePressed";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        strEvent = "MouseReleased";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        strEvent = "MouseEntered";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        strEvent = "MouseExited";
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        l.setText("X=" + x + ", Y=" + y);
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        l.setText("X=" + x + ", Y=" + y);
    }

    public void paint(Graphics g) {
        g.drawString(strEvent + " at " + x + "," + y, 50, 50);
    }

}

public class MouseWindowEvents {
    public static void main(String[] args) {
        // Mouse_Event_Ex myWindow = new Mouse_Event_Ex("Window With Mouse Events
        // Example");
        new WindowExample();
    }
}

class MyWindowAdapter extends WindowAdapter {
    WindowExample myWindow = null;

    MyWindowAdapter(WindowExample myWindow) {
        this.myWindow = myWindow;
    }

    public void windowClosing(WindowEvent we) {
        myWindow.setVisible(false);
    }
}