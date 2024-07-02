/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class ProductoCongeladoPorNitrogeno extends ProductosCongelados{
    private String metodoCongelacion;
    private int tiempoExposicion;

    public ProductoCongeladoPorNitrogeno(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, String temperaturaMantenimiento,
                                         String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    // Getters y setters
    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    public void imprimir() {
        super.imprimirInformacion();
        System.out.println("Método de congelación: " + getMetodoCongelacion());
        System.out.println("Tiempo de exposición: " + getTiempoExposicion() + " segundos");
    }
}
