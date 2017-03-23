/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;

/**
 *
 * @author ridho
 */
public class Main {
    static String[] angkaTerbilang={"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
    public static void main(String[] args) {
        System.out.println("Hello");
    Scanner sc = new Scanner(System.in);
System.out.print("Masukan Bilangan yang akan disebut: ");
System.out.println(new Main().angkaToTerbilang(sc.nextLong()));
}
public static String angkaToTerbilang(Long angka){
if(angka < 12)
return angkaTerbilang[angka.intValue()];
if(angka >=12 && angka <= 19)
return angkaTerbilang[angka.intValue() % 10] + " Belas";
if(angka >= 20 && angka <= 99)
return angkaToTerbilang(angka / 10) + " Puluh " + angkaTerbilang[angka.intValue() % 10];
if(angka >= 100 && angka <= 199)
return "Seratus " + angkaToTerbilang(angka % 100);
if(angka >= 200 && angka <= 999)
return angkaToTerbilang(angka / 100) + " Ratus " + angkaToTerbilang(angka % 100);
if(angka >= 1000 && angka <= 1999)
return "Seribu " + angkaToTerbilang(angka % 1000);
if(angka >= 2000 && angka <= 999999)
return angkaToTerbilang(angka / 1000) + " Ribu " + angkaToTerbilang(angka % 1000);
return "";
}
    
    
}  
    


