/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.decoratormethod;

/**
 *
 * @author joanm
 */
public class SignalDecorator extends DecoradorNotificacion {

    public SignalDecorator(NotificadorBase notificador) {
        super(notificador);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        super.enviarNotificacion(mensaje); // primero canal base
        enviarPorSignal(mensaje);          // luego Signal
    }

    private void enviarPorSignal(String mensaje) {
        System.out.println("Enviando por Signal: " + mensaje);
    }
}