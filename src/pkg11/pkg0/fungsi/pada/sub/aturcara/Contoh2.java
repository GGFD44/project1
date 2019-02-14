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
import java.util.Scanner;
public class Contoh2 {
    public  static void main(String[] args){
        
        int i;
        int jumlah=0;
        
        Scanner scan = new Scanner(System.in);
        int nombor[] = new int[5];
        System.out.println("Taipkan 5 nombor : ");
        
             for ( i = 0; i < 5; i++)
                 nombor[i] = scan.nextInt();
             
             jumlah = hasilTambah(nombor);
             
             System.out.println("Hasil tambah adalah " +jumlah + ".");
    }
    
    static int hasilTambah(int[] nilai){
        
        int i, jawapan = 0;
        
        for(i=0; i<5; i++){
            jawapan = jawapan + nilai[ i ];
        }
        
        return (jawapan);
    }
}
