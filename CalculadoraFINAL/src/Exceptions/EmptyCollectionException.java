/* <pre>
 * Proyecto: Calculadora
 * Materia: Estructuras de datos
 * Maestra: Silvia Guardati
 * Fecha de entrega: 21/02/2019
 * Equipo: Daniela Coello, Diego Merodio, Alvaro Romo , Diego Hernández
 * Clase: EmptyCollectionException
 *</pre>
 */
package Exceptions;

/**
 * Clase que contiene los metodos para las posibles excepciones que pudieran ocurrir en otros metodos. 
 * 
 */


public class EmptyCollectionException extends RuntimeException {
    
    /**
     * Construye una coleccion vacia de la libreria EmptyCollectionExcpetion
     */
    public EmptyCollectionException(){
        super("Coleccion vacia");
    }
    /**
     * Construye una instancia de la libreria EmptyCollectionException a partir de una cadena recibida
     * @param cadena generalmente sera un texto que se arrojara cuando haya una excepcion. 
     */
    public EmptyCollectionException(String cadena){
        super(cadena);
    }
            

}