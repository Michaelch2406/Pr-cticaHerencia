/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Persona {
    //1.ATRIBUTOS
    private int idPersona;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String correoElectronico;
    //2.MÉTODOS CONSTRUCTORES

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String cedula, String direccion, String correoElectronico) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }
    //3.ENCAPSULAMIENTO

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    //4. MÉTODOS DE REGLA DE NEGOCIO
    public String imprimir(){
        return "*******************DATOS PERSONA*************************\n"
                + "Id: "+ getIdPersona()+"\n"+"Nombre: "
                + getNombre() + "\n"+ "Apellidos: "+ getApellido()+"\n"+"Cédula"
                + getCedula()+"\n"+ "Dirección:"
                + getDireccion()+ "\n"+ "Correo: "+getCorreoElectronico() ;
    }
    //Método de validación cédula exista
    public void validarCedula(){
        int[] listaDigitos=new int [9];
        String cedula=this.getCedula();//Por favor apunte la variable cedula y pongale su valor inicial
        if(cedula.length()>10){
            System.out.println("Ingrese una cedula valida: ");
        } else if (cedula.length()==10){
            for (int i = 0; i < cedula.length()-1; i++) { //Creando lista de DIJITOS 
                listaDigitos[i]=cedula.charAt(i)-'0';
            }
            for(int casa:listaDigitos){
                System.out.println(casa);
            }
        }else{
            System.out.println("Revise el número de cédula: ");
        }
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
