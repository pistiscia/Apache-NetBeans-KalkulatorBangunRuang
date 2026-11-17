/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorbangunruang;

import java.util.Scanner;
/**
 * 
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("====================================");
            System.out.println("        KALKULATOR BANGUN RUANG");
            System.out.println("====================================");
            
            // INPUT KUBUS
            System.out.print("\nMasukkan sisi kubus: ");
            double sisi = input.nextDouble();
            
             // HASIL PERHITUNGAN 
            System.out.println("\n====================================");
            System.out.println("          HASIL PERHITUNGAN");
            System.out.println("====================================");
            
            // KUBUS
            System.out.println("\nKUBUS");
            System.out.println("Volume         : " + (sisi * sisi * sisi));
            System.out.println("Luas Permukaan : " + (6 * sisi * sisi));
            
         
            
            
            System.out.println("====================================");
            System.out.println("        KALKULATOR BANGUN RUANG");
            System.out.println("====================================");
            
            // INPUT BALOK
            System.out.print("\nMasukkan panjang balok: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar balok  : ");
            double lebar = input.nextDouble();
            System.out.print("Masukkan tinggi balok : ");
            double tinggi = input.nextDouble();
            
             // HASIL PERHITUNGAN 
            System.out.println("\n====================================");
            System.out.println("          HASIL PERHITUNGAN");
            System.out.println("====================================");
            
            
            // BALOK
            System.out.println("\nBALOK");
            System.out.println("Volume         : " + (panjang * lebar * tinggi));
            System.out.println("Luas Permukaan : " + (2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))));
        
            
            
                 
            System.out.println("====================================");
            System.out.println("        KALKULATOR BANGUN RUANG");
            System.out.println("====================================");
            
            // INPUT TABUNG
            System.out.print("\nMasukkan jari-jari tabung: ");
            double jariJari = input.nextDouble();
            System.out.print("Masukkan tinggi tabung   : ");
            double tinggiTabung = input.nextDouble();
            
            // HASIL PERHITUNGAN
            System.out.println("\n====================================");
            System.out.println("          HASIL PERHITUNGAN");
            System.out.println("====================================");
           
            // TABUNG
            System.out.println("\nTABUNG");
            double volumeTabung = Math.PI * jariJari * jariJari * tinggiTabung;
            double luasTabung = 2 * Math.PI * jariJari * (jariJari + tinggiTabung);
            System.out.println("Volume         : " + volumeTabung);
            System.out.println("Luas Permukaan : " + luasTabung);
            
            System.out.println("\n====================================");
            System.out.println("          PROGRAM SELESAI");
            System.out.println("====================================");
        }
    }
}


