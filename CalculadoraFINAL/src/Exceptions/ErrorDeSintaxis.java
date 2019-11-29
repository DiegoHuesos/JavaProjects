/* <pre>
 * Proyecto: Calculadora
 * Materia: Estructuras de datos
 * Maestra: Silvia Guardati
 * Fecha de entrega: 21/02/2019
 * Equipo: Daniela Coello, Diego Merodio, Alvaro Romo , Diego Hernández
 * Clase: ErrorDeSintaxis
 *</pre>
 */
package Exceptions;
/**
 * Clase que lanza una excepcion cuando el error es de sintaxis. 
 * 
 */


public class ErrorDeSintaxis extends RuntimeException{
    
    public ErrorDeSintaxis(String cadena){
        super(cadena);
    }
}
