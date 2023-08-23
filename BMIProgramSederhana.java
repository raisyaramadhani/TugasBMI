
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raisya Ramadhani
 */
public class BMIProgramSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama = "Karina";
        int umur = 23;
        double tb = 168;
        int bb = 48 ;
        double BMI;
        
        System.out.println("nama:" +nama);
        System.out.println("umur:" +umur);
        System.out.println("tb:" +tb);
        System.out.println("bb" +bb);
        
        BMI = (bb/(tb*tb));
        
        if (BMI <18.5){
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("kurus");
        } 
        else if (BMI <24.9){
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Normal");
        }
        else if (BMI <29.9){
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Gemuk");   
        } 
        else{
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Obesitas");
        }
        
    }
}
        
        
       
