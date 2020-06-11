package ir.ac.kntu;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.awt.*;


public class RecursiveGUI {
    private int number;
    public void draw(Pane pane, double x,double y,double radius){
        Circle center = new Circle(x, y, 2*radius, Color.BLACK);
        Circle circle0 = new Circle(x+3*radius, y, radius, Color.RED);
        Circle circle45 = new Circle(x+2.121*radius, y-2.121*radius, radius, Color.CHARTREUSE);
        Circle circle90 = new Circle(x, y-3*radius, radius, Color.YELLOW);
        Circle circle135 = new Circle(x-2.121*radius, y-2.121*radius, radius, Color.ROYALBLUE);
        Circle circle180 = new Circle(x-3*radius, y, radius, Color.MEDIUMPURPLE);
        Circle circle245 = new Circle(x-2.121*radius, y+2.121*radius, radius, Color.	GREENYELLOW);
        Circle circle270 = new Circle(x, y+3*radius, radius, Color.	FUCHSIA);
        Circle circle345 = new Circle(x+2.121*radius, y+2.121*radius, radius, Color.BLUE);
        pane.getChildren().addAll(center, circle0, circle45, circle90, circle135,
                circle180, circle245,circle270, circle345);
        if(radius>300/Math.pow(2, number)) {
            draw(pane, x, y, radius/2);
            draw(pane, x, y-3*radius, radius/4);
            draw(pane, x-3*radius, y, radius/4);
            draw(pane, x, y+3*radius, radius/4);
            draw(pane, x+3*radius, y, radius/4);
            draw(pane, x+2.121*radius, y+2.121*radius, radius/4);
            draw(pane, x-2.121*radius, y-2.121*radius, radius/4);
            draw(pane, x+2.121*radius, y-2.121*radius, radius/4);
            draw(pane, x-2.121*radius, y+2.121*radius, radius/4);
        }
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
}