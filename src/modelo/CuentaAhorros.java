/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class CuentaAhorros extends Cuenta{
    private boolean cuentaActiva;

    public CuentaAhorros(boolean par, double monto, int par1, int par2, int par3, double par4) {
        
    }

    public CuentaAhorros(boolean cuentaActiva, double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, double comisionMensual, double interesMensual) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual, interesMensual);
        this.cuentaActiva = cuentaActiva;
        
    }

    public boolean isCuentaActiva() {
        return cuentaActiva;
    }

    public void setCuentaActiva(boolean cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }

    public void determinarCuenta(){
        if (getSaldo() < 10000) {
            setCuentaActiva(false);
            System.out.println("Su cuenta de ahorros no posee el saldo suficiente para estar activo.");
        } else {
            setCuentaActiva(true);
            System.out.println("Su cuenta de ahorros se encuentra activa.");
        }
    }

    @Override
    public void deposito(double valorDeposito){
        if (isCuentaActiva()) {
            super.deposito(valorDeposito);
            determinarCuenta();
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }

    @Override
    public void retiro(double valorRetiro){
        if (isCuentaActiva()) {
            super.retiro(valorRetiro);
            if (getNumeroRetiros() > 4) {
                setComisionMensual(getComisionMensual() + 1000);
            }
            determinarCuenta();
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }
    public void nretiro(double valoDeposito){
        if (getNumeroRetiros()>4) {
            double npago=(getNumeroRetiros()-4)*1000;
            setComisionMensual(npago);
            super.extractoMensual1();
        }else{
            this.extractoMensual1();
        }
    }

    @Override
    public void extractoMensual(){
        super.extractoMensual();
        determinarCuenta();
        System.out.println("-------EXTRACTO MENSUAL------" + "\n" +
                "Cuenta activa: " + isCuentaActiva() + "\n" +
                "Saldo: " + getSaldo() + "\n" +
                "Interés Mensual: " + getInteresMensual() + "\n" +
                "Comisión Mensual: " + getComisionMensual());
    }

    @Override
    public void imprimir(){
        System.out.println("-------CUENTA DE AHORROS-------" + "\n" +
                "Cuenta activa: " + isCuentaActiva() + "\n" +
                "Saldo de la Cuenta: " + getSaldo() + "\n" +
                "Comision Mensual: " + getComisionMensual()+ "\n" +
                "Nro Transacciones: " + (getNumeroConsignaciones() + getNumeroRetiros()));
    }
    public void imprimir1(){
        String mensaje="";
        if(isCuentaActiva()){
            mensaje="Activa";
           
        }else{
            mensaje="Inactiva";
        }
        System.out.println("DATOS CUENTA DE AHORROS \n" + 
                "Estado: "+isCuentaActiva() + "\n" +
                "Saldo: "+getSaldo()+"\n"+ 
                "Numero de Depositos: "+getNumeroConsignaciones()+"\n"+
                "Numero de Retiros: "+getNumeroRetiros()+"\n"+ 
                "Tasa Anual Interes:"+getTasaAnual()+"\n"+
                "Comisión Banco: "+getComisionMensual());
    }    
}
