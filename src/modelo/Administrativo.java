/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Administrativo extends PersonaH{
    private int idAdministrativo;
    private String cargo;
    private String area;

    public Administrativo() {
    }

    public Administrativo(int idAdministrativo, String cargo, String area) {
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }

    public Administrativo(int idAdministrativo, String cargo, String area, int idPersona, String nombres, String apellidos, String cedula, int telefono, String correoElectronico, String direccion, String sexo, String fNacimiento) {
        super(idPersona, nombres, apellidos, cedula, telefono, correoElectronico, direccion, sexo, fNacimiento);
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }





    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public String imprimir(){
        return "----------------DATOS PERSONA---------------------" + "\n" +
                "Id: "+ getIdPersona()+ "\n" + 
                "Nombres: "+ getNombres()+ "\n" +
                "Apellidos: "+ getApellidos()+ "\n"+ 
                "Cédula: "+ getCedula() + "\n" + 
                "Teléfono: "+ getTelefono() + "\n" +
                "Correo Electrónico: "+ getCorreoElectronico()+ "\n"+ 
                "Dirección: "+ getDireccion()+ "\n"+ 
                "Sexo: "+ getSexo()+ "\n"+ 
                "Fecha Nacimiento: "+ getfNacimiento()+ "\n" +
                "-----------DATOS ADMINISTRATIVOS-----------------"+ "\n"+
                "Id: "+getIdAdministrativo()+"\n"+ 
                "Cargo: "+getCargo()+ "\n"+ 
                "Area: "+ getArea();
    }
}
