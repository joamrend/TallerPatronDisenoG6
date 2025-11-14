/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.factorymethod;

/**
 *
 * @author joanm
 */
public class FabricaVIP extends FabricaTarjetas {

    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaVIP();
    }
}