package ir.ac.kntu.cube;

import javafx.scene.layout.Pane;


public class RecursiveGUI {
    private int number;
    private double height;
    public void drawUpFace(Pane pane, double side, double xCenter, double yCenter){
        UpFace.draw(pane, side, xCenter, yCenter);
        drawDownFace(pane, side/2, xCenter, yCenter);
        drawDownFace(pane, side/2, xCenter-side/2, yCenter+side/4);
        drawDownFace(pane, side/2, xCenter+side/2, yCenter+side/4);
        drawDownFace(pane, side/2, xCenter, yCenter-side/2);
        if(side>80+height/Math.pow(2,number)){
            drawUpFace(pane,side/2, xCenter-side/4, yCenter+3*side/2);
            //drawDownFace(pane, side, xCenter, yCenter);
        }
    }
    public void drawDownFace(Pane pane, double side, double xCenter, double yCenter){
        DownFace.draw(pane, side, xCenter, yCenter);
        if(side>20+height/Math.pow(2,number)){
            drawDownFace(pane, side/4, xCenter, yCenter+side/4);
            drawDownFace(pane, side/2, xCenter+side/2, yCenter-side/4);
            drawDownFace(pane, side/4,xCenter-side/4, yCenter-side/8);
            drawUpFace(pane, side/2, xCenter-side/2, yCenter-side/4);
            drawUpFace(pane, side/4, xCenter,yCenter+side/2);
            //drawUpFace(pane, side/4, xCenter, yCenter+side/4);
        }
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}