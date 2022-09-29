/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedata;

/**
 *
 * @author Rahmat
 */
public class LuasSegitiga {

    public static void main(String[] args) {
        int alas = 7;
        int tinggi = 7;
//        type casting pakai (double)
        double luas = (double) alas * tinggi / 2;
//        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga : " + luas);
    }

}
