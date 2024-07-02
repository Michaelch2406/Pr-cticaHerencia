/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class ProductosRefrigerados extends Producto{
    private String codigoOrganismo;
    private String fechaEnvasado;
    private String temperaturaMantenimiento;
    private String paisOrigen;

    public ProductosRefrigerados(String fechaCaducidad, String numeroLote, String codigoOrganismo, String fechaEnvasado, String temperaturaMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(String temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void imprimir() {
        super.imprimirInformacion();
        System.out.println("Código de organismo: " + getCodigoOrganismo());
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("Temperatura de mantenimiento: " + getTemperaturaMantenimiento());
        System.out.println("País de origen: " + getPaisOrigen());
    }
}
