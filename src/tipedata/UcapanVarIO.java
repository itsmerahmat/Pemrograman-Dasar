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
public class UcapanVarIO {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan kalimat : ");
        String kalimat = masukan.nextLine();
        
        System.out.println("Masukkan kalimat lainnya : ");
        String kalimatLainnya = masukan.nextLine();
        
        System.out.println("Kalimat yang anda masukan adalah :" );
        System.out.println(kalimat + " dan " + kalimatLainnya);

    }
    
}
