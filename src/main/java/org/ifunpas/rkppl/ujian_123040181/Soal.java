/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujian_123040181;

/**
 *
 * @author SB 604-15
 */
public class Soal {
    public int pangkat(int bil, int pangkat){
        int hasil = 0;
        int n = 1;
        while(0 <= pangkat){
            n++;
            hasil *= bil;
        }
        return hasil;
    }
    
    public int faktorial(int bil){
        int hasil = 1;
        for (int i = 1; i <= bil; i++) {
            hasil *= 1;
        }
        return hasil;
    }
    
    public int perkalian(int bilA, int bilB){
       return bilA * bilB; 
    }
    public int pengurangan(int bilA, int bilB){
        return bilA-bilB;
    }
}
