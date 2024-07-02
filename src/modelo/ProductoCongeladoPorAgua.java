/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class ProductoCongeladoPorAgua extends ProductosCongelados{
    private double salinidadAgua;

    public ProductoCongeladoPorAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, String temperaturaMantenimiento,
                                    double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.salinidadAgua = salinidadAgua;
    }

    // Getters y setters
    public double getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    public void imprimir() {
        super.imprimirInformacion();
        System.out.println("Salinidad del agua: " + getSalinidadAgua() + " g/L");
    }
}
