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
public class SalamKenal {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda: ");
        
        String nama = masukan.nextLine();
        
        System.out.println("Halo, Salam Kenal sdr " + nama + "!");
    }
    
}
