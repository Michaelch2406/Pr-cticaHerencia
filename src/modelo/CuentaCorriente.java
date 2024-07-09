/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class CuentaCorriente extends Cuenta{
    private double sobregiro;

    public CuentaCorriente(int numeroConsignaciones, double sobregiro, int numeroRetiros, int par2, int tasaAnual, double saldo) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual, interesMensual);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }
    public void retiroCorriente(double valorRetiro){
        if(valorRetiro>getSaldo()){
            setSobregiro(valorRetiro-getSaldo());
            setSaldo(0);
            setNumeroRetiros(getNumeroRetiros()+1);
            System.out.println("Su saldo actual es 0 y el valor que adeuda com: "+getSobregiro());
        }else{
            this.retiro(valorRetiro);
        }
    }
    public void depositoCorriente(double valorDeposito){
        if(getSobregiro()>0){
            if(valorDeposito<getSaldo()){
            setSobregiro(getSobregiro()-valorDeposito);
                setNumeroConsignaciones(getNumeroConsignaciones()+1);
                System.out.println("Usted esta sobregirado por: "+getSobregiro());
            }else{
                double saldo=valorDeposito-getSobregiro();
                setSaldo(saldo);
                setNumeroConsignaciones(getNumeroConsignaciones()+1);
                setSobregiro(0);
                System.out.println("Usted ha cancelado el sobrgiro, su saldo actual es: "+getSaldo());
            }
        }else{
            this.deposito(valorDeposito);
        }
    }
    public void imprimir(){
        System.out.println("DATOS CUENTA CORRIENTE \n" + 
                "Saldo: "+getSaldo()+"\n"+ 
                "Sobregiro: "+getSobregiro() + "\n" +
                "Numero de Depositos: "+getNumeroConsignaciones()+"\n"+
                "Numero de Retiros: "+getNumeroRetiros()+"\n"+ 
                "Tasa Anual Interes:"+getTasaAnual()+"\n"+
                "Comisión Banco: "+getComisionMensual());
    }
}
