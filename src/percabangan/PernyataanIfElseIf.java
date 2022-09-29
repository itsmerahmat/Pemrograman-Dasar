/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author Rahmat
 */
public class PernyataanIfElseIf {
//    public static void main(String[] args) {
//        int skorUjian = 86;
//        char nilai;
//        if(skorUjian >= 90){
//            nilai = 'A';
//        } else if(skorUjian >= 80){
//            nilai = 'B';
//        } else if(skorUjian >= 70){
//            nilai = 'C';
//        } else {
//            nilai = 'D';
//        }
//        System.out.println("Nilai = " + nilai);
//    }

    public static void main(String[] args) {
        int skorUjian = 100;
        char nilai;
//        if (skorUjian <= 100 && skorUjian >= 0) {
//            if (skorUjian >= 90) {
//                nilai = 'A';
//            } else if (skorUjian >= 80) {
//                nilai = 'B';
//            } else if (skorUjian >= 70) {
//                nilai = 'C';
//            } else {
//                nilai = 'D';
//            }
//            System.out.println("Nilai = " + nilai);
//        } else {
//            System.out.println("Nilai yang anda input salah");
//        }

        if (skorUjian > 100 || skorUjian < 0) {
            System.out.println("Nilai yang anda input salah");
        } else {
            if (skorUjian >= 90) {
                nilai = 'A';
            } else if (skorUjian >= 80) {
                nilai = 'B';
            } else if (skorUjian >= 70) {
                nilai = 'C';
            } else {
                nilai = 'D';
            }
            System.out.println("Nilai = " + nilai);
        }
    }

}
