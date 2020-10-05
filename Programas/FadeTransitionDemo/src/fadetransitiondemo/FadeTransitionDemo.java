/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadetransitiondemo;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Eduardo Campos
 */
public class FadeTransitionDemo extends Application 
{    
    @Override
    public void start(Stage primaryStage) 
    {                
        // Creacion del Pane
        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 300);
     
        // Creacion de la Elipse
        Ellipse elipse = new Ellipse(150, 150, 100, 70);
        elipse.setFill(Color.RED);
        root.getChildren().add(elipse);
        
        // Creacion del FadeTransition y diseño
        FadeTransition fade = new FadeTransition();
        fade.setDuration(new Duration(4000));
        fade.setNode(elipse);
        fade.setFromValue(1.0); 
        fade.setToValue(0.1);
        fade.setCycleCount(Timeline.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();
        
        // Eventos
        elipse.setOnMousePressed(e->fade.pause()); 
        elipse.setOnMouseReleased(e->fade.play());
        
        primaryStage.setTitle("FadeTransition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
