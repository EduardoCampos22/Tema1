/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcircle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 *
 * @author Usuario
 */
public class ControlCircle extends Application 
{ 
    
    @Override
    public void start(Stage primaryStage) 
    {
        
        
        // Creación del círculo
        Circle circle = new Circle();
        circle.setRadius(60);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);
        
        
        // Creación de los botones
        Button bAumenta = new Button("Enlarge");
        Button bDisminuye = new Button("Shrink");
        
        // 
        bAumenta.setOnAction(new EnlargeHandler());
        bDisminuye.setOnAction(new ShrinkHandler());
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    private static class EnlargeHandler implements EventHandler<ActionEvent> 
    {
        public EnlargeHandler() 
        {
            
        }
    }
    
    private static class ShrinkHandler implements EventHandler<ActionEvent> 
    {
        public ShrinkHandler() 
        {
            
        }
    }
    
    

    
}
