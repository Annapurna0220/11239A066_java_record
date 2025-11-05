import java.applet.Applet;
import java.awt.*;

/*
<applet code="ShapesApplet" width=300 height=300></applet>
*/

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(50, 50, 100, 60); // Rectangle

        g.setColor(Color.red);
        g.drawOval(50, 130, 80, 80); // Circle

        g.setColor(Color.green);
        g.drawLine(50, 230, 200, 230); // Line
    }
}
