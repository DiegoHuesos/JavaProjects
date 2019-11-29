/**@author DANIELA COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package CONJUNTO;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**CLASE ITERADOR_ARREGL
 * @param <T>O*/
public class IteradorArreglo <T> implements Iterator<T> {
    
    private T[] coleccion;
    private int total;
    private int actual;
    
    /**
     * METODO QUE CONSTRUYE EL ITERADOR DEL ARREGLO
     * ASIGNA EL ARREGLO DADO AL ARREGLO COLECCION
     * INICIALIZA EL TOTOAL Y EL ACTUAL EN CERO
     * @param arreglo
     * @param tot 
     */
    public IteradorArreglo(T[] arreglo, int tot){
        coleccion=arreglo;
        total=tot;
        actual=0;
    }
    
    /**
     * TE INDICA SI AUN EXISTE OTRO ELEMENTO EN EL ARREGLO
     * @return <ul>
     *          <li>TRUE: SI AUN HAY OTRO ELEMENTO</li>
     *          <li>FALSE: SI YA NO HAY OTRO ELEMENTO</li>
     *         </ul>
     */
    @Override
    public boolean hasNext(){
        return actual<total;
    }
    
    /**
     * TE REGRESA EL SIGUIENTE ELEMENTO DE LA COLECION SIN AFECTARLO
     * INCREMENTA LA POSICION DEL ACTUAL
     * @return RES 
     */
    @Override
    public T next(){
        if(hasNext()){
            T res = coleccion[actual];
            actual++;
            return res;
        }
        else{
            throw new NoSuchElementException();
        }
    }
    
    /**
     * USUALMENTE QUITARIA UN ELEMENTO SIN EMBARGO NO ES
     * UTILIZADO EN LA PRESENTE CLASE
     */
    @Override
    public void remove(){
        throw new UnsupportedOperationException("");
    }
}
