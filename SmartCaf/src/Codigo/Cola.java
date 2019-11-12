/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;
import java.util.Collection;
import java.util.LinkedList;
/**
 *
 * @author alvar
 */
public class Cola {
    
    LinkedList cola = new LinkedList();
    
    public void encolar(int a){
        cola.addFirst(a);
    }
    
    public int desencolar(){
        return (int) cola.removeLast();
    }
    
    public void mostrar(){
        System.out.println(cola);
    }
    
    public int tamaño(){
        return (int) cola.size();
    }
    
    public boolean esVacia(){
        return cola.isEmpty();
    }
}
