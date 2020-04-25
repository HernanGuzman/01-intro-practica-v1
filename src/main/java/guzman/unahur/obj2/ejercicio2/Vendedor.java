package guzman.unahur.obj2.ejercicio2;

public class Vendedor extends Empleado{

    private double porcenComision;
    private double totalVentas;

    public double getPorcenComision() {
        return porcenComision;
    }

    public void setPorcenComision(double porcenComision) {
        this.porcenComision = porcenComision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public double getSueldo() {
        return this.getSueldo() + (porcenComision * totalVentas/100);
    }
}
