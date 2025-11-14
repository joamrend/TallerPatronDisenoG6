/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.factorymethod;

/**
 *
 * @author joanm
 */
public class Main {
    public static void main(String[] args) {
        // Se puede cambiar por FabricaPremium o FabricaVIP
        FabricaTarjetas fabrica = new FabricaBasica();
        CanalAtencion canal = new CanalAtencion(fabrica);
        canal.emitirTarjeta();
    }
}