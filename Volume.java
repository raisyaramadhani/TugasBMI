
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raisya Ramadhani
 */
public class Volume {
    public static void main(String[] args) {
        // a. Bola V = 4/3 x phi x r3
        Scanner inputBola = new Scanner(System.in);
        
        System.out.println("Masukkan Jari Jari : ");
        double JariJari = inputBola.nextDouble();
        
        double Phiphi = 3.14;
        double VolumeBola = 4/3 * Phiphi  * JariJari * JariJari;
        System.out.println("Volume Bola Adalah : " + VolumeBola);
        
        //b. Tabung 
        //Tabung V = phi x r x r x t 
        Scanner inputTabung = new Scanner (System.in);
        
        System.out.println("Masukkan Jari Jari : ");
        double JariJariTabung = inputTabung.nextDouble();
        
        System.out.println("Masukkan Tinggi : ");
        double TinggiTabung = inputTabung.nextDouble();
        
        double VolumeTabung = Phiphi * JariJariTabung * TinggiTabung ;
        System.out.println("Volume Tabung Adalah : " + VolumeTabung);
        
        //c.kerucut
        //Kerucut V = 1/3 x phi x r x r x t 
        Scanner inputKerucut = new Scanner (System.in);
        
        System.out.println("3.14 : ");
        double JariJariKerucut = inputKerucut.nextDouble();
        
        System.out.println("29");
        double TinggiKerucut = inputKerucut.nextDouble ();
        
        double VolumeKerucut = 1/3 * Phiphi * JariJariKerucut * TinggiKerucut;
        System.out.println("VolumeKerucut");
       
        
     
    }
}
