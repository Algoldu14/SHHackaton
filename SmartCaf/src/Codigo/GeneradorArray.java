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
public class GeneradorArray {

   
    private ArrayList<UUID> cola = new ArrayList<UUID>();

    public void hacerId() {
        
        UUID ID = UUID.randomUUID();
        System.out.println(ID);
        this.cola.add(ID);
    }

    
    
    
    
    }

    





