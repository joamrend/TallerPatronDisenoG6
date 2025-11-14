/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.adaptermethod;

/**
 *
 * @author joanm
 */
public class SistemaTransaccionalAntiguo {
    public void ejecutarTransaccionPresencial(String codigo, String parametros) {
        System.out.println("Ejecutando transacción con código: " + codigo + " y parámetros: " + parametros);
    }

    public String obtenerDataCliente(String id) {
        return "Datos del cliente con ID: " + id;
    }
}
