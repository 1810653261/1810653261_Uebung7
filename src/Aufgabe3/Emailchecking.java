package Aufgabe3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailchecking {

    public static void main(String[] args){
        try{
        String mail= JOptionPane.showInputDialog("Geben sie ihre Emailadresse an!");

            Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
            Matcher m = pattern.matcher(mail);


            if (!m.find()){
                throw new eigeneException();
            }
            else{
                System.out.println(mail);
            }

        }catch(eigeneException a){
            System.out.println("Email is ungültig, erneut probieren");
        }

    }
}
