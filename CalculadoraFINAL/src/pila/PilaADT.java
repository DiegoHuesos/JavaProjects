
package pila;


public interface PilaADT <T> {
    
    public void push(T dato);
    public T pop();
    public T seek();
    public boolean isEmpty();
    
}
