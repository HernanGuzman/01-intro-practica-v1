package guzman.unahur.obj2.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {

        ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
        System.out.println("Ingrese los datos de 20 empleados:\n");
        Scanner dato = new Scanner(System.in);
        for (int i =0; i<=2; i++) {
            System.out.println("Ingrese los datos del empleado numero "+ (i+1) + ":\n");
            System.out.println("Elija un Tipo: \n");
            System.out.println("1_ Administrador:\n");
            System.out.println("2_ Vendedor:\n");
            int opcion = dato.nextInt();
            if(opcion == 1){
                Administrativo A = new Administrativo();
                System.out.println("Ingrese el DNI del empleado:\n");
                A.setDni(dato.next());
                System.out.println("Ingrese el Nombre del empleado:\n");
                A.setNombre(dato.next());
                System.out.println("Ingrese el Apellido del empleado:\n");
                A.setApellido(dato.next());
                System.out.println("Ingrese el Email del empleado:\n");
                A.setMail(dato.next());
                System.out.println("Ingrese el Sueldo Base del empleado:\n");
                String SueldoBAse = dato.next();
                A.setSueldoBase(Double.parseDouble(SueldoBAse));
                System.out.println("Ingrese las horas extras:\n");
                A.setHsExtra(Double.parseDouble(dato.next()));
                System.out.println("Ingrese las hs mes:\n");
                A.setHsMes(Double.parseDouble(dato.next()));


                Empleados.add(A);
            }
            else
            {
                Vendedor V = new Vendedor();
                System.out.println("Ingrese el DNI del empleado:\n");
                V.setDni(dato.next());
                System.out.println("Ingrese el Nombre del empleado:\n");
                V.setNombre(dato.next());
                System.out.println("Ingrese el Apellido del empleado:\n");
                V.setApellido(dato.next());
                System.out.println("Ingrese el Email del empleado:\n");
                V.setMail(dato.next());
                System.out.println("Ingrese el Sueldo Base del empleado:\n");
                V.setSueldoBase(dato.nextDouble());
                Empleados.add(V);
            }

            for (Empleado E:Empleados){
                System.out.println(E.getDni() + " " + E.getNombre() + " " + E.getApellido() + " " + E.getSueldo());


            }



        }
        /*
        Administrativo A = new Administrativo();
        Vendedor V = new Vendedor();
        int Cantidad = 0;
        String Respuesta = "";
        ArrayList<Empleado> Empleados = new ArrayList<Empleado>();

        Scanner dato = new Scanner(System.in);
        Respuesta = Mensaje();


        while (((Respuesta == "1") || (Respuesta == "2")) & (Cantidad < 20)){


            if(Respuesta == "1"){
                //Empleado A = new Empleado();
                System.out.println("Ingrese el nombre:\n");
                A.setNombre(dato.nextLine());
                System.out.println("Ingrese el apellido:\n");
                A.setApellido(dato.nextLine());
                System.out.println("Ingrese el DNI:\n");
                A.setDni(dato.nextLine());
                System.out.println("Ingrese el mail:\n");
                A.setMail(dato.nextLine());
                System.out.println("Ingrese el sueldo base:\n");
                A.setSueldoBase(Double.parseDouble(dato.nextLine()));
                System.out.println("Ingrese las horas extras:\n");
                A.setHsExtra(Double.parseDouble(dato.nextLine()));
                System.out.println("Ingrese la horas del mes:\n");
                A.setHsMes(Double.parseDouble(dato.nextLine()));

                //NO ENTIENDO COMO PUEDO GUARDAR EN UNA LISTA DE EMPLEADOS A UN ADMINISTRADOR
                //POR LO QUE PASO LA INFORMACION QUE TENGO EN UN OBJETO A OTRO
                Empleado E = new Empleado();

                E.setNombre(A.getNombre());

                E.setApellido(A.getApellido());

                E.setDni(A.getDni());

                E.setMail(A.getMail());

                E.setSueldoBase(A.getSueldo());
            }
            else {

            }


        }


        }

        public static String Mensaje(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese los datos de sus empleados cuando termine elija la palabra FIN. Como maximo se pueden ingresar 20:\n");
        System.out.println("Tipo Empleado:\n");
        System.out.println("1_ Administrativo:\n");
        System.out.println("2_ Empleado:\n");
        System.out.println("3_ FIN:\n");
        return dato.nextLine();
        */

    }
}
