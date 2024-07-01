/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Administrativo;
import modelo.CuentaAhorros;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;
import modelo.PersonaH;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Persona x=new Persona();
        Docente d=new Docente();
        d.setIdDocente(2);
        d.setNombres("Gabriela");
        d.setApellidos("Valladares");
        d.setTitulo("Ingeniería en Sistemas Computacionales");
        d.setEspecialidad("Backend");
        d.setEscalaSalarial("A1");
        d.setRegistroSenescyt("1001");
        //System.out.println(d.imprimir());
        //objeto administrativo
        Administrativo a=new Administrativo(1, "Secretario", "Software", 3, "Michael", "Chasiguano", "1001657962", 987654133, "michaelchasiguano@gmail.com", "San Francisco", "Masculino", "18 de Enero 2005");
        System.out.println(a.imprimir());
        
        //CREAR OBJETOS DE LA CLASE PADRE
        //UPCASTING == Principio de crear un objeto de la superclase utilizando recursos de las subclases
        //NO PUEDO ACCDER O ESCRIBIR ATRIBUTOS DE LA CLASE 
        PersonaH p=new Estudiante();
        p.setNombres("Pepito");
        p.setApellidos("Díaz");
        p.setCedula("1002003001");
        //DOWNCASTING CAMBIAR EL TIPO DE DATO A UN OBJETO
        Estudiante e=(Estudiante)p; //
        System.out.println(e.imprimir());
        e.setIdEstudiante(1);
        e.setNumeroMatricula(10001);
            System.out.println(e.imprimir());
            
        CuentaAhorros ca=new CuentaAhorros();
        ca.setSaldo(985746.09);
        ca.determinarCuenta();
        ca.setComisionMensual(0);
        ca.setTasaAnual(12);
        ca.setNumeroRetiros(1000);
        ca.setNumeroRetiros(2000);
        ca.setNumeroRetiros(3000);
        ca.setNumeroRetiros(25000);
        ca.setNumeroRetiros(900);
        ca.extractoMensual();
        ca.setNumeroRetiros(1000);
        ca.extractoMensual();
    }   
}
