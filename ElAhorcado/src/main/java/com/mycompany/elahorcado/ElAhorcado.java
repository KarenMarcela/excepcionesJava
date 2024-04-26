
package com.mycompany.elahorcado;

import java.util.Scanner;


public class ElAhorcado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretWord = "juego";
        int attempts = 6;
        char[] wordGuess = new char[secretWord.length()];
        for(int i =1; i<= wordGuess.length; i++) {
            wordGuess[i]= '_';
        }
        
        while(attempts > 0 ){
            System.out.println("Palara a adivinar "+ String.valueOf(wordGuess));
            System.out.println("Ingrese una letra");
            char letter = scanner.next().toUpperCase().charAt(0);
            
        }
    }
}
