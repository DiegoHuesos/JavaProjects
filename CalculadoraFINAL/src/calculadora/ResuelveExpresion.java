/* <pre>
 * Proyecto: Calculadora
 * Materia: Estructuras de datos
 * Maestra: Silvia Guardati
 * Fecha de entrega: 21/02/2019
 * Equipo: Daniela Coello, Diego Merodio, Alvaro Romo , Diego Hernández
 * 
 *</pre>
 */
package calculadora;

import java.util.ArrayList;
import pila.*;
import Exceptions.*;

/**
 * Clase que resuelve los diferentes tipos de operaciones. 
 * @author Alvaro y Diego
 */

public class ResuelveExpresion {
    
     /**
     * Ejecuta las operaciones que puede realizar la calculadora, haciendo uso de pilas. 
     * @param listaPosFijo se obtiene del metodo "listaPosFijo".
     * @return resultado de la operacion
     */
    
    public static double ejecutaOperaciones(ArrayList<Object> listaPosFijo){
        Pila<Object> pilaA = new Pila();
        Pila<Double> pilaB = new Pila();
        double resp=0;
        double v1=0;
        double v2=0;
        Character op;
        
        for(int i=listaPosFijo.size()-1 ; i>=0; i--){
            pilaA.push(listaPosFijo.get(i));
        }
        
        while(! pilaA.isEmpty()){
            if(pilaA.peek() instanceof String){
                pilaB.push( Double.parseDouble( (String)pilaA.pop() ) );
            }else{
                op= (Character)pilaA.pop();
                v2=pilaB.pop();
                v1=pilaB.pop();
                
                switch(op){
                    case '+':
                        resp = v1 + v2;
                        pilaB.push(resp);
                        break;
                        
                    case '–':
                        resp = v1 - v2;
                        pilaB.push(resp);
                        break;
                        
                    case 'x':
                        resp = v1 * v2;
                        pilaB.push(resp);
                        break;
                        
                    case '÷':
                        resp = v1 / v2;
                        if(v2 == 0)
                            throw new ErrorDeSintaxis("Error: ÷0");
                        pilaB.push(resp);
                        break;
                }
            }
              
        }
        return resp;
    }
    
   
    
    
}
