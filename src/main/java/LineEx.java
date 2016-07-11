import javax.swing.*;
import java.awt.*;

/**
 * Created by Sergey_Stefoglo on 7/10/2016.
 */
public class LineEx extends JFrame {

    public LineEx() {

        initUI();
    }

    private void initUI() {
        //creating JPanel
        Surface s=new ComplexFigure().drowComplexFigure();
        add(s);
        setTitle("When calculating the volume of a complex figure, have to apply the KISS principle");
        setSize(900, 900);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                LineEx ex = new LineEx();
                ex.setVisible(true);
            }
        });

    }
}
