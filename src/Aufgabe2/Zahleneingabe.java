package Aufgabe2;

import javax.swing.*;
import java.util.InputMismatchException;

public class Zahleneingabe {

    public static void main(String [] args){
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine beliebige Zahl ein"));

            System.out.println(a);
        }catch(NumberFormatException z){
            System.out.println("Bitte erneut versuchen und eine zahl eingeben! Danke!!");
        }
    }
}
