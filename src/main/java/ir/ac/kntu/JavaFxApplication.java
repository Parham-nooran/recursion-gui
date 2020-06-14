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
        Scanner scanner = new Scanner(System.in);
        Pane root = new Pane();
        //root.setStyle("-fx-border-width: 0 0 5 0; -fx-border-style: dotted;");
        System.out.println("Enter page dimensions");
        System.out.println("Enter the height");
        double height = scanner.nextDouble();
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        Scene scene = new Scene(root, height+10, width+10);
        // try to separate logic from GUI
        RecursiveGUI recursiveGUI = new RecursiveGUI();
        System.out.println("Enter a number between 1 and 11");
        double radius = height/2;
        recursiveGUI.setNumber(scanner.nextInt());
        Circle circle = new Circle(radius, radius, radius, Color.GOLD);
        root.getChildren().add(circle);
        if(recursiveGUI.getNumber()>=1&&recursiveGUI.getNumber()<12) {
            recursiveGUI.draw(root, radius, radius, radius / 4);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("Recursion in JavaFX!");
        stage.setScene(scene);
            stage.show();
        }else {
            System.out.println("The input is out of range");
            stage.close();
            System.exit(0);
        }
    }
}
