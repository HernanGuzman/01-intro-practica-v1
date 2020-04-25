package guzman.unahur.obj2.ejercicio3;

import java.util.ArrayList;

public class LineaTicket {

    private String producto;
    private double precioUnit;
    private int unidades;

    ArrayList<LineaTicket> Lineas = new ArrayList<LineaTicket>();

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    private int numTicket;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void Add(LineaTicket L){
        Lineas.add(L);
    }

    public void ImprimirItems(){
        double total = 0;
        for(LineaTicket L: Lineas){
            total += L.getPrecioUnit() * L.getUnidades();
            System.out.println(L.getProducto() + "          " + L.getUnidades() + "        " + L.getPrecioUnit() * L.getUnidades());
        }
        System.out.println("TOTAL DE LA COMPRA: " + total + "\n");
    }
}
