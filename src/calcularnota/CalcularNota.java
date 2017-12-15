/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularnota;

import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class CalcularNota {

    /**
     * @param args the command line arguments Pedir una nota de 0 a 10 y
     * mostrarla de la forma: Insuficiente, Suficiente, Bien...
     */
    public static void main(String[] args) {

        int nota;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una nota DE 1 A 10 ::");
        nota = entrada.nextInt();

        // tanto los if's como los else's encierran a una sola instrucción
        // y no es necesario utilizar llaves { }
        if (nota >= 0 && nota < 5) {
            System.out.println("INSUFICIENTE");
        } else if (nota == 5) {
            System.out.println("SUFICIENTE");
        } else if (nota == 6) {
            System.out.println("BIEN");
        } else if (nota == 7 || nota == 8) {
            System.out.println("EXCELENTE");
        } else if (nota == 9 || nota == 10) {
            System.out.println("SUPER-EXCELENTE");
        }

    }

}
