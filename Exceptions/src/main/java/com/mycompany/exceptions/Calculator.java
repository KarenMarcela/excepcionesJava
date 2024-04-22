
package com.mycompany.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public Calculator() {
    }
    public int division (int a, int b){
//        Validacion que evita la excepcion
//        if(b <= 0){
//            System.out.println("Operaciòn no permitida");
//            return -1;
//        }
        boolean repeat;
        int res = 0;
        Scanner scanner= new Scanner(System.in);
        do{
            repeat = false;
            try{
                res = a/b;
            }catch(ArithmeticException e){
                System.out.println("Operaciòn no vàlida");
                System.out.println("Ingrese un numero valido");
                
                try{
                    b = scanner.nextInt();
                } catch(InputMismatchException exc){
                    repeat = true;
                }
                 
                
                repeat= true;

            }catch(InputMismatchException e){ //Una excepcion para cuando ingreso una cadena de texto en lugar de un valor entero
                System.out.println("Tipo de dato no es vàlido");
                System.out.println("Ingrese un numero valido");
                b = scanner.nextInt();
                repeat= true;
            }finally{
                scanner.nextLine();
            }    
        } while (repeat);
        
        return res;
    }
}
