
/**@author DANIELA COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package GUI_FXML;

//LIBRERIAS IMPORTADAS PARA PODER INICIALIZAR LA INTERFAZ GRAFICA
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * PERMITE INICIALIZAR LA APLICACION CON
 * LA INTERFAZ GRAFICA DESARROLLADA CON LA
 * LIBRERIA JAVA_FX
 */
public class MainFX_KajiMaki extends Application {
    
    /**
     * METODO QUE INICIALIZA LA INTERFAZ GRÁFICA DE LA APLICACION 
     * @param primaryStage
     * @throws Exception 
     */
    public void start(Stage primaryStage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Vista_KajiMaki.fxml"));
            primaryStage.setTitle("Kaji Maki Sudoku");
            Scene scene = new Scene (root,1080,698);
            primaryStage.setScene(scene);
            primaryStage.show(); 
           
        }
        catch(Exception e){
            System.out.println("Starting error: " + e.getMessage());
        }  
    }
    
    /**METODO MAIN QUE EJECUTA LA CLASE START*/
    public static void main(String[] args) {
        launch(args);
    }

}

