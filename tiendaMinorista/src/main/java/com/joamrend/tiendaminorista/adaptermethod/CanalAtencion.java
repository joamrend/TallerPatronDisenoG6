/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.adaptermethod;

/**
 *
 * @author joanm
 */
public class CanalAtencion {
    private InterfazTransaccionesVirtuales adaptador;

    public CanalAtencion(InterfazTransaccionesVirtuales adaptador) {
        this.adaptador = adaptador;
    }

    public void iniciarTransaccion(String tipo) {
        if (tipo.equalsIgnoreCase("consulta")) {
            adaptador.realizarConsultaSaldos();
        } else if (tipo.equalsIgnoreCase("pago")) {
            adaptador.realizarPagoMinimo();
        } else {
            System.out.println("Transacción no soportada");
        }
    }
}
