package ir.ac.kntu.cube;

import com.sun.scenario.effect.light.SpotLight;
import javafx.print.PageLayout;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.awt.*;

public class DownFace {

    public static void draw(Pane pane, double side, double xCenter, double yCenter){
        Polygon downSide = new Polygon();
        downSide.getPoints().addAll(xCenter, yCenter, xCenter+side/2, yCenter+side/4, xCenter,
                yCenter+side/2, xCenter-side/2, yCenter+side/4);
        downSide.setFill(javafx.scene.paint.Color.CYAN);
        Polygon leftSide = new Polygon(xCenter, yCenter-side/2, xCenter-side/2, yCenter-side/4
                , xCenter-side/2, yCenter+side/4, xCenter, yCenter);
        leftSide.setFill(javafx.scene.paint.Color.CORNFLOWERBLUE);
        Polygon rightSide = new Polygon(xCenter, yCenter, xCenter+side/2, yCenter+side/4, xCenter+side/2,
                yCenter-side/4, xCenter, yCenter-side/2);
        rightSide.setFill(Color.GRAY);
        pane.getChildren().addAll(downSide, leftSide, rightSide);
    }

}
