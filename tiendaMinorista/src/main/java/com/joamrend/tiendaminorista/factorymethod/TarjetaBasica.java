/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.factorymethod;

/**
 *
 * @author joanm
 */
public class TarjetaBasica implements TarjetaCredito {

    @Override
    public float obtenerCostoAnual() {
        return 50.0f;
    }

    @Override
    public float obtenerLimiteCredito() {
        return 1000.0f;
    }
}