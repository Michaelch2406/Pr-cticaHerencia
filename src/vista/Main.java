/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Docente;
import modelo.Persona;

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
        System.out.println(d.imprimir());
    }   
}
