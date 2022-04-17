/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmo_Shell;

import java.util.*;

/**
 *
 * @author Eliseo Canaviri
 */
class Shell {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ar = new int[10];

        System.out.println(" Ingrese los elementos a array");

        for (int i = 0; i < ar.length; i++) {
            System.out.print(i + ": ");
            // ar[i] = (int) (Math.random() * 10);  //ingresando datos aleatorio
            ar[i] = entrada.nextInt();
        }
        shell(ar);
        for (int i = 0; i < 10; i++) {
            System.out.print(" ");
            System.out.print("[" + ar[i] + "]");
        }
        System.out.println("");
    }

    public static void shell(int A[]) {

        int salto, aux;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento
                cambios = false;
                for (int i = salto; i < A.length; i++) // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.
                    }
                }
            }
        }
    }
}
