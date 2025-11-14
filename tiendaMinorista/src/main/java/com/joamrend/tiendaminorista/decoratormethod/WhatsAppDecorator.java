/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.decoratormethod;

/**
 *
 * @author joanm
 */
public class WhatsAppDecorator extends DecoradorNotificacion {

    public WhatsAppDecorator(NotificadorBase notificador) {
        super(notificador);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        super.enviarNotificacion(mensaje); // primero enviar por canal base
        enviarPorWhatsApp(mensaje);        // luego WhatsApp
    }

    private void enviarPorWhatsApp(String mensaje) {
        System.out.println("Enviando por WhatsApp: " + mensaje);
    }
}