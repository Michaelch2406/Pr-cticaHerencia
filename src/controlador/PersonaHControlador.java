/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.PersonaH;
import java.sql.ResultSet;

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
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection)conexion.conectar(); //UPCASTING (Connection) 
    PreparedStatement ejecutar; //Ayuda a ejecutar la consulta que nosostros enviemos
    ResultSet resultado; 
    
    //INSERTAR FILAS EN UNA TABLA
    public void crearPersona(PersonaH p){
        try { //Exception que lanza la consulta
            //String estático -> dinámicos que son los gets
            String conculatSQL="INSERT INTO persona(nombres,apellidos,cedula,usuario,"
                    + "clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono)"
                    + "VALUES ('"+p.getNombres()+"','"+p.getApellidos()+"','"+p.getCedula()+"','"+p.getUsuario()+"','"+p.getClave()+"','"+p.getDireccion()+"','"+p.getCorreoElectronico()+"','"+p.getSexo()+"','"+p.getfNacimiento()+"','"+p.getTelefono()+"');";
                    //'"+p.getNombres()+"' PARA QUE EL USUARIO INGRESE DATOS
                    ejecutar=(PreparedStatement)connection.prepareCall(conculatSQL); //UPCASTING tipo de objeto (PreparedStatement)
                    //DAR CLICK EN EL PLAY ES DECIR EJECUTAR LA CONSULTA
                    int res=ejecutar.executeUpdate(); 
                    if(res>0){
                        System.out.println("La persona ha sido creada con éxito");
                        ejecutar.close(); //Siempre cierro mi conlsuta
                    }else{
                        System.out.println("Favor ingrese correctamente los datos solicitados: ");
                        ejecutar.close(); //Siempre cierro mi conlsuta
                    }
                    
        } catch (Exception e) { //Captura el error el (e)
            System.out.println("ERROR:"+e);
        } //Captura el error y permite que la consola se siga ejecutando
        
 
    }
    
}
