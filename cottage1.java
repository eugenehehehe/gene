/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author gene
 */
public class cottage1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Pilih cottage: ");
        String cottage = sc.nextLine();
        System.out.print("Hari:");
        String hari = sc.nextLine();
        int room = 0;
        int harga = 0;
        
        if (cottage.equalsIgnoreCase("Duku")) {
            room = 2;
            if (hari.equalsIgnoreCase("Weekday")){
                harga = 915000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 1025000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 1225000;
            }
        }
        else if (cottage.equalsIgnoreCase("Jeruk"))  {
            room = 2;
            if (hari.equalsIgnoreCase("Weekday")){
                harga = 915000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 1025000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 1225000;
            }
        }
        else if (cottage.equalsIgnoreCase("Alpukat"))  {
            room = 1;
            if (hari.equalsIgnoreCase("Weekday")){
                harga = 575000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 695000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 895000;
            }
        }
        else if (cottage.equalsIgnoreCase("Jambu Air"))  {
            room = 1;
            if (hari.equalsIgnoreCase("Weekday")){
                harga = 575000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 695000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 895000;
            }
        }
        else if (cottage.equalsIgnoreCase("Durian"))  {
            room = 2;
            if (hari.equalsIgnoreCase("Weekday")){
                harga = 595000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 715000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 915000;
            }
        }
        else if (cottage.equalsIgnoreCase("Melon"))  {
            room = 2;
            if (hari.equalsIgnoreCase("Weekday")){
                harga = 595000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 715000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 915000;
            }
        }
        else if (cottage.equalsIgnoreCase("Belimbing"))  {
            room = 2;
            if (hari.equalsIgnoreCase("Weekday")){
                harga = 495000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 575000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 755000 ;
            }
        }
        else if (cottage.equalsIgnoreCase("Mangga"))  {
            room = 2;
            if (hari.equalsIgnoreCase("Weekday")){
          
      harga = 495000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 575000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 755000 ;
            }
        }
        else if (cottage.equalsIgnoreCase("Kedondong"))  {
            room = 2;
            if (hari.equalsIgnoreCase("Weekday")){
                harga = 495000;}
            else if (hari.equalsIgnoreCase("Weekend")) {
                harga = 575000;}
            else if (hari.equalsIgnoreCase("Holiday")) {
                harga = 755000 ;
            }
        }
        System.out.println("Cottage: " + cottage + "\nRoom: " + room + "\nHari: " + hari + "\nHarga: " + harga);
    }
}
      
