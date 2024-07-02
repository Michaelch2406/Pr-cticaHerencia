/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class ProductosFrescos extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductosFrescos(String fechaCaducidad, String numeroLote) {
        super(fechaCaducidad, numeroLote);
    }

    public ProductosFrescos(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

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

    public void imprimir() {
        super.imprimirInformacion();
        System.out.println("Fecha de envasado: " + getFechaEnvasado());
        System.out.println("País de origen: " + getPaisOrigen());
    }    
}
