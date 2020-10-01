/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda_actionevent;

import java.text.DecimalFormat;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



/**
 *
 * @author Eduardo Campos
 */
public class Lambda_ActionEvent extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {
        
        Label lFila1 = new Label("Annual Interest Rate: ");
        TextField tfFila1 = new TextField();
        tfFila1.setAlignment(Pos.BASELINE_RIGHT);
        
        Label lFila2 = new Label("Number of Years: ");
        TextField tfFila2 = new TextField();
        tfFila2.setAlignment(Pos.BASELINE_RIGHT);
        
        Label lFila3 = new Label("Loan Amount: ");
        TextField tfFila3 = new TextField();
        tfFila3.setAlignment(Pos.BASELINE_RIGHT);
        
        Label lFila4 = new Label("Monthly Payment: ");
        TextField tfFila4 = new TextField();
        tfFila4.setAlignment(Pos.BASELINE_RIGHT);
        
        Label lFila5 = new Label("Total Payment: ");
        TextField tfFila5 = new TextField();
        tfFila5.setAlignment(Pos.BASELINE_RIGHT);
                
        Button btn = new Button("Calculate");              
        
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        
        root.add(lFila1,0,0);
        root.add(tfFila1,1,0);
        
        root.add(lFila2,0,1);
        root.add(tfFila2,1,1);
        
        root.add(lFila3,0,2);
        root.add(tfFila3,1,2);
        
        root.add(lFila4,0,3);
        root.add(tfFila4,1,3);
        
        root.add(lFila5,0,4);
        root.add(tfFila5,1,4);
        
        root.add(btn,1,5);
        
        
        btn.setOnAction(e -> {
            
            float i;    // Anual Interes Rate
            float r;
            float n;    // Number of years
            float h;    // Loan Amountt
            float m;    // Montly Payment
            float tp;   // Total Payment            
            
            i = Float.valueOf(tfFila1.getText());
            r = (i / (100 * 12));
            n = Float.valueOf(tfFila2.getText());
            h = Float.valueOf(tfFila3.getText());
            
            m = (float) ((h * r) / (1 - Math.pow((1 + r), (-12 * n))));
            tp = (float) (m * 12 * n);
            
            /*
            tfFila4.setText(String.valueOf(m));
            tfFila5.setText(String.valueOf(tp));
            */
            
            tfFila4.setText(new DecimalFormat("#.##").format(m));
            tfFila5.setText(new DecimalFormat("#.##").format(tp));
            
        });
        
        
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora de prestamo");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
