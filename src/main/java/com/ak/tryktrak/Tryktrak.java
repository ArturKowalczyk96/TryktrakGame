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
    private FlowPane pionsWhite01 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite02 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite03 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite04 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite05 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite06 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite07 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite08 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite09 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite10 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite11 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite12 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite13 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite14 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsWhite15 = new FlowPane(Orientation.HORIZONTAL);

    private Image pionRed = new Image("file:src/main/resources/PionCzerwony.png");
    private FlowPane pionsRed01 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed02 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed03 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed04 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed05 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed06 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed07 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed08 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed09 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed10 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed11 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed12 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed13 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed14 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pionsRed15 = new FlowPane(Orientation.HORIZONTAL);

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(200, 200, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(11.5, 12.5, 11.5, 12.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView imgR01 = new ImageView(pionRed);
        ImageView imgR02 = new ImageView(pionRed);
        ImageView imgR03 = new ImageView(pionRed);
        ImageView imgR04 = new ImageView(pionRed);
        ImageView imgR05 = new ImageView(pionRed);
        ImageView imgR06 = new ImageView(pionRed);
        ImageView imgR07 = new ImageView(pionRed);
        ImageView imgR08 = new ImageView(pionRed);
        ImageView imgR09 = new ImageView(pionRed);
        ImageView imgR10 = new ImageView(pionRed);
        ImageView imgR11 = new ImageView(pionRed);
        ImageView imgR12 = new ImageView(pionRed);
        ImageView imgR13 = new ImageView(pionRed);
        ImageView imgR14 = new ImageView(pionRed);
        ImageView imgR15 = new ImageView(pionRed);

        pionsRed01.getChildren().add(imgR01);
        pionsRed02.getChildren().add(imgR02);
        pionsRed03.getChildren().add(imgR03);
        pionsRed04.getChildren().add(imgR04);
        pionsRed05.getChildren().add(imgR05);
        pionsRed06.getChildren().add(imgR06);
        pionsRed07.getChildren().add(imgR07);
        pionsRed08.getChildren().add(imgR08);
        pionsRed09.getChildren().add(imgR09);
        pionsRed10.getChildren().add(imgR10);
        pionsRed11.getChildren().add(imgR11);
        pionsRed12.getChildren().add(imgR12);
        pionsRed13.getChildren().add(imgR13);
        pionsRed14.getChildren().add(imgR14);
        pionsRed15.getChildren().add(imgR15);

        grid.add(pionsRed01, 134, 3, 155, 155);
        grid.add(pionsRed02, 134, 12, 155, 155);
        grid.add(pionsRed03, 2, 3, 155, 155);
        grid.add(pionsRed04, 2, 12, 155, 155);
        grid.add(pionsRed05, 2, 21, 155, 155);
        grid.add(pionsRed06, 2, 30, 155, 155);
        grid.add(pionsRed07, 2, 39, 155, 155);
        grid.add(pionsRed08, 45, 160, 155, 155);
        grid.add(pionsRed09, 45, 151, 155, 155);
        grid.add(pionsRed10, 45, 142, 155, 155);
        grid.add(pionsRed11, 82, 160, 155, 155);
        grid.add(pionsRed12, 82, 151, 155, 155);
        grid.add(pionsRed13, 82, 142, 155, 155);
        grid.add(pionsRed14, 82, 133, 155, 155);
        grid.add(pionsRed15, 82, 124, 155, 155);

        ImageView imgW01 = new ImageView(pionWhite);
        ImageView imgW02 = new ImageView(pionWhite);
        ImageView imgW03 = new ImageView(pionWhite);
        ImageView imgW04 = new ImageView(pionWhite);
        ImageView imgW05 = new ImageView(pionWhite);
        ImageView imgW06 = new ImageView(pionWhite);
        ImageView imgW07 = new ImageView(pionWhite);
        ImageView imgW08 = new ImageView(pionWhite);
        ImageView imgW09 = new ImageView(pionWhite);
        ImageView imgW10 = new ImageView(pionWhite);
        ImageView imgW11 = new ImageView(pionWhite);
        ImageView imgW12 = new ImageView(pionWhite);
        ImageView imgW13 = new ImageView(pionWhite);
        ImageView imgW14 = new ImageView(pionWhite);
        ImageView imgW15 = new ImageView(pionWhite);

        pionsWhite01.getChildren().add(imgW01);
        pionsWhite02.getChildren().add(imgW02);
        pionsWhite03.getChildren().add(imgW03);
        pionsWhite04.getChildren().add(imgW04);
        pionsWhite05.getChildren().add(imgW05);
        pionsWhite06.getChildren().add(imgW06);
        pionsWhite07.getChildren().add(imgW07);
        pionsWhite08.getChildren().add(imgW08);
        pionsWhite09.getChildren().add(imgW09);
        pionsWhite10.getChildren().add(imgW10);
        pionsWhite11.getChildren().add(imgW11);
        pionsWhite12.getChildren().add(imgW12);
        pionsWhite13.getChildren().add(imgW13);
        pionsWhite14.getChildren().add(imgW14);
        pionsWhite15.getChildren().add(imgW15);

        grid.add(pionsWhite01, 134, 160, 155, 155);
        grid.add(pionsWhite02, 134, 151, 155, 155);
        grid.add(pionsWhite03, 2, 160, 155, 155);
        grid.add(pionsWhite04, 2, 151, 155, 155);
        grid.add(pionsWhite05, 2, 142, 155, 155);
        grid.add(pionsWhite06, 2, 133, 155, 155);
        grid.add(pionsWhite07, 2, 124, 155, 155);
        grid.add(pionsWhite08, 45, 3, 155, 155);
        grid.add(pionsWhite09, 45, 12, 155, 155);
        grid.add(pionsWhite10, 45, 21, 155, 155);
        grid.add(pionsWhite11, 82, 3, 155, 155);
        grid.add(pionsWhite12, 82, 12, 155, 155);
        grid.add(pionsWhite13, 82, 21, 155, 155);
        grid.add(pionsWhite14, 82, 30, 155, 155);
        grid.add(pionsWhite15, 82, 39, 155, 155);

        Scene scene = new Scene(grid, 1300, 1060, Color.BLACK);

        primaryStage.setTitle("Tryktrak");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
