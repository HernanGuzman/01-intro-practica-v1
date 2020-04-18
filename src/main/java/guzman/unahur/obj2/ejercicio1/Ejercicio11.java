package guzman.unahur.obj2.ejercicio1;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio11 {
    public int[] llenarArray() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Debe ingresar 10 numeros:\n");
        int Num = 0;
        int Numeros [] = new int[10];
        for (int i = 0; i <10; i++)
        {

            System.out.println("Ingrese el numero de la posición " + (i+1) +":\n");
            //TUBE QUE LEER EL STRING PORQUE ME DABA ERROR CUANDO LO PARSEABA DIRECTAMENTE A INT
            String PP = dato.nextLine();
            Num = Integer.parseInt(PP);
            Numeros[i] = Num;
        }
        return Numeros;
    }

    public void ordenarInversamente(int numeros[]) {

        System.out.println("\n\nImpresión del Array al reves:\n");
        for (int i = numeros.length - 1; i >=0; i--)
        {

            System.out.println(numeros[i]);
        }

    }

}
