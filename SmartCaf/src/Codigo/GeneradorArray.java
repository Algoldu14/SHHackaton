/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Locale;
import java.util.Random;


/**
 *
 * @author Alvaro
 */
public class GeneradorArray {
    
    private final char[] arrayEnteros= {'0','1','2','3','4','5','6','7','8','9'};
    private final char[] arrayLetras = {'a','b','c','d','e','f','g','h','i','j','k',
        'l','m','n','o','p','q','r','s','t','u','w','x','y','z'};
    
   public String hacerId(){
       
       Random rand = new Random();
       char uno, dos, tres;
       String ID;
       
       int r = rand.nextInt(this.arrayEnteros.length);
       
       uno = this.arrayEnteros[r];
       
       int r1 = rand.nextInt(this.arrayEnteros.length);
       
       dos = this.arrayEnteros[r1];
       
       int r2 = rand.nextInt(this.arrayLetras.length);
       
       tres = this.arrayLetras[r2];
       
       ID = uno + dos + "-" + tres;
       
       return ID.toUpperCase(Locale.ITALY);

       
   }

    public GeneradorArray() {
        
    }
 
    
    
    
    
}
