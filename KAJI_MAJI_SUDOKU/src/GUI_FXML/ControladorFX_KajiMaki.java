
/**@author DANIELA COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package GUI_FXML;

//LIBRERIAS IMPORTADAS PARA PODER ESCUCHAR EVENTOS Y UTILIZAR METODOS DE OTRAS CLASES
import CONJUNTO.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import CODE.*;

//CLASE ControladorFX_KajiMaki*
public class ControladorFX_KajiMaki extends MainFX_KajiMaki implements Initializable {
    
    //ATRIBUTOS O ELEMENTOS DEL FRAME
    public Button   b_0_0 , b_0_1 , b_0_2 , b_0_3 , b_0_4 , b_0_5 , b_0_6 , b_0_7 , b_0_8 ,
                    b_1_0 , b_1_1 , b_1_2 , b_1_3 , b_1_4 , b_1_5 , b_1_6 , b_1_7 , b_1_8 ,
                    b_2_0 , b_2_1 , b_2_2 , b_2_3 , b_2_4 , b_2_5 , b_2_6 , b_2_7 , b_2_8 ,
                    b_3_0 , b_3_1 , b_3_2 , b_3_3 , b_3_4 , b_3_5 , b_3_6 , b_3_7 , b_3_8 ,
                    b_4_0 , b_4_1 , b_4_2 , b_4_3 , b_4_4 , b_4_5 , b_4_6 , b_4_7 , b_4_8 ,
                    b_5_0 , b_5_1 , b_5_2 , b_5_3 , b_5_4 , b_5_5 , b_5_6 , b_5_7 , b_5_8 ,
                    b_6_0 , b_6_1 , b_6_2 , b_6_3 , b_6_4 , b_6_5 , b_6_6 , b_6_7 , b_6_8 ,
                    b_7_0 , b_7_1 , b_7_2 , b_7_3 , b_7_4 , b_7_5 , b_7_6 , b_7_7 , b_7_8 ,
                    b_8_0 , b_8_1 , b_8_2 , b_8_3 , b_8_4 , b_8_5 , b_8_6 , b_8_7 , b_8_8 ;
    public Label noSol;
    public Button b= b_0_0;
    public Button tecla;
    public String valTecla=" ";
    public int [][] matrix = new int[9][9];
    
    /**
     * "METODO SELECT"
     * ESCUCHA LA SELECCION DE UN BOTON Y GUARDA EL BOTON
     * SELECCIONADO EN UNA VARIABLE BUTTON ('B'), SE ASIGNA 
     * EL METODO A LOS BOTONES-CASILLAS EN EL ARCHIVO .FXML
     * @param e 
     */
    @FXML
    public void select (Event e){
            try{
                b= (Button)e.getTarget();
            }
            catch(Exception ete){
                System.out.println("Error");
            }                     
    }
    
    /**
    * "METODO AUXILIAR 'NUM_REPETIDO' PARA EL METODO 'SET_VALOR' "
    * OBTIENE LA POSICION DEL BOTON SELECCIONADO Y VERIFICA QUE EL 
    * NUMERO DADO POR EL PARAMETRO NO SE ENCUENTRE EN EL CONJUNTO,
    * EN SU DEFECTO, LANZA UN ERROR.
    * @param n 
    */
    private void numRepetido(int n){
        int i = Integer.parseInt( ""+b.getId().charAt(2) );
        int j = Integer.parseInt( ""+b.getId().charAt(4) );
        SudokuKaji su = new SudokuKaji(matrix);
        ConjuntoADT<Integer> posibles = su.numerosPosibles(i,j);
        if(!posibles.contiene(n))
            throw new RuntimeException("Error: número repetido.");
    }
    
    /**
     * "METODO PULSA_NUM"
     * ESCUCHA LA SELECCION DE UN BOTON Y GUARDA EL BOTON
     * SELECCIONADO EN UNA VARIABLE BUTTON ('B'), SE ASIGNA 
     * EL METODO A LOS BOTONES-CASILLAS EN EL ARCHIVO .FXML
     * @param e 
     */
    @FXML
    public void pulsaNum(Event e){
        try{    
            valTecla=  (((Button)e.getTarget()).getText()) ;
            int numTecla= Integer.parseInt(valTecla);
            
            jalaNumAMatriz();
            
            numRepetido(numTecla);  
            b.setText(valTecla);
            noSol.setText(" ");
        }
        catch(Exception ete){
            System.out.println("Error: ya está ese número.");
            noSol.setText("Ya está ese número.");
        } 
    }
    
    /**
     * "METODO BORRA_UNO"
     * ASIGNA UN VALOR VACIO (" ") A LA CASILLA SELECCIONADA
     */
    @FXML
    public void borraUno(){
        b.setText(" ");
        noSol.setText(" ");
    }
    
    /**
     * "METODO CLEAR"
     * COLOCA A TODAS LAS CASILLAS DE LA 
     * INTERFAZ CON UN VALOR VACIO (" ")
     */
    @FXML
    public void clear(){
        noSol.setText(" ");
        
        b_0_0.setText(" ");
        b_0_1.setText(" ");
        b_0_2.setText(" ");
        b_0_3.setText(" ");
        b_0_4.setText(" ");
        b_0_5.setText(" ");
        b_0_6.setText(" ");
        b_0_7.setText(" ");
        b_0_8.setText(" ");
        b_1_0.setText(" ");
        b_1_1.setText(" ");
        b_1_2.setText(" ");
        b_1_3.setText(" ");
        b_1_4.setText(" ");
        b_1_5.setText(" ");
        b_1_6.setText(" ");
        b_1_7.setText(" ");
        b_1_8.setText(" ");
        b_2_0.setText(" ");
        b_2_1.setText(" ");
        b_2_2.setText(" ");
        b_2_3.setText(" ");
        b_2_4.setText(" ");
        b_2_5.setText(" ");
        b_2_6.setText(" ");
        b_2_7.setText(" ");
        b_2_8.setText(" ");
        b_3_0.setText(" ");
        b_3_1.setText(" ");
        b_3_2.setText(" ");
        b_3_3.setText(" ");
        b_3_4.setText(" ");
        b_3_5.setText(" ");
        b_3_6.setText(" ");
        b_3_7.setText(" ");
        b_3_8.setText(" ");
        b_4_0.setText(" ");
        b_4_1.setText(" ");
        b_4_2.setText(" ");
        b_4_3.setText(" ");
        b_4_4.setText(" ");
        b_4_5.setText(" ");
        b_4_6.setText(" ");
        b_4_7.setText(" ");
        b_4_8.setText(" ");
        b_5_0.setText(" ");
        b_5_1.setText(" ");
        b_5_2.setText(" ");
        b_5_3.setText(" ");
        b_5_4.setText(" ");
        b_5_5.setText(" ");
        b_5_6.setText(" ");
        b_5_7.setText(" ");
        b_5_8.setText(" ");
        b_6_0.setText(" ");
        b_6_1.setText(" ");
        b_6_2.setText(" ");
        b_6_3.setText(" ");
        b_6_4.setText(" ");
        b_6_5.setText(" ");
        b_6_6.setText(" ");
        b_6_7.setText(" ");
        b_6_8.setText(" ");
        b_7_0.setText(" ");
        b_7_1.setText(" ");
        b_7_2.setText(" ");
        b_7_3.setText(" ");
        b_7_4.setText(" ");
        b_7_5.setText(" ");
        b_7_6.setText(" ");
        b_7_7.setText(" ");
        b_7_8.setText(" ");
        b_8_0.setText(" ");
        b_8_1.setText(" ");
        b_8_2.setText(" ");
        b_8_3.setText(" ");
        b_8_4.setText(" ");
        b_8_5.setText(" ");
        b_8_6.setText(" ");
        b_8_7.setText(" ");
        b_8_8.setText(" ");
    }
    
    /**
     * "METODO AUXILIAR 'TO_INT' PARA EL METODO 'JALA_NUM_A_MATRIZ' "
     * @param b
     * @return valor entero de la casilla
     * OBTIENE EL VALOR DEL BOTON DADO COMO PARAMETRO Y LO REGRESA
     * COMO ENTERO
     */
    private int toInt(Button b){
        if(b.getText().equals(" ") || b.getText().equals(""))
            return 0;
        else
            return Integer.parseInt(b.getText());
    }
    
    /**
     * OBTIENE TODOS LOS VALORES DE LOS BOTONES Y LOS COLOCA EN SU 
     * RESPECTIVA CASILLA EN LA MATRIZ DEL OBJETO SUDOKU
     */
    private void jalaNumAMatriz(){
        matrix[0][0] = toInt(b_0_0);
        matrix[0][1] = toInt(b_0_1);
        matrix[0][2] = toInt(b_0_2);
        matrix[0][3] = toInt(b_0_3);
        matrix[0][4] = toInt(b_0_4);
        matrix[0][5] = toInt(b_0_5);
        matrix[0][6] = toInt(b_0_6);
        matrix[0][7] = toInt(b_0_7);
        matrix[0][8] = toInt(b_0_8);
        matrix[1][0] = toInt(b_1_0);
        matrix[1][1] = toInt(b_1_1);
        matrix[1][2] = toInt(b_1_2);
        matrix[1][3] = toInt(b_1_3);
        matrix[1][4] = toInt(b_1_4);
        matrix[1][5] = toInt(b_1_5);
        matrix[1][6] = toInt(b_1_6);
        matrix[1][7] = toInt(b_1_7);
        matrix[1][8] = toInt(b_1_8);
        matrix[2][0] = toInt(b_2_0);
        matrix[2][1] = toInt(b_2_1);
        matrix[2][2] = toInt(b_2_2);
        matrix[2][3] = toInt(b_2_3);
        matrix[2][4] = toInt(b_2_4);
        matrix[2][5] = toInt(b_2_5);
        matrix[2][6] = toInt(b_2_6);
        matrix[2][7] = toInt(b_2_7);
        matrix[2][8] = toInt(b_2_8);
        matrix[3][0] = toInt(b_3_0);
        matrix[3][1] = toInt(b_3_1);
        matrix[3][2] = toInt(b_3_2);
        matrix[3][3] = toInt(b_3_3);
        matrix[3][4] = toInt(b_3_4);
        matrix[3][5] = toInt(b_3_5);
        matrix[3][6] = toInt(b_3_6);
        matrix[3][7] = toInt(b_3_7);
        matrix[3][8] = toInt(b_3_8);
        matrix[4][0] = toInt(b_4_0);
        matrix[4][1] = toInt(b_4_1);
        matrix[4][2] = toInt(b_4_2);
        matrix[4][3] = toInt(b_4_3);
        matrix[4][4] = toInt(b_4_4);
        matrix[4][5] = toInt(b_4_5);
        matrix[4][6] = toInt(b_4_6);
        matrix[4][7] = toInt(b_4_7);
        matrix[4][8] = toInt(b_4_8);
        matrix[5][0] = toInt(b_5_0);
        matrix[5][1] = toInt(b_5_1);
        matrix[5][2] = toInt(b_5_2);
        matrix[5][3] = toInt(b_5_3);
        matrix[5][4] = toInt(b_5_4);
        matrix[5][5] = toInt(b_5_5);
        matrix[5][6] = toInt(b_5_6);
        matrix[5][7] = toInt(b_5_7);
        matrix[5][8] = toInt(b_5_8);
        matrix[6][0] = toInt(b_6_0);
        matrix[6][1] = toInt(b_6_1);
        matrix[6][2] = toInt(b_6_2);
        matrix[6][3] = toInt(b_6_3);
        matrix[6][4] = toInt(b_6_4);
        matrix[6][5] = toInt(b_6_5);
        matrix[6][6] = toInt(b_6_6);
        matrix[6][7] = toInt(b_6_7);
        matrix[6][8] = toInt(b_6_8);
        matrix[7][0] = toInt(b_7_0);
        matrix[7][1] = toInt(b_7_1);
        matrix[7][2] = toInt(b_7_2);
        matrix[7][3] = toInt(b_7_3);
        matrix[7][4] = toInt(b_7_4);
        matrix[7][5] = toInt(b_7_5);
        matrix[7][6] = toInt(b_7_6);
        matrix[7][7] = toInt(b_7_7);
        matrix[7][8] = toInt(b_7_8);
        matrix[8][0] = toInt(b_8_0);
        matrix[8][1] = toInt(b_8_1);
        matrix[8][2] = toInt(b_8_2);
        matrix[8][3] = toInt(b_8_3);
        matrix[8][4] = toInt(b_8_4);
        matrix[8][5] = toInt(b_8_5);
        matrix[8][6] = toInt(b_8_6);
        matrix[8][7] = toInt(b_8_7);
        matrix[8][8] = toInt(b_8_8); 
    }
    
    /**
     * OBTIENE LOS VALORES DE LA INTERFAZ GRAFICA CON EL 
     * METODO 'JALA_NUM_A_MATRIZ()', CREA UN OBJETO DE LA 
     * CLASE SUDOKU_KAJI Y RESUELVE EL SUDOKU.
     * SI TARDA MAS DE 15 SEGUNDOS DETIENE EL PROCESO CON
     * UN ERROR Y MANDA UN MENSAJE A LA INTERFAZ. SI NO TIENE
     * SOLUCION MANDA UN MENSAJE EN LA INTERFAZ. SI SI TIENE 
     * SOLUCION, ENVIA U MENSAJE A PANTALLA Y ASIGNA EL RESULTADO 
     * A LAS CASILLAS DE LA INTERFAZ.
     */
    public void solve(){
        
        jalaNumAMatriz();

        SudokuKaji sudo = new SudokuKaji(matrix);
        
        try{
            sudo.resuelve();
        }catch(Exception e){
            noSol.setText("Exceso de tiempo o memoria");
            throw new RuntimeException("Tiempo");
        }
        
        if(!sudo.estaLleno())
            noSol.setText("¡No tiene solución!");
        else{
            noSol.setText("¡Solución exitosa!");
            b_0_0.setText(""+matrix[0][0]);
            b_0_1.setText(""+matrix[0][1]);
            b_0_2.setText(""+matrix[0][2]);
            b_0_3.setText(""+matrix[0][3]);
            b_0_4.setText(""+matrix[0][4]);
            b_0_5.setText(""+matrix[0][5]);
            b_0_6.setText(""+matrix[0][6]);
            b_0_7.setText(""+matrix[0][7]);
            b_0_8.setText(""+matrix[0][8]);
            b_1_0.setText(""+matrix[1][0]);
            b_1_1.setText(""+matrix[1][1]);
            b_1_2.setText(""+matrix[1][2]);
            b_1_3.setText(""+matrix[1][3]);
            b_1_4.setText(""+matrix[1][4]);
            b_1_5.setText(""+matrix[1][5]);
            b_1_6.setText(""+matrix[1][6]);
            b_1_7.setText(""+matrix[1][7]);
            b_1_8.setText(""+matrix[1][8]);
            b_2_0.setText(""+matrix[2][0]);
            b_2_1.setText(""+matrix[2][1]);
            b_2_2.setText(""+matrix[2][2]);
            b_2_3.setText(""+matrix[2][3]);
            b_2_4.setText(""+matrix[2][4]);
            b_2_5.setText(""+matrix[2][5]);
            b_2_6.setText(""+matrix[2][6]);
            b_2_7.setText(""+matrix[2][7]);
            b_2_8.setText(""+matrix[2][8]);
            b_3_0.setText(""+matrix[3][0]);
            b_3_1.setText(""+matrix[3][1]);
            b_3_2.setText(""+matrix[3][2]);
            b_3_3.setText(""+matrix[3][3]);
            b_3_4.setText(""+matrix[3][4]);
            b_3_5.setText(""+matrix[3][5]);
            b_3_6.setText(""+matrix[3][6]);
            b_3_7.setText(""+matrix[3][7]);
            b_3_8.setText(""+matrix[3][8]);
            b_4_0.setText(""+matrix[4][0]);
            b_4_1.setText(""+matrix[4][1]);
            b_4_2.setText(""+matrix[4][2]);
            b_4_3.setText(""+matrix[4][3]);
            b_4_4.setText(""+matrix[4][4]);
            b_4_5.setText(""+matrix[4][5]);
            b_4_6.setText(""+matrix[4][6]);
            b_4_7.setText(""+matrix[4][7]);
            b_4_8.setText(""+matrix[4][8]);
            b_5_0.setText(""+matrix[5][0]);
            b_5_1.setText(""+matrix[5][1]);
            b_5_2.setText(""+matrix[5][2]);
            b_5_3.setText(""+matrix[5][3]);
            b_5_4.setText(""+matrix[5][4]);
            b_5_5.setText(""+matrix[5][5]);
            b_5_6.setText(""+matrix[5][6]);
            b_5_7.setText(""+matrix[5][7]);
            b_5_8.setText(""+matrix[5][8]);
            b_6_0.setText(""+matrix[6][0]);
            b_6_1.setText(""+matrix[6][1]);
            b_6_2.setText(""+matrix[6][2]);
            b_6_3.setText(""+matrix[6][3]);
            b_6_4.setText(""+matrix[6][4]);
            b_6_5.setText(""+matrix[6][5]);
            b_6_6.setText(""+matrix[6][6]);
            b_6_7.setText(""+matrix[6][7]);
            b_6_8.setText(""+matrix[6][8]);
            b_7_0.setText(""+matrix[7][0]);
            b_7_1.setText(""+matrix[7][1]);
            b_7_2.setText(""+matrix[7][2]);
            b_7_3.setText(""+matrix[7][3]);
            b_7_4.setText(""+matrix[7][4]);
            b_7_5.setText(""+matrix[7][5]);
            b_7_6.setText(""+matrix[7][6]);
            b_7_7.setText(""+matrix[7][7]);
            b_7_8.setText(""+matrix[7][8]);
            b_8_0.setText(""+matrix[8][0]);
            b_8_1.setText(""+matrix[8][1]);
            b_8_2.setText(""+matrix[8][2]);
            b_8_3.setText(""+matrix[8][3]);
            b_8_4.setText(""+matrix[8][4]);
            b_8_5.setText(""+matrix[8][5]);
            b_8_6.setText(""+matrix[8][6]);
            b_8_7.setText(""+matrix[8][7]);
            b_8_8.setText(""+matrix[8][8]);
        }
        
    }
   
    /**
     * METODO MAIN QUE INICIALIZA LA INTERFAZ GRAFICA
     * PARA REALIZAR LAS DISTINTAS PRUEBAS
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Inicializado"); 
    }  
}


