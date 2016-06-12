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

// Tipo Generico
// El valor T puede tomar cualquier valor(variable)
public class ListaSimple<T> {
    private Nodo<T> inicio = null;
    private Nodo<T> fin = null;

    // Constructor de la Lista Simple
    public ListaSimple() {    
    }
    
    // Añade un elemento al principio de la Lista
    public void AñadirElementoPrincipio(T valor){
        Nodo<T> nodo = new Nodo();
        nodo.setValor(valor);
        
        if ( inicio == null ){
            inicio = nodo;
            fin = nodo;
        }
        else{
            nodo.setApuntadorSiguiente(inicio);
            inicio = nodo;
        }
    }
    
    // Añade un elemento al final de la Lista
    public void AñadirElementoFinal(T valor){
        Nodo<T> nodo = new Nodo();
        nodo.setValor(valor);
        
        if ( inicio == null ){
            inicio = nodo;
            fin = nodo;
        }
        else{
            fin.setApuntadorSiguiente(nodo);
            fin = nodo;
        }
    }
    
    
    public void listarListaSimple(){
        Nodo<T> auxiliar = inicio;
        
        while ( auxiliar != null ){
            System.out.println(auxiliar.getValor().toString());
            auxiliar = auxiliar.getApuntadorSiguiente();
        }
    }
    
}
