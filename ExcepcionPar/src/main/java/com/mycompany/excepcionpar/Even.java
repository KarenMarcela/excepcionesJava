
package com.mycompany.excepcionpar;

public class Even {
    public boolean isEven(int number) throws Exception{ //throw , es para registrar que se esta generando una excepcion, tambien se debe hacer en el main cuando lo estamos utilizando
        if(number % 2 == 0){
            throw new Exception("-- No me gustan los numeros pares"); //Para crear mi propia excepcion
        }
        return false;
    }
}
