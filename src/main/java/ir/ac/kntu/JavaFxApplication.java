package ir.ac.kntu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JavaFxApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        root.setStyle("-fx-border-width: 0 0 5 0; -fx-border-style: dotted;");
        Scene scene = new Scene(root, 800, 600, Color.rgb(240, 240, 240));
        
        //TODO your code goes here
        // try to seprate logic from GUI 


        // Setting stage properties
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("Recursion in JavaFX!");
        
        stage.setScene(scene);
        stage.show();
    }
}
