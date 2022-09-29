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
public class PernyataanIfElse {

    public static void main(String[] args) {
        double diskon = 0, totalBelanja = 5000;

        if (totalBelanja >= 100000) {
            diskon = totalBelanja / 10;
        } else {
            diskon = totalBelanja * 2.5 / 100;

        }

        System.out.println("Diskon = " + diskon);
    }

}
