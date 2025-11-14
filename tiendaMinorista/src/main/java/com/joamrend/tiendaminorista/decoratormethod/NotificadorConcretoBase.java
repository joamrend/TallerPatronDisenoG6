/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.decoratormethod;

/**
 *
 * @author joanm
 */
public class NotificadorConcretoBase implements NotificadorBase {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación obligatoria: " + mensaje);
    }
}