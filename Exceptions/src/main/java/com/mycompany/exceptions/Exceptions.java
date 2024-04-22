/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptions;

/**
 *
 * @author SCIS2-07
 */
public class Exceptions {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = calculator.division(4, 0);
        System.out.println(res);
        
//        try{
//            int res = calculator.division(4, 0);
//            System.out.println(res);
//        } catch(Exception exception ){
//            System.out.println("Ha ocurrido un problema");
//            System.out.println(exception);
//        }finally{
//            System.out.println("Karen es la mas hermosa");
//        }
/*
        try{
            int[] numbers = new int [3];
            numbers[5] = 2/0;
        }catch(ArithmeticException e){
            System.out.println("Operaciòn no permitida");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posiciòn de array no valida");
        }catch(Exception e){
            System.out.println("Ha ocurrido un error");
        } */

        
        
        
    }
    
    
}
