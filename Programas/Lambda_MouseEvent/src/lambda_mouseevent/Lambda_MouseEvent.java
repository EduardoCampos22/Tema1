/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda_mouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Eduardo Campos
 */
public class Lambda_MouseEvent extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {
        Text text = new Text("Programming is fun");
        
        text.setX(50);
        text.setY(50);
        
        Pane root = new Pane();
        root.getChildren().add(text);        
                
        text.setOnMouseDragged(e -> {
            
            text.setX(e.getX());
            text.setY(e.getY());                        
        });
        

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("MouseEvent");
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
