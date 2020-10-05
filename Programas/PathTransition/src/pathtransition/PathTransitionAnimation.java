/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathtransition;


import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;



/**
 *
 * @author Eduardo Campos
 */
public class PathTransitionAnimation extends Application 
{    
    @Override
    public void start(Stage primaryStage) 
    {                
        // Creacion del Pane
        Pane root = new Pane();                
        Scene scene = new Scene(root, 300, 300);
        
        // Creacion del circulo
        Circle circle = new Circle(150, 150, 70);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
                
        // Creacion del rectangulo
        Rectangle rect = new Rectangle(100, 40,60, 30);
        rect.setFill(Color.ORANGE);
        rect.setScaleX(0.5);
        rect.setScaleY(2);             
                
        // Agregamos el circulo y el rectangulo al Pane
        root.getChildren().add(circle);
        root.getChildren().add(rect);
                
        // Creacion del PathTransition y configuracion
        PathTransition path = new PathTransition(); 
        path.setDuration(new Duration(4000)); 
        path.setPath(circle);        
        path.setNode(rect); 
        path.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);  
        path.setCycleCount(Timeline.INDEFINITE);
        path.play();
        
        // Eventos
        circle.setOnMousePressed(e->path.pause()); 
        circle.setOnMouseReleased(e->path.play());
        
        
        primaryStage.setTitle("PathTransition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
