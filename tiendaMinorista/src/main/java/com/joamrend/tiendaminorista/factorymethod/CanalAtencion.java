/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.factorymethod;

/**
 *
 * @author joanm
 */
public class CanalAtencion {

    private FabricaTarjetas fabrica;

    public CanalAtencion(FabricaTarjetas fabrica) {
        this.fabrica = fabrica;
    }

    public void emitirTarjeta() {
        TarjetaCredito tarjeta = fabrica.crearTarjeta();
        System.out.println("Tarjeta creada:");
        System.out.println("Costo anual: $" + tarjeta.obtenerCostoAnual());
        System.out.println("Límite de crédito: $" + tarjeta.obtenerLimiteCredito());
    }
}