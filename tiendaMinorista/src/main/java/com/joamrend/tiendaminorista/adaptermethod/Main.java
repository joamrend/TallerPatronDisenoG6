/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.adaptermethod;

/**
 *
 * @author joanm
 */
public class Main {
    public static void main(String[] args) {
        SistemaTransaccionalAntiguo sistema = new SistemaTransaccionalAntiguo();
        InterfazTransaccionesVirtuales adaptador = new AdapterCanalVirtual(sistema);
        CanalAtencion canal = new CanalAtencion(adaptador);

        canal.iniciarTransaccion("consulta");
        canal.iniciarTransaccion("pago");
    }
}
