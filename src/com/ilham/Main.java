/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : Main Class menghitung garis untuk mendapatkan gradien
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat gradien1 = new Koordinat(2,10,5,7);
        System.out.println("Garis yang memalui titik (" + gradien1.getX1() + "," + gradien1.getY1() + 
                           ") dan (" + gradien1.getX2() + "," + gradien1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien1.hitungGradien());
        
        Koordinat gradien2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang memalui titik (" + gradien2.getX1() + "," + gradien2.getY1() + 
                           ") dan (" + gradien2.getX2() + "," + gradien2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien2.hitungGradien());
    }
    
}
