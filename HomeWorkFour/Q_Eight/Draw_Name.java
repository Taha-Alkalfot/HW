package HomeWorkFour.Q_Eight;
import java.awt.*;
import javax.swing.JComponent;

public class Draw_Name extends JComponent{
        
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.BLUE);
        g2.fillRect(50, 50, 150, 100);
        
        g2.setColor(Color.RED);
        g2.drawString("Taha",70,100);
    }
}
