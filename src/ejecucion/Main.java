package ejecucion;

import logica.Operaciones;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanerCalculadora = new Scanner(System.in);

        System.out.println("+                       ---Ejercicio Calculadora---                     +");
        System.out.println("+       Para realizar las operaciones ingrese el primer número  👇🏽      +");
        int numeroUno = scanerCalculadora.nextInt();

        System.out.println("+                   --Ingrese el segundo número 👇🏽--                    +");
        int numeroDos = scanerCalculadora.nextInt();

        // Objeto
        Operaciones operaciones = new Operaciones(numeroUno,numeroDos);

        // Imprimir resultados
        System.out.println("+-----------------------------------------------------------------------+");
        System.out.println("+       --El resultado de la suma es : " + operaciones.suma() + "                               +");
        System.out.println("+       --El resultado de la resta es : " + operaciones.resta() + "                              +");
        System.out.println("+       --El resultado de la multiplicacion es : " +operaciones.multiplicacion() +"                     +" );
        System.out.println("+       --El resultado de la división es : " + operaciones.division() + "                          +"  );
        System.out.println("+-----------------------------------------------------------------------+");
    }

}


