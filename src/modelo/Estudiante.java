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
    private int numeroMatricula;
    private String horario;
    private String jornada;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int numeroMatricula, String horario, String jornada) {
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.horario = horario;
        this.jornada = jornada;
    }

    public Estudiante(int idEstudiante, int numeroMatricula, String horario, String jornada, int idPersona, String nombres, String apellidos, String cedula, String usuario, String clave, String direccion, String correoElectronico, String sexo, String fNacimiento, int telefono) {
        super(idPersona, nombres, apellidos, cedula, usuario, clave, direccion, correoElectronico, sexo, fNacimiento, telefono);
        this.idEstudiante = idEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.horario = horario;
        this.jornada = jornada;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
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
                "Horario: "+ getHorario()+ "\n"+ "Jornada: "+ getJornada();
    }
}
