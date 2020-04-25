package guzman.unahur.obj2.ejercicio3;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {

        Ticket T = new Ticket();
        LineaTicket LT = new LineaTicket();
        String Respuesta = "";
        Scanner dato = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de ticket:\n");
        //ESTO SERIA UN NUMERO AUTOINCREMENTABLE PERO PARA PROBAR EL NUMERO DE
        //TICKET SIEMPRE VA SER 111
        T.setNumTicket(111);
        System.out.println("Por favor ingrese el nombre del cliente:\n");
        T.setNombreCliente(dato.nextLine());
        T.setFecha("18/04/2020");


        System.out.println("Comience con el ingreso de los articulos, recuerde que el sistema terminará cuando ingrese FIN:\n");
        System.out.println("Descripcion:\n");
        Respuesta = dato.nextLine();
        while (Respuesta != "FIN") {
            LT.setProducto(Respuesta);
            LT.setNumTicket(111);
            System.out.println("Ingrese el precio:\n");
            LT.setPrecioUnit(Double.parseDouble(dato.nextLine()));
            System.out.println("Ingrese las unidades:\n");
            LT.setUnidades(Integer.parseInt(dato.nextLine()));
            LT.Add(LT);

            System.out.println("Articulo guardado, ingrese el siguiente o FIN para terminar:\n");
            Respuesta = dato.nextLine();


        }

        System.out.println("TICKET N° " + T.getNumTicket() + "\n");
        System.out.println("CLIENTE " + T.getNombreCliente() + "\n");
        System.out.println("FECHA " + T.getFecha() + "\n");
        System.out.println("------------------------------------------------------\n");
        System.out.println("DESCRIPCION                   UNIDADES                  PRECIO\n");
        LT.ImprimirItems();







    }
}
