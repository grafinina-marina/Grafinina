/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafinina;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Marin
 */
public class Grafinina extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage theStage) {
        theStage.setTitle("Hello, World!");
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        Canvas canvas = new Canvas(1024, 682);
        root.getChildren().add(canvas);
        Button btn = new Button();
        btn.setText("СТАРТ");
        btn.setOnAction((ActionEvent event) -> {
            Label secondLabel = new Label("ВРЕМЕННО НЕ ДОСТУПНО");

            StackPane secondaryLayout = new StackPane();
            secondaryLayout.getChildren().add(secondLabel);

            Scene secondScene = new Scene(secondaryLayout, 530, 100);

            // New window (Stage)
            Stage newWindow = new Stage();
            newWindow.setTitle("Second Stage");
            newWindow.setScene(secondScene);

            // Set position of second window, related to primary window.
            newWindow.setX(theStage.getX() + 200);
            newWindow.setY(theStage.getY() + 100);
            secondLabel.getStylesheets().add("css/label.css");
            newWindow.show();

        });
        btn.relocate(900, 300);

        Button btn1 = new Button();
        btn1.setText("ВЫХОД");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Stage stage = (Stage) btn1.getScene().getWindow();
                stage.close();
            }
        });
        btn1.relocate(900, 360);

        root.getChildren().add(btn);
        root.getChildren().add(btn1);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.RED);
        gc.setStroke(Color.GREEN);
        gc.setLineWidth(2);
        Font theFont = Font.font("French Script MT", FontWeight.BOLD, 48);
        gc.setFont(theFont);

        Image pic = new Image("f.jpg");
        gc.drawImage(pic, 0, 0);

        gc.fillText("КАКИЕ ЛЮДИ ٩(◕‿◕)۶", 30, 120);
        gc.strokeText("КАКИЕ ЛЮДИ ٩(◕‿◕)۶", 30, 120);
        Image pic1 = new Image("m1.png");
        gc.drawImage(pic1, 50, 190);
        Image pic2 = new Image("z.png");
        gc.drawImage(pic2, 300, 290);
        Image pic3 = new Image("mi.png");
        gc.drawImage(pic3, 510, 175);
        gc.setFill(Color.GREY);

        Font in = Font.font("French Script MT", FontWeight.BOLD, 25);
        gc.setFont(in);
        gc.fillText("©Графинина М.А ФМФИ б-18ПИо", 630, 670);
        btn.getStylesheets().add("css/GrafininaM.css");
        btn1.getStylesheets().add("css/gm.css");
        theStage.show();
    }
}
 
//©Grafinina
