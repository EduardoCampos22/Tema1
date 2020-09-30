/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Eduardo Campos
 */
public class AnonymousInnerClass extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {
        // Creacion de los botones
        Button bNew = new Button("New");
        Button bOpen = new Button("Open");
        Button bSave = new Button("Save");
        Button bPrint = new Button("Print");

        
        // Creación del panel en el que se colocaran los botones
        BorderPane root = new BorderPane(); 
        
        // Configuracion de la posicion de los botones
        HBox hBox = new HBox(8);     
        root.setCenter(hBox);
        hBox.getChildren().addAll(bNew, bOpen, bSave, bPrint);
        hBox.setAlignment(Pos.CENTER);
        
        
        
        bNew.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("Nuevo Proceso");
            }
        });
        
        bOpen.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("Abrir Proceso");
            }
        });
        
        bSave.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("Guardar Proceso");
            }
        });
        
        bPrint.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("Imprimir Proceso");
            }
        });
        
        
        Scene scene = new Scene(root, 300, 50);
        primaryStage.setScene(scene);
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    
    
    
}
