/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.adaptermethod;

/**
 *
 * @author joanm
 */
public class AdapterCanalVirtual implements InterfazTransaccionesVirtuales {
    private SistemaTransaccionalAntiguo sistemaAntiguo;

    public AdapterCanalVirtual(SistemaTransaccionalAntiguo sistema) {
        this.sistemaAntiguo = sistema;
    }

    @Override
    public void realizarConsultaSaldos() {
        String parametros = sistemaAntiguo.obtenerDataCliente("cliente123");
        sistemaAntiguo.ejecutarTransaccionPresencial("CONSULTA_SALDO", parametros);
    }

    @Override
    public void realizarPagoMinimo() {
        String parametros = sistemaAntiguo.obtenerDataCliente("cliente123");
        sistemaAntiguo.ejecutarTransaccionPresencial("PAGO_MINIMO", parametros);
    }
}
