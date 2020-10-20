/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makananmenu;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class MakananMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //array
        String[]makanan = {"Rawon","Soto","Pizza","Indomie","Rendang"};
        int[] harga = {5000,6000,7000,8000,9000};
        
        System.out.println("Selamat Datang Restoran Ifa");
        System.out.println("List Menu");
        
        //perulangan
        for (int i = 0; i <makanan.length; i++)
            System.out.println(i+". "+makanan[i]+" -> "+harga[i]);
       
        //scanner
        System.out.println("Silahkan masukkan nomor makanan");
        
        Scanner input = new Scanner(System.in);
        
        int pilihan = input.nextInt();
        
        System.out.println("Input Pilihan : "+makanan[pilihan]);
        
        //percabangan
        System.out.println("Silahkan masukkan uang anda");
        
        int uang = input.nextInt();
        
        if (uang > harga[pilihan]){
            System.out.println("Kembalian "+(uang - harga[pilihan]));
    
        }else if (uang == harga[pilihan]){
            System.out.println("Uang anda pas, Silahkan menikmati makanan");
        }else{
            System.out.println("Uang anda kurang "+(harga[pilihan]-uang));
              
            }
    }
    
}
