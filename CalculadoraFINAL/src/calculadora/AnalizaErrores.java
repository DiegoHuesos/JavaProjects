/* <pre>
 * Proyecto: Calculadora
 * Materia: Estructuras de datos
 * Maestra: Silvia Guardati
 * Fecha de entrega: 21/02/2019
 * Equipo: Daniela Coello, Diego Merodio, Alvaro Romo , Diego Hernández
 * Clase: AnalizaErrores
 *</pre>
 */


package calculadora;


import pila.*;
import Exceptions.*;
import java.util.ArrayList;

/**
 * Clase que analiza los posibles errores en la captura de los datos ingresados por el usuario para realizar la operacion.
 * 
 */
public class AnalizaErrores {
    
    /**
     * Revisa que no haya operadores en los extremos y que no haya dos operadores juntos. 
     * @param cadena recibe el String capturado de la calculadora.
     * @return <ul>
     *      <li>true: si todos los operadores son consistentes.
     *      <li>false: si hay alguna inconsistencia de operadores juntos o en los extremos.
     *      </ul> 
     *      
     */
    public static boolean revisaOperadores(String cadena){
        boolean res = true;
        int i = 0;
        boolean sigue = true;
        if(cadena.charAt(0)=='+' || cadena.charAt(0) == '–' || cadena.charAt(0) == '*' || cadena.charAt(0)=='÷'
                || cadena.charAt(cadena.length()-1)=='+' || cadena.charAt(cadena.length()-1) == '–' || cadena.charAt(cadena.length()-1) == '*' 
                || cadena.charAt(cadena.length()-1)=='÷'){
            res = false;
            throw new ErrorDeSintaxis("Operador extremo");
        }
        else{
            while(i < cadena.length() && sigue){
                if(cadena.charAt(i)!= '+' && cadena.charAt(i)!= '–'&& cadena.charAt(i)!='*'
                        && cadena.charAt(i)!='÷')
                    i++;
                else{
                    if(cadena.charAt(i+1)=='+' || cadena.charAt(i+1) == '–' || cadena.charAt(i+1) == '*'
                            || cadena.charAt(i+1) == '÷'){
                        sigue = false;
                        throw new ErrorDeSintaxis("Operadores juntos");
                    }
                    else
                        i++;
                    
                }
                
            }
        }
        return sigue && res;
    }
    
    /**
     * Revisa que los parentesis de la expresion sean consistentes. 
     * @param cadena recibe la cadena (String) capturada por la Interfaz gráfica de la calculadora.
     * @return <ul>
     *      <li>true: si todos los parentesis son consistentes.
     *      <li>false: si hay alguna inconsistencia de parentesis como que falte alguno de apertura o cierre.
     *      </ul>
     * 
     */
    public static boolean revisarParentesis(String cadena){
        Pila<Character> aux = new Pila();
        int i = 0;
        boolean sigue = true;
        while(i < cadena.length() && sigue){
            if(cadena.charAt(i)=='(')
                aux.push(cadena.charAt(i));
            else{
                if(cadena.charAt(i)==')'){
                    if(aux.isEmpty()){
                        sigue = false;
                        
                    }
                    else
                         aux.pop();
                }
            }
            i++;
        }
        if(!aux.isEmpty() || !sigue)
            throw new ErrorDeSintaxis("Error: Parentesis");
        return aux.isEmpty() && sigue;
    }
    /**
     * Se asegura que no haya divisiones entre cero. 
     * @param cadena recibe la cadena (String) capturada por la Interfaz gráfica de la calculadora.
     * @return <ul>
     *      <li>true: si el dividendo es distinto de cero.
     *      <li>false: si el dividendo es igual a cero.
     *      </ul>
     * @throws ErrorDeSintaxis hay un error de division entre cero. 
     */
    public static boolean noDividirCero(String cadena){
        int i = 0;
        while(i<cadena.length()-1){
            if(cadena.charAt(i) == '÷' && cadena.charAt(i+1) == '0'){
                throw new ErrorDeSintaxis("Error: ÷0");
            }
            i++;
        }
        return true;
    }
    
    /**
     * Revisa si un caracter determinado es un operador o un parentesis
     * @param c recibe el caracter que se va a revisar
      * @return <ul>
     *      <li>true: si el caracter recibido es un operador o un parentesis.
     *      <li>false: si el caracter recibido no es un operador o parentesis. 
     *      </ul>
    */
    public static boolean esOperadorOParentesis(char c){
        boolean res = false;
        if(c =='+' || c=='–' || c=='x' || c=='÷' || c=='(' || c == ')') // la m va a ser el operador menos
            res = true;
        return res;
    }
    
    
   
    /**
     * Revisa que no haya un punto al final de la expresion, y que no haya puntos seguidos. 
     * @param cadena recibe el String capturado de la calculadora.
     * @return <ul>
     *      <li>true: si no hay un punto en el extremo o si no hay puntos seguidos.
     *      <li>false: si hay un punto en el extremo o si hay puntos seguidos
     *      </ul>
     * @throws ErrorDeSintaxis si hay puntos en el extremo.
     * @throws ErrorDeSintaxis si hay puntos seguidos. 
     *       
     *      
     * 
     */
    public static boolean revisaPuntos(String cadena){
        int i = 0;
        if(cadena.charAt(0)=='.'|| cadena.charAt(cadena.length()-1)=='.'){
            throw new ErrorDeSintaxis("Punto en extremo");
        }
        else{
            while(i < cadena.length()){
                if(cadena.charAt(i)!='.')
                    i++;
                else{
                    if(cadena.charAt(i+1)=='.'){
                        throw new ErrorDeSintaxis("Puntos seguidos");
                    }
                    else
                        i++;
                }
            }
        }
        return true;
    }
    /**
     * Revisa que no haya signos mal puestos, por ejemplo dos signos negativo juntos. 
     * @param cadena recibe el String capturado de la calculadora
     * @return <ul>
     *      <li>true: si no hay signos juntos.
     *      </ul>
     * @throws ErrorDeSintaxis hay signos juntos.
     
     */
    
    public static boolean revisaSignos(String cadena){
        boolean res;
        int i = 0;
        while(i < cadena.length()){
            if(cadena.charAt(i)!='–'){
                i++;
            }
            else{
                if(cadena.charAt(i+1)=='–')
                    throw new ErrorDeSintaxis("Signos juntos");
                else
                    i++;
            }          
        }
        return true;
        
    }
    
    public static boolean OperadorEntreParentesis(String cadena){
        int i = 0;
        while(i < cadena.length()){
            if(cadena.charAt(i)!='(')
                i++;
            else
                if(AnalizaErrores.esOperadorOParentesis(cadena.charAt(i+1)))
                    throw new ErrorDeSintaxis("Operador entre parentesis");
        }
        return true;
    }
    
    public static boolean hayOperador(String cadena){
        boolean res = false;
        int i = 0;
        while(i < cadena.length() && res){
            if(cadena.charAt(i) == '+' || cadena.charAt(i)=='–' || cadena.charAt(i)=='x' || cadena.charAt(i)=='÷')
                res = true;
            i++;
        }
        if(!res) // es decir que no haya encontrador ningun operador (== false por claridad)
            throw new ErrorDeSintaxis("No hay operadores");
        return res;
    }
    
   /**
    * Compila todos los metodos para calcular los posibles errores que se pudieran presentar
    * @param cadena recibe el String capturado de la computadora
    * 
    */
    
    public static void analizaErrores(String cadena){
        AnalizaErrores.revisarParentesis(cadena);
        AnalizaErrores.revisaSignos(cadena);
        AnalizaErrores.revisaOperadores(cadena);
        AnalizaErrores.revisaPuntos(cadena);
        AnalizaErrores.noDividirCero(cadena);
        
    }
    
}
