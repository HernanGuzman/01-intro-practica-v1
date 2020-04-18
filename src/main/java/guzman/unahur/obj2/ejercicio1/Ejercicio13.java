package guzman.unahur.obj2.ejercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio13 {
    public double[] llenarArrayTemp() {

        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la temperatura del dia hora por hora:\n");
        double Num = 0;

        double Numeros [] = new double[24];
        for (int i = 0; i <24; i++)
        {
            if(i == 0)
            {
                System.out.println("Ingrese la temperatura de la " + (i+1) +" horas:\n");
            }
            else{
                System.out.println("Ingrese la temperatura de las " + (i+1) +" horas:\n");
            }

            //TUBE QUE LEER EL STRING PORQUE ME DABA ERROR CUANDO LO PARSEABA DIRECTAMENTE A INT
            String PP = dato.nextLine();
            Num = Double.parseDouble(PP);;
            Numeros[i] = Num;
        }
        return Numeros;
    }

    public int BuscarTempMin(double Temperaturas[]){
        double Min = 100;
        int posic = 0;
        for (int i =0; i<=Temperaturas.length-1; i++){
            if( Temperaturas[i] < Min ){
                posic = i;
                Min = Temperaturas[i];
            }
        }
        return posic;
    }

    public int BuscarTempMax(double Temperaturas[]){
        double Max = -100;
        int posic = 0;
        for (int i =0; i<=Temperaturas.length-1; i++){
            if( Temperaturas[i] > Max ){
                posic = i;
                Max = Temperaturas[i];
            }
        }
        return posic;
    }

    public double BuscarTempMed(double Temperaturas[]){

        double Tot = 0;
        for (int i =0; i<=Temperaturas.length-1; i++){
            Tot += Temperaturas[i];

        }
        return Tot / 24;
    }

    public void ImprimirTemp (double Temperaturas[], int Max, int Min, double TempMedia ){
        System.out.println(  "\n\nLas temperaturas del dia fueron: ");
        for (int i =0; i<=Temperaturas.length-1; i++){
            if( i == Min ){
                System.out.println( (i) + "  "+CalcularAsteriscos(Temperaturas[i])+ "  "+ (Temperaturas[i]) + "-->MIN\n");
            }
            else if(i == Max){
                System.out.println( (i) + "  "+CalcularAsteriscos(Temperaturas[i])+ "  "+ (Temperaturas[i]) + "-->MAX\n");
            }
            else
            {
                System.out.println( (i) + "  "+CalcularAsteriscos(Temperaturas[i])+ "  "+ (Temperaturas[i]) + "\n");

            }
        }
        //hago que solo se vean dos decimales formateando el resultado
        DecimalFormat Format = new DecimalFormat("#.00");
        System.out.println(  "La temperatura media del dia es: " + (Format.format(TempMedia)));
    }

    private  String CalcularAsteriscos(double Temp) {
        int Cant = (int)Temp;
        String Ast = "";
        for (int i = 1; i<=Cant; i++ ){
            Ast += "*";
        }

        return Ast;
    }
}
