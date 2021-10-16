package ir.ac.kntu.cube;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.TriangleMesh;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Scanner;

public class JavaFxApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        double height, width;
        Pane root = new Pane();
        Scene scene;
        RecursiveGUI recursiveGUI = new RecursiveGUI();
        //root.setStyle("-fx-border-width: 0 0 5 0; -fx-border-style: dotted;");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter scene dimensions (height and width should be so close) : ");
            System.out.println("Enter the height : ");
            height = scanner.nextDouble();
            System.out.println("Enter the width : ");
            width = scanner.nextDouble();
            //try to separate logic from GUI
            System.out.println("Enter a number between 1 and 11 : ");
            recursiveGUI.setNumber(scanner.nextInt());
            recursiveGUI.setHeight(height);
        }
        recursiveGUI.drawUpFace(root, height/2,width/2, height/2);
        scene = new Scene(root, height + 10, width + 10);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("Recursion in JavaFX!");
        stage.setScene(scene);
        stage.show();
    }
}
