package com.ak.tryktrak;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Tryktrak extends Application {

    private Image imageback = new Image("file:src/main/resources/Table.png");
    private Image pionWhite = new Image("file:src/main/resources/PionBialy.png");
    private FlowPane pionsWhite = new FlowPane(Orientation.HORIZONTAL);
    private Image pionRed = new Image("file:src/main/resources/PionCzerwony.png");
    private FlowPane pionsRed = new FlowPane(Orientation.HORIZONTAL);


    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView imgR = new ImageView(pionRed);
        pionsRed.getChildren().add(imgR);

        grid.add(pionsRed, 54, 3, 300, 300);

        ImageView imgW = new ImageView(pionWhite);
        pionsWhite.getChildren().add(imgW);

        grid.add(pionsWhite, 2, 3, 300, 300);



        Scene scene = new Scene(grid, 1300, 1060, Color.BLACK);

        primaryStage.setTitle("Tryktrak");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
