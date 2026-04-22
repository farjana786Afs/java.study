import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Applet1 extends JPanel {
    //equivallent to paint()
    @Override
    protected void paintComponent(Graphics g){

    
        super.paintComponent(g);
        g.drawString("Hello,java applet!",50,50);
    
}


public static void main(String[]args){
     JFrame frame=new JFrame("Hello Swing");
     Applet1 panel=new Applet1();
     frame.add(panel);

     frame.setSize(300,300);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
}
}
