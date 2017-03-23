/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainconvertwordtonumber;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Eginda
 */
public class Mainconvertwordtonumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
            System.out.print("Masukkan angka (dalam inggris) : ");
                String numberWordsText = in.nextLine();
        try {
            System.out.println("Value : "+ ConvertWordToNumber.WithSeparator(ConvertWordToNumber.parse(numberWordsText)));
        } catch (Exception ex) {
            Logger.getLogger(Mainconvertwordtonumber.class.getName()).log(Level.SEVERE, null, ex);
        }
            }    
    }
    

