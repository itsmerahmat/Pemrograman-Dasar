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
public class Penambahan {
    public static void main(String[] args) {
        int x, y, z;
        x = 42;
        y = x++;
        
        System.out.println("Nilai x saat ini : " + x);
        System.out.println("Nilai y saat ini : " + y);
        
        z = ++x;
        System.out.println("Nilai x saat ini : " + x);
        System.out.println("Nilai z saat ini : " + z);
    }
}
