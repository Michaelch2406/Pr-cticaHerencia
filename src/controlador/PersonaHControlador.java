/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.PersonaH;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.CuentaAhorros;
import modelo.Persona;

/**
 *
 * @author LENOVO
 */
public class PersonaHControlador {

    //ATRIBUTOS 
    //modelo
    private PersonaH persona; //CON CADA CLASE
    //conexión 
    //HACER CON CADA CONTROLADOR
    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar(); //UPCASTING (Connection) 
    PreparedStatement ejecutar; //Ayuda a ejecutar la consulta que nosostros enviemos
    ResultSet resultado;

    //INSERTAR FILAS EN UNA TABLA
    public void crearPersona(PersonaH p) {
        try { //Exception que lanza la consulta
            //String estático -> dinámicos que son los gets
            String conculatSQL = "INSERT INTO persona(nombres,apellidos,cedula,usuario,"
                    + "clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono)"
                    + "VALUES ('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "','" + p.getDireccion() + "','" + p.getCorreoElectronico() + "','" + p.getSexo() + "','" + p.getfNacimiento() + "','" + p.getTelefono() + "');";
            //'"+p.getNombres()+"' PARA QUE EL USUARIO INGRESE DATOS
            ejecutar = (PreparedStatement) connection.prepareCall(conculatSQL); //UPCASTING tipo de objeto (PreparedStatement)
            //DAR CLICK EN EL PLAY ES DECIR EJECUTAR LA CONSULTA
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("La persona ha sido creada con éxito");
                ejecutar.close(); //Siempre cierro mi consulta
            } else {
                System.out.println("Favor ingrese correctamente los datos solicitados: ");
                ejecutar.close(); //Siempre cierro mi consulta
            }

        } catch (Exception e) { //Captura el error el (e)
            System.out.println("ERROR:" + e);
        } //Captura el error y permite que la consola se siga ejecutando

    }

    public int buscarIdPersona(String cedula) {
        try {
            String consultaSQL = "select idpersona from persona where cedula='" + cedula + "';";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            resultado = ejecutar.executeQuery();
            if (resultado.next()) {
                int idPersona = resultado.getInt("idpersona"); //Lista Estática
                resultado.close();
                return idPersona;
            } else {
                System.out.println("Ingrese una cédula válida");
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el administrador" + e);
        }
        return 0;
    }

    public ArrayList<PersonaH> listarPersonas() {
        ArrayList<PersonaH> listaPersonas = new ArrayList<>();
        try {
            String consultaSQL = "select nombres, apellidos, usuario, correoElectronico from persona;";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL); //(Casting)
            resultado = ejecutar.executeQuery();
            while (resultado.next()) {
                PersonaH p = new PersonaH();
                p.setNombres(resultado.getString("nombres"));
                p.setApellidos(resultado.getString("apellidos"));
                p.setUsuario(resultado.getString("usuario"));
                p.setCorreoElectronico(resultado.getString("correoElectronico"));
                listaPersonas.add(p);
            }
            resultado.close();
            return listaPersonas;
        } catch (Exception e) {
            System.out.println("Comuníquese con el administrador" + e);
        }
        return null;
    }

    /**
     * Aumentar (ejecutar.setString(2, p.getNombres()); para realizar más
     * cambios
     *
     * @param p
     * @param cedula
     */
    public void actualizarPersonas(PersonaH p, String cedula) {
        try {
            String consultaSQL = "update persona set cedula=?, nombres=? WHERE cedula=?";
            //update persona set cedula='1001657963',nombres='Javier' WHERE cedula='1001657962';
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            ejecutar.setString(1, p.getCedula());
            ejecutar.setString(2, p.getNombres());
            ejecutar.setString(3, cedula);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("Actualización exitosa");
                resultado.close();
            } else {
                System.out.println("Revise los datos a actualizar");
                resultado.close();
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el Administrador..." + e);
        }
    }

    public PersonaH buscardatosPersona(String cedula) {
        PersonaH p = new PersonaH();
        try {
            String consultaSQL = "select nombres,apellidos,cedula,usuario from persona where cedula='" + cedula + "';";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            resultado = ejecutar.executeQuery();
            if (resultado.next()) {
                p.setNombres(resultado.getString("nombres"));
                p.setApellidos(resultado.getString("apellidos"));
                p.setCedula(resultado.getString("cedula"));
                p.setUsuario(resultado.getString("usuario"));
                p.imprimir();
                resultado.close();
                return p;
            } else {
                System.out.println("Ingrese una cédula válida");
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el administrador" + e);
        }
        return null;
    }
    /**
     * delete from persona where cedula='10035555';
     * @param cedula 
     */
    public void eliminarPersonas(String cedula){
        try {
            //String consultaSQL="delete from persona where cedula='"+cedula+"';";
            String consultaSQL="delete from persona where cedula=?;";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);        
            ejecutar.setString(1, cedula);
            int res=ejecutar.executeUpdate();
            if(res>0){
                System.out.println("Acción exitosa");
                ejecutar.close();
            }else{
                System.out.println("El usuario no existe");
                ejecutar.close();
            }       
        } catch (Exception e) {
            System.out.println(""+e);
        }
    
    
    }
}
