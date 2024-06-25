/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Docente extends PersonaH{
    //1.- ATRIBUTOS PROPIOS
    private int idDocente;
    private String Especialidad;
    private String titulo;
    private String registroSenescyt;
    private String escalaSalarial;

    public Docente() {
    }
    public Docente(int idDocente, String Especialidad, String titulo, String registroSenescyt, String escalaSalarial) {
        this.idDocente = idDocente;
        this.Especialidad = Especialidad;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }
    //CONSTRUCTOR SUPERCLASE
    public Docente(int idDocente, String Especialidad, String titulo, String registroSenescyt, String escalaSalarial, int idPersona, String nombres, String apellidos, String cedula, int telefono, String correoElectronico, String direccion, String sexo, String fNacimiento) {
        super(idPersona, nombres, apellidos, cedula, telefono, correoElectronico, direccion, sexo, fNacimiento);
        this.idDocente = idDocente;
        this.Especialidad = Especialidad;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegistroSenescyt() {
        return registroSenescyt;
    }

    public void setRegistroSenescyt(String registroSenescyt) {
        this.registroSenescyt = registroSenescyt;
    }

    public String getEscalaSalarial() {
        return escalaSalarial;
    }

    public void setEscalaSalarial(String escalaSalarial) {
        this.escalaSalarial = escalaSalarial;
    }
    public String imprimir(){
        return "----------------DATOS PERSONA---------------------" +
                "Id: "+ getIdPersona()+ "\n" + 
                "Nombres: "+ getNombres()+ "\n" +
                "Apellidos: "+ getApellidos()+ "\n"+ 
                "Cédula: "+ getCedula() + "\n" + 
                "Teléfono: "+ getTelefono() + "\n" +
                "Correo Electrónico: "+ getCorreoElectronico()+ "\n"+ 
                "Dirección: "+ getDireccion()+ "\n"+ 
                "Sexo: "+ getSexo()+ "\n"+ 
                "Fecha Nacimiento: "+ getfNacimiento()+ "\n"+
                "-----------------DATOS DOCENTES------------------"+ "\n"+
                "Id: "+ getIdDocente()+ "\n"+ 
                "Especialidad: "+ getEspecialidad()+ "\n"+
                "Título: "+ getTitulo()+ "\n"+ 
                "Registro Senescyt: "+ getRegistroSenescyt()+ "\n"+ 
                "Escala Salarial: "+ getEscalaSalarial();
    }
}
