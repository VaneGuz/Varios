/*
Crear una secuencia de números en un rango fijo (0-9, 0-50, 0-99) de manera aleatoria y mostrar en pantalla 
cada número uno a uno sin repetir. 
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vanesa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cant = 0, prueba = 0, i = 0;

        Random rand = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("Ingrese la cantidad de números aleatorios a crear");
        cant = in.nextInt();
        System.out.println("Ingrese el límite inferior del número");
        int limInferior = in.nextInt();
        int limSuperior = limInferior + cant;

        while (i < cant) {
            prueba = rand.nextInt(cant) + limInferior;
            if (!num.contains(prueba)) {
                num.add(prueba);
                System.out.println("prueba= " + prueba);
                i++;
            }
        }
        System.out.println("Tarea terminada!");

    }

}
