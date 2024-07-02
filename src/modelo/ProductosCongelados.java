/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class ProductosCongelados extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;
    private String temperaturaMantenimiento;

    public ProductosCongelados(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, String temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    // Getters y setters
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(String temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public void imprimir() {
        super.imprimirInformacion();
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("País de origen: " + getPaisOrigen());
        System.out.println("Temperatura de mantenimiento: " + getTemperaturaMantenimiento());
    }
}
