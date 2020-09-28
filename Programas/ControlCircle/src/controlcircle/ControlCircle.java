/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcircle;

import javafx.application.Application;
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
        Button bCrece = new Button("Enlarge");
        Button bDecrece = new Button("Shrink");
        
        
        
        primaryStage.show();
    }

    
}
