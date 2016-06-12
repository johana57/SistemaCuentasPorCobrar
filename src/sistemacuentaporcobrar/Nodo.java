/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacuentaporcobrar;

/**
 *
 * @author hshome
 */
public class Nodo<T> {
    private T valor;
    private Nodo<T> siguiente = null;
    
    // Constructor del Nodo
    public Nodo(){
    }

    // Obtiene el valor del nodo
    public T getValor() {
        return valor;
    }

    // Asigna el valor al nodo
    public void setValor(T valor) {
        this.valor = valor;
    }

    // Obtener el apuntador al siguiente elemento
    public Nodo<T> getApuntadorSiguiente() {
        return siguiente;
    }

    // Asigna el apuntador al siguiente elemento
    public void setApuntadorSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
