package ir.ac.kntu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Scanner;

public class JavaFxApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        //root.setStyle("-fx-border-width: 0 0 5 0; -fx-border-style: dotted;");
        Scene scene = new Scene(root, 610, 610);
        // try to separate logic from GUI
        RecursiveGUI recursiveGUI = new RecursiveGUI();
        System.out.println("Enter a number between 1 and 11");
        recursiveGUI.setNumber(new Scanner(System.in).nextInt());
        Circle circle = new Circle(300, 300, 300, Color.GOLD);
        root.getChildren().add(circle);
        double radius = 300;
        if(recursiveGUI.getNumber()>1) {
            recursiveGUI.draw(root, radius, radius, radius / 4);
        }
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("Recursion in JavaFX!");
        stage.setScene(scene);
        if(recursiveGUI.getNumber()>=1&&recursiveGUI.getNumber()<12) {
            stage.show();
        }else {
            System.out.println("The input is out of range");
            stage.close();
            System.exit(0);
        }
    }
}
