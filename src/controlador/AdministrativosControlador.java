/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import modelo.Administrativo;
import modelo.Estudiante;

/**
 *
 * @author LENOVO
 */
public class AdministrativosControlador {
    private Administrativo admin;
    //conexión 
    //HACER CON CADA CONTROLADOR
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection)conexion.conectar(); //UPCASTING (Connection) 
    PreparedStatement ejecutar; //Ayuda a ejecutar la consulta que nosostros enviemos
    ResultSet resultado; 
    
    public void crearEstudiante(Administrativo ad){
        try {
            String consultaSQL="INSERT INTO administrativos (cargo,area,idpersona) VALUES ('"+ad.getCargo()+"','"+ad.getArea()+"',1);";
            PreparedStatement ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            int resultado=ejecutar.executeUpdate();
            if(resultado>0){
                System.out.println("El administrativo fue creado con éxito");
            }else{
                System.out.println("Ingrese datos de manera correcta");
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el administrador, gracias!");
        }
    }
}
