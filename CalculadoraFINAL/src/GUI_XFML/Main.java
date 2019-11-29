/* <pre>
 * Proyecto: Calculadora
 * Materia: Estructuras de datos
 * Maestra: Silvia Guardati
 * Fecha de entrega: 21/02/2019
 * Equipo: Daniela Coello, Diego Merodio, Alvaro Romo , Diego Hernández
 * Clase: Main 
 *</pre>
 */
package GUI_XFML;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * Clase Main para probar la interfaz grafica. 
 * @author Diego Hernandez
 */

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        try{
            Parent root = FXMLLoader.load(getClass().getResource("VistaFXCalculadora.fxml"));
            primaryStage.setTitle("Calculadora");
            primaryStage.setScene(new Scene (root,300,500));
            primaryStage.show();
            
        }catch(IOException e){
            
        }  
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
