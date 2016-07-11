import java.util.List;

/**
 * Created by Sergey_Stefoglo on 7/10/2016.
 */
public class ComplexFigureUtils {
//count size of figure
    public static int  calculatingSizeFigure(List<Rectangle> figure){
        int countPoint=0;
        for(Rectangle rectangle:figure){
            countPoint+=rectangle.getHeight()*rectangle.getWidth();
        }
    return countPoint;
    };

}
