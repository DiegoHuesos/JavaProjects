/*
 * Clase: Pila
 * @author Diego Hernandez Delgado (176262)
 */
package pila;

public class Pila <T>{
    private T[] pila;
    private int tope;
    private static final int MAX=20;
    
    
    //CONSTRUCTORES
    public Pila(){
        pila= (T[]) new Object[MAX];
        tope=-1;
    }
    
    public Pila(int max){
        pila= (T[]) new Object[max];
        tope=-1;
    }
    
    //MÉTODOS
    public boolean isEmpty(){
        return tope <= -1;
    }
    
    public void push (T dato){
        if(tope+1 == pila.length)
            expande();
        tope++;
        pila[tope]=dato;
    }
    
    public T pop(){
        if(isEmpty())
            throw new EmptyCollectionException();
        
        T resp=pila[tope];
        pila[tope]=null;
        tope--;
        return resp;
    }
    
    public T peek(){
        if(isEmpty())
            throw new EmptyCollectionException();
        return pila[tope];
    }
    
    
    //MÉTODO (EXPANDE) AUXILIAR
    private void expande(){
        T[] nuevo = (T[]) new Object[pila.length*2];
        for(int i=0; i<=tope; i++)
            nuevo[i]= pila[i];
        pila=nuevo;  
    }
}
