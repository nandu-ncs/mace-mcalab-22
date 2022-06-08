import java.awt.*;    
import java.awt.event.*; 

// Our class extends Frame class and implements ActionListener interface  

public class Comp_Val extends Frame implements ActionListener {    
// creating instances of TextField and Button class  
    Label L1,L2,L3,Res;
    TextField tf1, tf2, tf3,tf4;    
    Button b1, b2, b3;   
// instantiating using constructor   
    Comp_Val() {    
// instantiating objects of text field and button  
// setting position of components in frame  
        L1=new Label("First No");
        L1.setBounds(30, 50, 80, 20); 
        L2=new Label("Second No");
        L2.setBounds(30, 100, 80, 20); 
        L3=new Label("Third No");
        L3.setBounds(30, 150, 80, 20); 
        Res=new Label("Result");
        Res.setBounds(30, 200, 80, 20); 

        tf1 = new TextField();    
        tf1.setBounds(110, 50, 150, 20);    
        tf2 = new TextField();    
        tf2.setBounds(110, 100, 150, 20);    
        tf3 = new TextField();    
        tf3.setBounds(110, 150, 150, 20); 
        tf4 = new TextField();    
        tf4.setBounds(110, 200, 150, 20);  
        tf4.setEditable(false);   

        b1 = new Button("Compare");    
        b1.setBounds(50,250,80,20);  
        b2 = new Button("Add");    
        b2.setBounds(140,250,80,20);    
        b3 = new Button("Exit");    
        b3.setBounds(230,250,80,20);    
// adding action listener  
        b1.addActionListener(this);    
        b2.addActionListener(this);
        b3.addActionListener(this);    
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
        add(b3);    
// setting size, layout and visibility of frame   
        setSize(500,500);    
        setLayout(null);    
        setVisible(true);    
    }  
// defining the actionPerformed method to generate an event on buttons         
    public void actionPerformed(ActionEvent e) {    
       if (e.getSource() == b3) {    
        System.exit(0);  
    }   
    String s1 = tf1.getText();    
    String s2 = tf2.getText();  
    String s3 = tf3.getText();   
    int a = Integer.parseInt(s1);    
    int b = Integer.parseInt(s2);    
    int c = Integer.parseInt(s3); 
    int val=0;    
    if (e.getSource() == b1) {    
        if(a>b && a>c)
            val = a;
        else if (b>a && b>c)
            val=b;
        else
            val=c;
    }  
    else if (e.getSource() == b2) {    
        val = a + b + c;    
    }  
    String result = String.valueOf(val);    
    tf4.setText(result);    
}  

    /*public class WindowExample {    

    WindowExample() {    
    // adding WindowListener to the Frame  
    // and using the windowClosing() method of WindowAdapter class  
    addWindowListener (new WindowAdapter() {    
    public void windowClosing (WindowEvent e) {    
    dispose();    
} });   */ 
    // main method   
public static void main(String[] args) {    
    new Comp_Val();    
}    
}    