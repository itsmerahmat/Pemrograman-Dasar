/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author Rahmat
 */
public class BankATM {

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        int saldoSekarang = 100000;

        System.out.println("Selamat Datang di Bank Unan"); 
        System.out.println("Saldo saat ini : Rp. " + saldoSekarang + '\n');

        System.out.print("Menu ATM" + '\n' + "1. Cek Saldo" + '\n' + "2. Simpan Uang" + '\n' + "3. Ambil Uang");
        int pilihan;
        pilihan = nilai.nextInt();
        
        if (pilihan == 1) {
            System.out.println(saldoSekarang);
        } else if (pilihan == 2) {
            System.out.print("Simpan uang : Rp. ");
            int jmlUang = nilai.nextInt();
            saldoSekarang += jmlUang;
            System.out.println("Saldo saat ini : Rp. " + saldoSekarang + '\n');
        } else if (pilihan == 3) {
            System.out.print("Ambil uang : Rp. ");
            int jmlUang = nilai.nextInt();
            if (jmlUang <= saldoSekarang) {
                saldoSekarang -= jmlUang;
                System.out.println("Saldo saat ini : Rp. " + saldoSekarang);
            } else {
                System.out.println("Saldo anda tidak mencukupi");
            }
        } else {
            System.out.println("Pilihan tidak tersedia");
        }

    }
}
