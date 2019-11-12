/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Alvaro
 */
public class GeneradorArray {

    private final char[] arrayLetras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z'};
    private ArrayList<String> cola = new ArrayList<String>();

    public String hacerId() {

        Random rand = new Random();
        char uno, dos, tres;
        String ID;

        int r = rand.nextInt(10);

        uno = (char) r;

        int r1 = rand.nextInt(10);

        dos = (char) r1;

        int r2 = rand.nextInt(this.arrayLetras.length);

        tres = this.arrayLetras[r2];

        ID = uno + dos + "-" + tres;
        
        return ID.toUpperCase();

    }

    public void meterID(String ID) {
        boolean esta = true;
        boolean bucle = true;
        while (bucle != false) {
            for (int i = 0; i < cola.size(); i++) {
                if (ID == cola.get(i)) {
                    esta = false;
                    bucle = false;
                }
            }
            if (esta) {
                cola.add(ID);
                esta = false;
                
            }else{
                this.meterID(this.hacerId());
            }
            System.out.println(cola);
        }
    }

    public GeneradorArray() {

    }

}
