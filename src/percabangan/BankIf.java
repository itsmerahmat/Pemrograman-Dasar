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
public class BankIf {

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        int saldoSekarang = 100000;

        System.out.println("Selamat Datang di Bank Unan"); // menampilkan string
        System.out.println("Saldo saat ini : Rp. " + saldoSekarang + '\n'); //

        System.out.print("Simpan uang : Rp. ");
        int jmlUang = nilai.nextInt();
        saldoSekarang += jmlUang;
        System.out.println("Saldo saat ini : Rp. " + saldoSekarang + '\n');

        System.out.print("Ambil uang : Rp. ");
        jmlUang = nilai.nextInt();
        if (jmlUang <= saldoSekarang) {
            saldoSekarang -= jmlUang;
            System.out.println("Saldo saat ini : Rp. " + saldoSekarang);
        } else {
            System.out.println("Saldo anda tidak mencukupi");
        }
    }
}
