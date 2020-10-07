/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timelinedemo;


import com.sun.javafx.perf.PerformanceTracker;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Eduardo Campos
 */
public class TimeLineDemo extends Application 
{
    public static double ballSpeedX = 2;
    public static double ballSpeedY = 2;    
    
    @Override
    public void start(Stage primaryStage) 
    {                                   
        // Creacion del Pane
        Pane root = new Pane();                
        Scene scene = new Scene(root, 500, 350);
        
        Label label = new Label();
        label.setTranslateX(10); 
        label.setTranslateY(10);
        root.getChildren().add(label);
        
        // Creacion de la pelota
        Circle pelota = new Circle(15);
        pelota.setStroke(Color.BLACK);
        pelota.setTranslateX(250 / 2); 
        pelota.setTranslateY(100 / 2);        
        root.getChildren().add(pelota);
        
       
        // Evento
        EventHandler<ActionEvent> evento = e -> {
            
            // Mostrar la frecuencia de refresco FPS 
            PerformanceTracker perfTracker = PerformanceTracker.getSceneTracker(scene); 
            label.setText("FPS (Timeline) = " + perfTracker.getInstantFPS());
            
            if(pelota.getTranslateX() < 0 || pelota.getTranslateX() > 500)
            { 
                ballSpeedX *= -1; 
            }
            pelota.setTranslateX(pelota.getTranslateX()+ ballSpeedX);
            
            
            if(pelota.getTranslateY() < 0 || pelota.getTranslateY() > 350)
            { 
                ballSpeedY *= -1; 
            }
            pelota.setTranslateY(pelota.getTranslateY()+ ballSpeedY);                       
            
        };
                
        Timeline animacion = new Timeline(new KeyFrame(Duration.millis(5), evento));
        animacion.setCycleCount(Timeline.INDEFINITE);
        
        animacion.play();
        
        primaryStage.setTitle("TimeLine Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
