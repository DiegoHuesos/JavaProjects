/**@author DANIELA COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package CONJUNTO;

/**INTERFACE CONJUNTO_ADT*/
public interface ConjuntoADT <T> extends Iterable <T>{
    
    public boolean agrega (T elem);
    public T quita (T elem);
    public boolean contiene(T elem);
    public int getCardinalidad();
    public boolean estaVacio();
    
    public ConjuntoADT <T> union(ConjuntoADT <T> otro);
    public ConjuntoADT <T> interseccion(ConjuntoADT <T> otro);
    public ConjuntoADT <T> diferencia(ConjuntoADT <T> otro);
}
