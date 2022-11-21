package de.hfu;

import java.util.Scanner;

/**
 * Inputklasse
 * Wandelt jegliche Zeichenkette in Großbuchstaben um
 *
 *
 * @author Max Michael Schopf
 * @version 1.0
 */
public class App 
{


    public static int greeter(){
        System.out.println("Good bye");
        /**
         * @return 1;
         */
        return 1;
    }

    /**
     * s
     * @param args
     */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.print("Bitte geben Sie eine Zeichenkette ein: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.toUpperCase());
        scanner.close();

    }
}
