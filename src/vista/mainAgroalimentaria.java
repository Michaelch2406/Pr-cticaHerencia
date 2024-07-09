/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.ProductoCongeladoPorAgua;
import modelo.ProductoCongeladoPorAire;
import modelo.ProductoCongeladoPorNitrogeno;
import modelo.ProductosFrescos;
import modelo.ProductosRefrigerados;

/**
 *
 * @author LENOVO
 */
public class mainAgroalimentaria {
    public static void main(String[] args) {
        ProductosFrescos pF = new ProductosFrescos("2023-07-01", "12345", "2023-06-15", "Ecuador");
        System.out.println("Producto Fresco:");
        pF.imprimir();
        System.out.println();

        ProductosRefrigerados pR = new ProductosRefrigerados("2024-01-01", 
                "67890", "A123", "2023-06-15", "-5°C", "Chile");
        System.out.println("Producto Refrigerado:");
        pR.imprimir();
        System.out.println();

        ProductoCongeladoPorAire pCAr = new ProductoCongeladoPorAire("2025-12-31", 
                "54321", "2023-06-15", "Perú", "-18°C", 
                78.0, 21.0, 0.03, 0.97);
        System.out.println("Producto Congelado por Aire:");
        pCAr.imprimir();
        System.out.println();

        ProductoCongeladoPorAgua pCAg= new ProductoCongeladoPorAgua("2025-12-31", 
                "09876", "2023-06-15", "Argentina", "-18°C", 3.5);
        System.out.println("Producto Congelado por Agua:");
        pCAg.imprimir();
        System.out.println();

        ProductoCongeladoPorNitrogeno pCN = new ProductoCongeladoPorNitrogeno("2025-12-31", 
                "11223", "2023-06-15", "Brasil", "-18°C", "Inmersión", 
                60);
        System.out.println("Producto Congelado por Nitrógeno:");
        pCN.imprimir();
        System.out.println();
    }
}
