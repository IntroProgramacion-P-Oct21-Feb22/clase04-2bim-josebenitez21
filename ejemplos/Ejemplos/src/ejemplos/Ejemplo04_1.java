/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/*
 *
 * @author reroes
 */
public class Ejemplo04_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int primerValor;
        int segundoValor;

        System.out.println("Ingrese el primer valor");
        primerValor = entrada.nextInt();

        System.out.println("Ingrese el segundo valor");
        segundoValor = entrada.nextInt();

        obtenerMultiplicacion(primerValor, segundoValor);
    }

    public static void obtenerMultiplicacion(int a, int b) {
        int mul;
        mul = a * b;
        System.out.printf("El valor de la multiplicación es: %d\n", mul);

    }

}
