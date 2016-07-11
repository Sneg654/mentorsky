/**
 * Created by Sergey_Stefoglo on 7/10/2016.
 */
public class ComplexFigure {
    int prevX = 0;
    int prevY = 0;
    int prevW = 0;
    int prevH = 0;
//write random figure
    public Surface drowComplexFigure() {
        Surface surface = new Surface();
//generate count boxes
        int countBox = (int) (Math.random() * 19 + 1);
// generate figure
       for (int i = 0; i <= countBox; i++) {
            randomSizeRect();
            surface.addPoint(prevX, prevY,prevW,prevH);
            changeStartPosition(prevW,prevH );
        }
        return surface;
    }

    ;

    private void changeStartPosition(int increaseX,int increaseY) {
        //generate start position for next box
        int changeY = (int) (Math.random() * 100);
        if (changeY < 50) {
            prevX += increaseX;
        } else {
            prevY += increaseY;
        }

    }
//the size of the generation of boxes
    private void randomSizeRect() {
        prevW = (int) (Math.random() * 100) + 10;//min size=10 , max=110
        prevH = (int) (Math.random() * 100) + 10;
    }

}
