/* <pre>
 * Proyecto: Calculadora
 * Materia: Estructuras de datos
 * Maestra: Silvia Guardati
 * Fecha de entrega: 21/02/2019
 * Equipo: Daniela Coello, Diego Merodio, Alvaro Romo , Diego Hernández
 * Clase: ConvierteAPostFija
 * @author Alvaro y Diego

 *</pre>
 */
package calculadora;

import pila.*;
import java.util.ArrayList;

/**
 * Clase que convierte una operacion en notacion infija, a notacion postfija. 
 * @author Alvaro y Diego. 
 */

public class ConvierteAPostFija {
    
    /**
     * Compila los metodos "strToArrayList" y "creaPostFija" para realizar la conversion de la cadena a notacion postfija.
     * @param <T> de tipo generico. 
     * @param cadena recibe el String capturado de la calculadora. 
     * @return lista ArrayList 
     */
    public static <T> ArrayList<Object> convierteAPostFija (String cadena){
        
        ArrayList<Object> lista= ConvierteAPostFija.strToArrayList(cadena);
        
        ArrayList<Object> listaPostFija = ConvierteAPostFija.creaPostFija(lista);
        
        return listaPostFija;
    }
    
    /**
     * Convierte la cadena recibida a una ArrayList con numeros en cada casilla y operadores en otras.
     * @param <T> de tipo generico
     * @param cadena recibe el String capturado de la calculadora
     * @return lista con los numeros, operadores y parentesis.
     */
    
    public static <T> ArrayList strToArrayList(String cadena){ 
        ArrayList<Object> lista = new ArrayList();
        String cad="";
        int i = 0;
        while(i < cadena.length()){
            if(AnalizaErrores.esOperadorOParentesis(cadena.charAt(i))){
               
                lista.add((Character)cadena.charAt(i));
                i++;
            }
            else{
                while(i < cadena.length() && !AnalizaErrores.esOperadorOParentesis(cadena.charAt(i))){
                    cad+=""+cadena.charAt(i);
                    i++;
                }
                lista.add(cad);
                cad="";
            }
        }
        return lista; 
    }
    
   
   /**
    * Convierte la cadena recibida de notacion infija a notacion portfija
    * @param entrada lista con los elementos del String reicbido de la calculadora
    * @return lista en notacion postfija
    */
    public static ArrayList<Object> creaPostFija(ArrayList<Object> entrada){
        ArrayList<Object> posFijo = new ArrayList<>();
        //Pila para guardar operadores
        Pila <Object> pila = new Pila <> ();
        
        //ITERAR STRING
        for(int i=0; i<entrada.size(); i++){
            //OBTENER CARACTER
            Object c= entrada.get(i);
            
            //NÚMERO (OPERANDO)
            
            if(c instanceof Character)
                switch((Character)c){
                    
                    //PARÉNTESIS DE APERTURA
                    case '(':
                        pila.push('(');
                        break;
                    
                   
                    //SUMA
                    case '+':
                        if(pila.isEmpty() || (Character)pila.peek()== '(' || (Character)pila.peek() == '[' || (Character)pila.peek() == '[')
                            pila.push(c);
                        else{
                                posFijo.add(pila.pop());
                                pila.push(c);
                        }    
                        break;
                    
                    //RESTA
                    case '–':
                        if(pila.isEmpty() || (Character)pila.peek() == '(' || (Character)pila.peek() == '[' || (Character)pila.peek() == '[')
                            pila.push(c);
                        else{
                                posFijo.add(pila.pop());
                                pila.push(c);
                        }    
                        break;
                    
                    //MULTIPLICACIÓN
                    case 'x':
                        if(pila.isEmpty() || (Character)pila.peek() == '(' || (Character)pila.peek() == '[' || (Character)pila.peek() == '{'){
                            pila.push(c);
                            break;
                        }
                        
                        
                        if((Character)pila.peek() == '+' || (Character)pila.peek() == '–' ){
                            pila.push(c);
                            break;
                        } 
                        
                        
                        if((Character)pila.peek() == 'x' || (Character)pila.peek() == '÷' || (Character)pila.peek() == '√' || (Character)pila.peek() == '^' ){
                            posFijo.add(pila.pop());
                            pila.push(c);
                        }
                        else
                            posFijo.add(pila.pop());
                        break;
                    
                    //DIVISIÓN
                    case '÷':
                        if(pila.isEmpty() || (Character)pila.peek() == '(' || (Character)pila.peek() == '[' || (Character)pila.peek() == '['){
                            pila.push(c);
                            break;
                        }
                        
                        
                        if((Character)pila.peek() == '+' || (Character)pila.peek() == '–' ){
                            pila.push(c);
                            break;
                        } 
                      
                        if((Character)pila.peek() == 'x' || (Character)pila.peek() == '÷' || (Character)pila.peek() == '√' || (Character)pila.peek() == '^'){
                            posFijo.add(pila.pop());
                            pila.push(c);
                            break;
                        }
                        else
                            posFijo.add(pila.pop());
                        break;
                    
                   
                    //PARÉNTESIS DE CIERRE
                    case ')':
                        while((Character)pila.peek() != '(')
                            posFijo.add(pila.pop());
                        pila.pop();
                        break;
                    
                }
            else //SI ES NÚMERO
                posFijo.add(entrada.get(i));
        }
        while(!pila.isEmpty()){
            posFijo.add(pila.pop());    
        }
        return posFijo;
    }
}
