/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg0.fungsi.pada.sub.aturcara;

/**
 *
 * @author Dell
 */
public class Contoh1 {
    static java.util.Scanner taip = new java.util.Scanner(System.in);
    public static void main(String[] args){
        double papar;
        papar = kiraLuas();
        System.out.println("Isipadu bagi kuboid yang adalah "+papar+" padu");
    }
    
    static double kiraLuas(){
        double panjang, lebar, tinggi, isipadu;
        System.out.println("Panjang kuboid: ?");
           panjang=taip.nextDouble();
        System.out.println("Lebar kuboid: ?");
           lebar=taip.nextDouble();
        System.out.println("Tinggi kuboid: ?");
           tinggi=taip.nextDouble();
           
          isipadu=panjang*lebar*tinggi;
        return Math.round(isipadu);
    }
}
