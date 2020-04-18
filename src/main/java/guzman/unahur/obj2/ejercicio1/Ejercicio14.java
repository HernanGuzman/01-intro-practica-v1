package guzman.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio14 {
    public int ConsultarCantidad()
    {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos de su aula:\n");
        String Dato = dato.nextLine();
        return Integer.parseInt(Dato);



    }


    public String[] LLenarArrayAlumnos(int CantAlumnos){

        Scanner dato = new Scanner(System.in);
        String Alumnos [] = new String[CantAlumnos];
        System.out.println("Ingrese el nombre y apellido de los alumnos de su clase:\n");

        for (int i =0; i<=Alumnos.length-1; i++){

            System.out.println("Ingrese los datos del alumno numero "+ (i+1)+":\n");
            Alumnos[i] = dato.nextLine();
        }





        return Alumnos;
    }


    public String LeerInicial()
    {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la inicial por la que desea buscar a los alumnos de su aula:\n");
        return dato.nextLine();




    }



    public void BuscarAlumnos(String Alumnos[], String Inicial){
        System.out.println("A continuación se muestran los alumnos de su clase que coinciden con la letra ingresada:\n");


        for (int i =0; i<=Alumnos.length-1; i++) {
            String IniNomb = Alumnos[i].substring(0,1);

            if(Inicial.trim().equals(IniNomb.trim())){

                System.out.println(Alumnos[i]);
            }
        }

    }
}
