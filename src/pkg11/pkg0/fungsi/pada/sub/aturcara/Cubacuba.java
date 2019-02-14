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
import java.text.DecimalFormat;
public class Cubacuba {
    static java.util.Scanner taip = new java.util.Scanner(System.in);
       public static void main(String[] args){
           
           double harga, bayaran = 0;
           int kuantiti;
           System.out.println("Harga barang satu unit RM: ");
                harga=taip.nextDouble();
           System.out.println("Unit yang dibeli: ");
                kuantiti=taip.nextInt();
                
           double papar = dapatBayaran( harga, kuantiti, bayaran);
           DecimalFormat df = new DecimalFormat(".##");
           System.out.println("Harga yang perlu dibayar adalah RM" + df.format(papar));
           
       }
       
       static double dapatBayaran(double harga, int kuantiti, double bayaran){
           
            bayaran=harga*kuantiti;
            return bayaran;
       }
               
              
}
