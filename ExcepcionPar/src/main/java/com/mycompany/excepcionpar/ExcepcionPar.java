
package com.mycompany.excepcionpar;

import java.util.Scanner;

public class ExcepcionPar {

    public static void main(String[] args) throws Exception {
        System.out.println("Escriba un nùmero ");
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        Even even = new Even();
        
        try{
            even.isEven(number);
        }catch(Exception e){
            System.out.println("Ha ocurrido un error " +e.getMessage()); //el get es para mostrar el mensaje que tiene la excepciòn
        }
        
    }
}
