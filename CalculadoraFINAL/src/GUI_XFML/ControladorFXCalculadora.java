/* <pre>
 * Proyecto: Calculadora
 * Materia: Estructuras de datos
 * Maestra: Silvia Guardati
 * Fecha de entrega: 21/02/2019
 * Equipo: Daniela Coello, Diego Merodio, Alvaro Romo , Diego Hernández
 * Clase: ControladorFXCalculadora
 *</pre>
 */
package GUI_XFML;

import calculadora.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * Clase que controla la interfaz grafica. 
 * 
 */


public class ControladorFXCalculadora implements Initializable {
    
    /**
     * Se declaran los botones de la interfaz grafica. 
     */
    public Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, 
                  op, resp;
    
    @Override
    /**
     * Inicializa el la casilla que recibe la operacion.
     * @param URL url, ResourceBundle rb
     */
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Inicializado"); 
    }    
    
    /** 
     * Elimina todos los elementos que haya en el campo de texto donde se recibe el String
    */
    public void borraTodo(){
            this.op.setText("");
            this.resp.setText("");
    }
    
    /**
     * Borra el ultimo elemento recibido 
     */
    public void borra(){
        try{
            String str= this.op.getText();
            this.op.setText( str.substring(0, str.length()-1) );
            this.resp.setText("");
        }
        catch(Exception e){
        }
    }
    
    /**
     * Cambia el texto de "op" a los numeros del 0-9, asi como a los operadores "+","-","/","x".
     * Aplica para todos los sets a continuacion.
     */
    public void set0(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"0");
    }
    public void set1(){
        this.op.setText(this.op.getText()+"1");
    }
    public void set2(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"2");
    }
    public void set3(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"3");
    }
    public void set4(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"4");
    }
    public void set5(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"5");
    }
    public void set6(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"6");
    }
    public void set7(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"7");
    }
    public void set8(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"8");
    }
    public void set9(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"9");
    }
    public void setPunto(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+".");
    }
    public void setMas(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"+");
    }
    public void setMenos(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"–");
    }
    public void setPor(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"x");
    }
    public void setDiv(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"÷");
    }
    public void setPA(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+"(");
    }
    public void setPC(){
        this.resp.setText("");
        this.op.setText(this.op.getText()+")");
    }
    public void setSigno(){
        try{
            String str=this.op.getText();
            
            char last=str.charAt(str.length()-1);

            if(!AnalizaErrores.esOperadorOParentesis(last)){    
                if(str.length()>1){    
                    char antiLast=str.charAt(str.length()-2);
                    if(antiLast== '-'){
                        this.op.setText(str.substring(0, str.length()-2)+last);
                        System.out.println("a"+str.substring(0, str.length()-2)+last);
                    }else{
                        this.op.setText(str.substring(0, str.length()-1)+"-"+last);
                        System.out.println("c"+str.substring(0, str.length()-1)+last);
                    }

                }else{
                    this.op.setText(str.substring(0, str.length()-1)+"-"+last);
                    System.out.println("c"+str.substring(0, str.length()-1)+last);
                }
            }  
        }catch(Exception e){
         }
    }
    
    /**
     * Resuelve la operacion insertada haciendo uso de los metodos de las clases "AnalizaErrores", "ConvierteAPostFija" y "ResuelveExpresion".
     */
    
    public void solve(){
        //0)Obtenemos la cadena de las operaciones de la calculadora:
        String entrada = this.op.getText();
        
        //0.1)Preguntamos si la cadena no esta vacía:
        if(!entrada.equals("")){
            
            try{
                //1)Verificamos errores:
                AnalizaErrores.analizaErrores(entrada);

                //2)Convertimos la expresión dada en una expresión postfija
                ArrayList<Object> list1= ConvierteAPostFija.convierteAPostFija(entrada);

                //3)Solucionamos la expresión:
                System.out.println(entrada);
                System.out.println(list1.toString());
                double resultado=ResuelveExpresion.ejecutaOperaciones(list1);

                //4)Colocamos resultado en la calculadora:
                String resp= ""+resultado;
                System.out.println(resp+"\n");
                this.resp.setText(resp);
            }
            catch(Exception e){
                this.resp.setText(e.getMessage());
                System.out.println(e.getMessage());
            }
        }
    }
}
