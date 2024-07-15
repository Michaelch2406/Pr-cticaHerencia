/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Estudiante extends PersonaH{
    private int idEstudiante;
    private String numeroMatricula;
    private String jornada;
    private int idPersona;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String numeroMatricula, String jornada, int idPersona) {
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.jornada = jornada;
        this.idPersona = idPersona;
    }

    public Estudiante(int idEstudiante, String numeroMatricula, String jornada, int idPersona, String nombres, String apellidos, String cedula, String usuario, String clave, String direccion, String correoElectronico, String sexo, String fNacimiento, int telefono) {
        super(idPersona, nombres, apellidos, cedula, usuario, clave, direccion, correoElectronico, sexo, fNacimiento, telefono);
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.jornada = jornada;
        this.idPersona = idPersona;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
                "Fecha Nacimiento: "+ getfNacimiento() + "\n" +
                "----------------DATOS ESTUDIANTE-----------------"+"\n"+ 
                "Id: "+ getIdEstudiante()+ "\n"+ 
                "Número de Matrícula: "+ getNumeroMatricula()+ "\n"+ 
                "Jornada: "+ getJornada();
    }
}
