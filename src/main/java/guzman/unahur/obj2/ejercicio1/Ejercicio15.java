package guzman.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio15 {
    public void ContarLetras(String Texto){
        int Contador = 0;
        int Cantidad = 0;
        int CantidadLetras [] = new int [26];

        /*RECORRO TODO EL ABECEDARIO*/
        for (char letra='A'; letra <= 'Z'; letra++){
            //RECORRO EL STRING INGRESADO LETRA POR LETRA
            for(int i =0; i<Texto.length(); i++){
                if(letra == Texto.charAt(i)){
                    Cantidad++;
                }
            }

            CantidadLetras[Contador] = Cantidad;
            Cantidad = 0;
            Contador++;
        }

        VisualizarRecuento(CantidadLetras);
    }

    public void VisualizarRecuento(int CantLetras[]){

        System.out.println("Esta es la cantidad de cada una de las letras que se encontraron en su texto ingresado :\n");
        char Letra = 'A';
        for (int i = 0; i <CantLetras.length; i++){
            System.out.println("Letra " + Letra + ": " + CantLetras[i] + "\n");
            Letra++;
        }

    }

    public String SolicitarTexto(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Por favor ingresar un texto en mayusculas para verificar que letra de cada tipo tiene:\n");
        return dato.nextLine();
    }
}
