import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 
class Fun extends Frame implements WindowListener {
 
    public Fun() {
 
        setSize(300, 300);
 
        setTitle("Draw Flag");
        show();
        this.addWindowListener(this);
 
    }
 
    public void paint(Graphics g) {
 
        g.setColor(new Color(46, 139, 89));
        g.fillRect(80, 80, 130, 80);
        g.setColor(Color.RED);
        g.fillOval(120, 100, 40, 40);
        g.setColor(new Color(139, 69, 19));
        g.fillRect(75, 70, 5, 170);
        g.setFont(new Font("", Font.BOLD, 20));
        g.drawString("OUR FLAG", 100, 270);
    }
 
    public void windowClosing(WindowEvent event) {
 
        dispose();
        System.exit(0);
    }
 
    public void windowActivated(WindowEvent event) {
    };
 
    public void windowClosed(WindowEvent event) {
    };
 
    public void windowDeactivated(WindowEvent event) {
    };
 
    public void windowDeiconified(WindowEvent event) {
    };
 
    public void windowIconified(WindowEvent event) {
    };
 
    public void windowOpened(WindowEvent event) {
    };
}
 
public class Draw {
 
    public static void main(String[] args) {
 
        new Fun();
 
    }
 
}