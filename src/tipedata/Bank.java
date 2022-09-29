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
public class Bank {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        int saldoSekarang = 100000;
        
        System.out.println("Selamat Datang di Bank Unan");
        System.out.println("Saldo saat ini : Rp. " + saldoSekarang + '\n');
        
        System.out.print("Simpan uang : Rp. ");
        int nambahSaldo = nilai.nextInt();
        saldoSekarang += nambahSaldo;
        System.out.println("Saldo saat ini : Rp. " + saldoSekarang + '\n');
        
        System.out.print("Ambil uang : Rp. ");
        int ambilSaldo = nilai.nextInt();
        saldoSekarang -= ambilSaldo;
        System.out.println("Saldo saat ini : Rp. " + saldoSekarang);
        
        
    }
}
