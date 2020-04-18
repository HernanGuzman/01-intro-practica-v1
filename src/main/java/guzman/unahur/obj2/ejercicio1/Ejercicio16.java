package guzman.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio16 {
    public void GenerarMatriz(){
        //DECLARO LA MATRIZ DE 3X3
        String Matriz[][] = new String[3][3];

        Scanner dato = new Scanner(System.in);
        System.out.println("Por favor ingresar el Nombre, Apellido y DNI de tres personas:\n");
        for (int i = 0; i<=2;i++){
            System.out.println("Ingrese los datos de la persona " + (i +1) +":\n");

            for (int j = 0; j<=2; j++){
                if(j == 0){
                    System.out.println("Nombre:\n");

                }
                else if(j==1){
                    System.out.println("Apellido:\n");
                }
                else
                {
                    System.out.println("DNI:\n");
                }

                Matriz[i][j] = dato.nextLine();
            }
        }

        MostrarMatriz(Matriz);

    }

    public void MostrarMatriz(String Matriz[][]){
        System.out.println("Los datos de las personas ingresadas son:\n");

        for (int i = 0; i<=2;i++){
            System.out.println("Datos de la persona " + (i +1) +":\n");

            for (int j = 0; j<=2; j++){
                if(j == 0){
                    System.out.println("Nombre: " + Matriz[i][j] +"\n");

                }
                else if(j==1){
                    System.out.println("Apellido: " + Matriz[i][j] +"\n");
                }
                else
                {
                    System.out.println("DNI: " + Matriz[i][j] + "\n");
                }


            }
        }


    }
}
