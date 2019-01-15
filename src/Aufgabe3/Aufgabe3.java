package Aufgabe3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3 {
    public static void main(String []args){
        try{
            if(Emailcheck()){
                System.out.println("Richtige Emailadresse");

            }
            else{
                System.out.println("Deine Emailadresse ist leider ungültig");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    private static boolean Emailcheck() throws Exception{
        String email= JOptionPane.showInputDialog("Gib deine Emailadresse an!");

        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
        Matcher m = pattern.matcher(email);

        return m.find();
    }



}
