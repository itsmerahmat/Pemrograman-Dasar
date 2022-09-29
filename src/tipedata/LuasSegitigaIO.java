/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedata;

import java.util.Scanner;

/**
 *
 * @author Rahmat
 */
public class LuasSegitigaIO {

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        System.out.print("Masukkan Alas Segitiga : ");
        double nilaiAlas = nilai.nextDouble();

        System.out.print("Masukkan Tinggi Segitiga : ");
        double nilaiTinggi = nilai.nextDouble();

        double luas = (nilaiAlas * nilaiTinggi) / 2;

        System.out.println("Luas Segitiga adalah : " + luas);
    }

}
