/**@author DANIELA COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package CONJUNTO;

import java.util.Iterator;

// CLASE CONJUNTO
public class ConjuntoA <T> implements ConjuntoADT <T> {
    
    private T [] conjunto;
    private int cardinalidad;
    private final int MAX = 20;
    
    /**
     * CONSTRUYE EL OBJECTO CONJUNTO_A
     * INICIALIZA EL ARREGLO GENERICO CON UNA LONGITUD DE LA CONSTANTE MAX
     * E INICIALIZA LA CARDINALIDAD EN CERO
     */
    public ConjuntoA(){
        conjunto = (T[]) new Object[MAX];
        cardinalidad = 0;
    }
    
    /**
     * CONSTRUYE EL OBJECTO CONJUNTO_A
     * INICIALIZA EL ARREGLO GENERICO CON UNA LONGITUD DE EL PARAMETRO DADO
     * E INICIALIZA LA CARDINALIDAD EN CERO
     * @param int MAX (TAMAÑO DEL CONJUNTO)
     */
    public ConjuntoA(int max){
        conjunto = (T[]) new Object[max];
        cardinalidad = 0;
    }
    
    /**CREA UN ITERADOR DE DEL ARREGLO DEL OBJETO CONJUNTO 
    *@return ITERATOR ITERADOR DEL CONJUNTO 
    */
    public Iterator<T> iterator(){
        return new IteradorArreglo(conjunto, cardinalidad);
    }
    
    /**
     * 
     * @param elem
     * @return 
     */
    public boolean contiene(T elem){
        Iterator <T> it = iterator();
        boolean band = false;
        while(it.hasNext() && !band)
            band = it.next().equals(elem);
        return band;
    }
    
    /**
     * AGREGA EL ELEMETO DADO SI NO LO CONTIENE 
     * @param elem
     * @return <ul>
     *              <li>TRUE: SI NO ESTÁ EN EL CONJUNTO Y LO AGREGO</li>
     *              <li>FALSE: SI YA ESTÁ EN EL CONJUNTO Y NO LO AGREGO </li>
     *         </ul>
     */
    public boolean agrega(T elem){
        boolean resp = false;
        if(!contiene(elem)){
            if(cardinalidad == conjunto.length)
                expande();
            conjunto[cardinalidad] = elem;
            cardinalidad++;
            resp=true;
        }
        return resp;
    }
    
    /**
     * CREA UN NUEVO ARREGLO CON EL DOBLE DE TAMAÑO, PASA LOS DATOS A ESE NUEVO
     * ARREGLO Y REASIGNA LA DIRECCION DE MEMORIA A LA VARIABLE DEL ARREGLO ORIGINAL
     */
    private void expande(){
        T [] aux = (T[]) new Object[conjunto.length*2];
        for(int i =0; i<conjunto.length; i++)
            aux[i] = conjunto[i];
        conjunto = aux;
        
    }
    
    /**
     * TE INDICA SI EL CONJUNTO NO TIENE ELEMENTOS
     * @return <ul>
     *              <li>TRUE: SI LA CARDINALIDAD ES IGUAL A CERO</li>
     *              <li>FALSE: SI LA CARDINLAIDAD ES DIFERENTE DE CERO </li>
     *         </ul>
     */
    public boolean estaVacio(){
        return cardinalidad == 0;
    }
    
    /**
     * TE INDICA EL NUMERO DE ELEMENTOS QUE TIENE EL CONJUNTO
     * @return CARDINALIDAD
     */
    public int getCardinalidad(){
        return cardinalidad;
    }
    
    /**
     * TE INDICA LA POSICION DEL ELEMENTO BUSCADO
     * @param elem
     * @return <ul>
     *              <li> i>=0: SI EL ELEMENTO EST EN EL CONJUNTO DEL ARREGLO</li>
     *              <li> -1 : SI NO SE ENCUENTRA EN EL ARREGLO </li>
     *         </ul>
     */
    private int buscaPos(T elem){
        int i = 0;
        while( i<cardinalidad && !conjunto[i].equals(elem))
            i++;
        if(i== cardinalidad)
            i=-1;
        return i;
    }
    
    /**
     * QUITA EL ELEMENTO DADO COMO PARAMETRO SI SE ENCUENTRA EN EL ARREGELO
     * @param elem
     * @return <ul>
     *              <li> T RESP = ELEMENTO: SI EL ELEMENTO DADO FUE ELIMINADO DEL ARREGLO</li>
     *              <li> NULL: SI NO EXISTIA EL ELEMENTO QUE SE DESEABA QUITAR </li>
     *         </ul>
     */
    public T quita(T elem){
        T resp;
        int pos = buscaPos(elem);
        if(pos >=0){
            resp=conjunto[pos];
            conjunto[pos] = conjunto[cardinalidad-1];
            conjunto[cardinalidad-1]=null;
            cardinalidad--;
        }
        else
            resp = null;
        
        return resp;
    }
    
    /**
     * GENERA UN CONJUNTO QUE ES UNIÓN DEL CONJUNTO DEL OBJETO PRESENTE Y DEL PARAMETRO
     * @param otro 
     * @return CONJUNTO UNION
     */
    @Override
    public ConjuntoADT<T> union(ConjuntoADT<T> otro) {
        if(otro == null)
            throw new NullPointerException();
        int max= cardinalidad + otro.getCardinalidad();
        ConjuntoA <T> res = new ConjuntoA(max);
        for(int i=0; i<cardinalidad; i++){
            res.agrega(conjunto[i]);
        }
        Iterator <T> itOtro = otro.iterator();
        T aux;
        while(itOtro.hasNext()){
            aux = itOtro.next();
            if(!res.contiene(aux)){
                res.agrega(aux);
            }
        }
        return res;
    }
    
    /**
     * GENERA UN CONJUNTO QUE ES LA INTERSECCION DEL PRESENTE CONJUNTO Y EL CONJUNTO DADO
     * @param otro
     * @return CONJUNTO INTERSECCION
     */
    @Override
    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro) {
        if(otro == null)
            throw new NullPointerException();
        
        ConjuntoADT <T> res = new ConjuntoA(MAX);
        
        if(cardinalidad <= otro.getCardinalidad())
            for(int i = 0; i<cardinalidad; i++)
                if(otro.contiene(conjunto[i]))
                    res.agrega(conjunto[i]);
                
        else{  
            T aux=null;
            Iterator it = otro.iterator();
            
            while(it.hasNext()){
                aux = (T) it.next();
                if(this.contiene(aux))
                    res.agrega(aux);
            }        
        }
        return res;
    }
    
    /**
     * GENERA UN CONJUNTO QUE ES LA DIFERENCIA DEL CONJUNTO PRESENTE Y EL CONJUNTO DADO
     * @param otro
     * @return CONJUNTO DIFERENCIA
     */
    public ConjuntoADT <T> diferencia(ConjuntoADT <T> otro){
        ConjuntoA res = new ConjuntoA(cardinalidad);
        if(otro == null)
            throw new NullPointerException();
        Iterator <T> it = iterator();
        T aux;
        int j=0;
        int cont=0;
        int n = otro.getCardinalidad();
        while(it.hasNext() && cont<n){
            aux = it.next();
            if(!otro.contiene(aux)){
                res.conjunto[j] = aux;
                j++;
            }
            else
                cont++;
        }
        res.cardinalidad = j;
        return res;
    }
       
}
