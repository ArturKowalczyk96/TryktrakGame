package com.ak.tryktrak;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Tryktrak extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 1000, Color.BLACK);

        Rectangle r = new Rectangle(25,25,950,950);
        r.setFill(Color.BLUE);

        root.getChildren().add(r);
        primaryStage.setTitle("Tryktrak");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
