/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.decoratormethod;

/**
 *
 * @author joanm
 */
public class Main {
    public static void main(String[] args) {
        // Notificación básica (puede ser SMS o Email)
        NotificadorBase notificadorBase = new NotificadorConcretoBase();

        // Decorador con WhatsApp y Signal
        NotificadorBase notificadorConWhatsApp = new WhatsAppDecorator(notificadorBase);
        NotificadorBase notificadorCompleto = new SignalDecorator(notificadorConWhatsApp);

        // Enviar mensaje por los tres canales
        notificadorCompleto.enviarNotificacion("¡Tu pago vence mañana!");
    }
}