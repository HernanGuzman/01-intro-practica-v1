package guzman.unahur.obj2.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    public void GenerarMatriz(){
        //DECLARO LA MATRIZ DE 3X3
        int Matriz[][] = new int[10][10];

        Scanner dato = new Scanner(System.in);

        for (int i = 0; i<=9;i++){

            for (int j = 0; j<=9; j++){

                Matriz[i][j] = NumRandom();
            }
        }

        MostrarMatriz(Matriz);

    }

    private int NumRandom(){
        Random r = new Random();
        return r.nextInt(100);
    }

    private void MostrarMatriz(int Matriz [][]){

        String Linea = "";
        for (int i = 0; i<=9;i++){


            for (int j = 0; j<=9; j++){
                Linea += Matriz[i][j] + " ";


            }
            System.out.println(Linea + "\n");
            Linea="";
        }
    }
}
