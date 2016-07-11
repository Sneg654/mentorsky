/**
 * Created by Sergey_Stefoglo on 7/10/2016.
 */


import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

class Surface extends JPanel {
private List<Rectangle> points=new ArrayList();


//write in JPanel
    public void doDrawingRect(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        for(Rectangle p:points) {
            g2d.drawRect(p.getX(), p.getY(), p.getWidth(), p.getHeight());
        }
            g2d.drawString("count boxes:" + points.size(),20,820);
            g2d.drawString("count points in fugure:" + ComplexFigureUtils.calculatingSizeFigure(points),20,840);



    }
//add new box in complex figure
    public void addPoint(int x,int y,int width, int height){
        points.add(new Rectangle(x,y,width,height));
    };



    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
      doDrawingRect(g);
    }
}
