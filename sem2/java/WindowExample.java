import java.awt.*;    
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;   
  
// class which inherits Frame class and implements WindowListener interface   
public class WindowExample extends Frame implements WindowListener {    
  
// class constructor  
    WindowExample() {   
  
    // adding WindowListener to the frame   
        
	addWindowListener(this);   
               
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }   
// main method  
public static void main(String[] args) {    
    new WindowExample();    
}    
  
// overriding windowActivated() method of WindowListener interface which prints the given string when window is set to be active  
public void windowActivated (WindowEvent arg0) {    
    System.out.println("activated");    
}    
  
// overriding windowClosed() method of WindowListener interface which prints the given string when window is closed  
public void windowClosed (WindowEvent arg0) {    
    System.out.println("closed");    
}    
  
// overriding windowClosing() method of WindowListener interface which prints the given string when we attempt to close window from system menu  
public void windowClosing (WindowEvent arg0) {    
    System.out.println("closing");    
    dispose();    
}    
  
// overriding windowDeactivated() method of WindowListener interface which prints the given string when window is not active  
public void windowDeactivated (WindowEvent arg0) {    
    System.out.println("deactivated");    
}    
  
// overriding windowDeiconified() method of WindowListener interface which prints the given string when window is modified from minimized to normal state  
public void windowDeiconified (WindowEvent arg0) {    
    System.out.println("deiconified");    
}    
  
// overriding windowIconified() method of WindowListener interface which prints the given string when window is modified from normal to minimized state  
public void windowIconified(WindowEvent arg0) {    
    System.out.println("iconified");    
}    
  
// overriding windowOpened() method of WindowListener interface which prints the given string when window is first opened  
public void windowOpened(WindowEvent arg0) {    
    System.out.println("opened");    
}    
}    