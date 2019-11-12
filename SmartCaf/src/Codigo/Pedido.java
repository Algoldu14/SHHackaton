/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Alvaro
 */
public class Pedido {
    private UUID codigo;
    private ArrayList<String> pedido;

    public Pedido(UUID codigo, ArrayList pedido) {
        this.codigo = codigo;
        this.pedido = pedido;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public ArrayList getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList pedido) {
        this.pedido = pedido;
    }
    
    
    public void hacerId() {
        this.setCodigo(UUID.randomUUID());
    }
    
    public void meterPedido(String pedido){
        this.getPedido().add(pedido);
    }
    
}
