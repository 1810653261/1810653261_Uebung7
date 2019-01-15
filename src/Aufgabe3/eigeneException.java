package Aufgabe3;

public class eigeneException extends Exception{ //erbt von Exception
    public eigeneException(){
        super("Ihre Email is ungültig!");   //Konstruktor
    }
}
