package ir.ac.kntu.cube;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class UpFace {

    public static void draw(Pane pane, double side, double xCenter, double yCenter){
        Polygon upSide = new Polygon();
        upSide.getPoints().addAll(xCenter-side/2, yCenter-side/4, xCenter, yCenter-side/2, xCenter+side/2,
                yCenter-side/4, xCenter, yCenter);
        upSide.setFill(Color.CYAN);
        Polygon leftSide = new Polygon(xCenter-side/2, yCenter-side/4, xCenter-side/2, yCenter+side/4
                , xCenter, yCenter+side/2, xCenter, yCenter);
        leftSide.setFill(Color.GRAY);
        Polygon rightSide = new Polygon(xCenter, yCenter, xCenter+side/2, yCenter-side/4, xCenter+side/2,
                yCenter+side/4, xCenter, yCenter+side/2);
        rightSide.setFill(Color.CORNFLOWERBLUE);
        pane.getChildren().addAll(upSide, leftSide, rightSide);
    }
}
