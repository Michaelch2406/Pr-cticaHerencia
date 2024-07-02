/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Administrativo;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;
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
        Persona x = new Persona();
        Docente d = new Docente();
        d.setIdDocente(2);
        d.setNombres("Gabriela");
        d.setApellidos("Valladares");
        d.setTitulo("Ingeniería en Sistemas Computacionales");
        d.setEspecialidad("Backend");
        d.setEscalaSalarial("A1");
        d.setRegistroSenescyt("1001");
        //System.out.println(d.imprimir());
        //objeto administrativo
        Administrativo a = new Administrativo(1, "Secretario", "Software", 3, "Michael", "Chasiguano", "1001657962", 987654133, "michaelchasiguano@gmail.com", "San Francisco", "Masculino", "18 de Enero 2005");
        System.out.println(a.imprimir());

        //CREAR OBJETOS DE LA CLASE PADRE
        //UPCASTING == Principio de crear un objeto de la superclase utilizando recursos de las subclases
        //NO PUEDO ACCDER O ESCRIBIR ATRIBUTOS DE LA CLASE 
        PersonaH p = new Estudiante();
        p.setNombres("Pepito");
        p.setApellidos("Díaz");
        p.setCedula("1002003001");
        //DOWNCASTING CAMBIAR EL TIPO DE DATO A UN OBJETO
        Estudiante e = (Estudiante) p; //
        System.out.println(e.imprimir());
        e.setIdEstudiante(1);
        e.setNumeroMatricula(10001);
        System.out.println(e.imprimir());

        CuentaAhorros ca = new CuentaAhorros();
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

        CuentaAhorros ca1 = new CuentaAhorros();
        ca1.setCuentaActiva(false);
        ca1.setSaldo(15000);
        ca1.setComisionMensual(1.35);
        System.out.println("El estado es: " + ca1.isCuentaActiva());

        CuentaCorriente cc1 = new CuentaCorriente(0, 12000, 0, 0, 0, 0, 0);
        cc1.imprimir();
        System.out.println("------RETIRANDO------");
        cc1.retiroCorriente(13000);
        cc1.extractoMensual1();
        System.out.println("-------DEPOSITANDO--------");
        cc1.depositoCorriente(2500);
        cc1.imprimir();
        System.out.println("RETIRANDO");
        cc1.retiroCorriente(500);
        cc1.imprimir();

            ArrayList<CuentaAhorros> listaCuentaAhorro = new ArrayList<>();
            ArrayList<CuentaCorriente> listaCuentaCorriente = new ArrayList<>();
            Scanner es = new Scanner(System.in);
            System.out.println("BIENVENIDO AL BANCO PEPITO PERÉZ");
            System.out.println("Cuidando tu dinero desde 1992");
            System.out.println("Elija la opción que Usted requiera usar" + "\n"
                    + "1.Crear cuenta" + "\n"
                    + "2.Consultar Saldo" + "\n"
                    + "3.Imprimir Estado de Cuenta" + "\n"
                    + "4.Depósito" + "\n"
                    + "5.Retiros" + "\n");
            int op1 = es.nextInt();
            if (op1 == 1) {
                System.out.println("Elija que tipo de cuenta quiere crear:" + "\n"
                        + "1.Cuenta de Ahorros" + "\n"
                        + "2.Cuenta corriente");
                int sm1 = es.nextInt();
                if (sm1 == 1 || sm1 == 2) {
                    if (sm1 == 1) {
                        System.out.println("FORMULARIO DE CREACIÓN DE CUENTA DE AHORROS");
                        System.out.println("Ingrese el monto de creación");
                        double monto = es.nextDouble();
                        CuentaAhorros caa = new CuentaAhorros(false, monto, 1, 0, 12, 1.35, sm1);
                        listaCuentaAhorro.add(ca);
                        caa.imprimir1();
                    } else if (sm1 == 2) {
                        System.out.println("FORMULARIO DE CREACIÓN DE CUENTA DE AHORROS");
                        System.out.println("Ingrese el monto de creación");
                        double monto = es.nextDouble();
                        CuentaCorriente cc = new CuentaCorriente(0, monto, 1, 0, 12, 1.35, monto);
                        listaCuentaCorriente.add(cc);
                        cc.imprimir();
                    }
                }
            } else {
                System.out.println("Ingrese una opción correcta del menu");
            }

        }else if(op1==0){
            i=0;
    }
                
}


