/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcircle;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
    

/**
 *
 * @author Eduardo Campos
 */
public class ControlCircle extends Application 
{ 
    Circle circle = new Circle();
    
    @Override
    public void start(Stage primaryStage) 
    {
        
        // Creacion del circulo      
        circle.setRadius(60);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        
        
        // Creacion de los botones
        Button bAumenta = new Button("Enlarge");
        Button bDisminuye = new Button("Shrink");
        
        
        // Captura los eventos de los botones
        bAumenta.setOnAction(new EnlargeHandler());
        bDisminuye.setOnAction(new ShrinkHandler());
        
        
        // Creacion del panel en el que se colocaran el circulo y los botones
        BorderPane root = new BorderPane();      
        
        // Configuracion del Layout del circulo
        VBox vBox = new VBox();
        root.setCenter(vBox);
        vBox.getChildren().add(circle);
        vBox.setAlignment(Pos.CENTER);
        
        
        // Configuración del Layout de los botones
        HBox hBox = new HBox(8);     
        root.setBottom(hBox);
        hBox.getChildren().add(bAumenta);
        hBox.getChildren().add(bDisminuye);
        hBox.setAlignment(Pos.CENTER);
        
        
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

    
    class EnlargeHandler implements EventHandler<ActionEvent> 
    {
        @Override
        public void handle(ActionEvent event) 
        {
            circle.setRadius(circle.getRadius() + 2);
        }
    }
    
    class ShrinkHandler implements EventHandler<ActionEvent> 
    {
        @Override
         public void handle(ActionEvent event) 
        {
            circle.setRadius(circle.getRadius() - 2);
        }
    }
            
}
