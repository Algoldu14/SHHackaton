/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Locale;

/**
 *
 * @author alvar
 */
public class SmartCaf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GeneradorArray hf = new GeneradorArray();
        
        System.out.println(hf.hacerId());
        
        hf.meterID(hf.hacerId());
    }
    
}
