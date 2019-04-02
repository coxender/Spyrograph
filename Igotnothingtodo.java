import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Point;

public class Igotnothingtodo
{   
    public static void spyrograph(){
        Point point1= new Point(0,0);
        Point point2= new Point(400, 400);
        while (true){
            point1.x=point1.x++;
            point1.y=point1.y++;
            
            
        }

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    
    
}
