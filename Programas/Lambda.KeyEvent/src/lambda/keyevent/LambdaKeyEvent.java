/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.keyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import static javafx.scene.input.KeyCode.UP;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Eduardo Campos
 */
public class LambdaKeyEvent extends Application 
{    
    @Override
    public void start(Stage primaryStage) 
    {
        Text texto = new Text(20, 20, "A");
        
        Pane root = new Pane();
        root.getChildren().add(texto);
        
        Scene scene = new Scene(root, 300, 250); 
        
        scene.setOnKeyPressed(e -> {           
            switch(e.getCode())
            {
                case UP:
                    texto.setY(texto.getY() - 10);
                    break;
                case DOWN:
                    texto.setY(texto.getY() + 10);
                    break;
                case RIGHT:
                    texto.setX(texto.getX() + 10);
                    break;
                case LEFT:
                    texto.setX(texto.getX() - 10);
                    break;
                
                default:
                    
                    break;
            }            
        });
                       
        primaryStage.setTitle("KeyEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
