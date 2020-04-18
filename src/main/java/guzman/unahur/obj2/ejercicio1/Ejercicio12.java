package guzman.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio12 {
    //1.2
    public int LeerNumero(){
        Scanner dato = new Scanner(System.in);
        int Num = 0;
        System.out.println("Ingrese un numero\n");
        String PP = dato.nextLine();
        return  Num = Integer.parseInt(PP);
    }

    public int[] llenarArray20() {

        Scanner dato = new Scanner(System.in);
        System.out.println("Debe ingresar 20 numeros:\n");
        int Num = 0;
        int Numeros [] = new int[20];
        for (int i = 0; i <20; i++)
        {

            System.out.println("Ingrese el numero de la posición " + (i+1) +":\n");
            //TUBE QUE LEER EL STRING PORQUE ME DABA ERROR CUANDO LO PARSEABA DIRECTAMENTE A INT
            String PP = dato.nextLine();
            Num = Integer.parseInt(PP);
            Numeros[i] = Num;
        }
        return Numeros;
    }

    public void MostrarMayores(int numeros[], int Num) {

        System.out.println("\n\nImpresión de los numeros mayores:\n");

        for (int i = numeros.length - 1; i >=0; i--)
        {
            if(numeros[i] > Num){
                System.out.println(numeros[i]);
            }

        }
    }
}
