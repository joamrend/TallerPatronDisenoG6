/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.factorymethod;

/**
 *
 * @author joanm
 */
public class TarjetaVIP implements TarjetaCredito {

    @Override
    public float obtenerCostoAnual() {
        return 300.0f;
    }

    @Override
    public float obtenerLimiteCredito() {
        return 10000.0f;
    }
}