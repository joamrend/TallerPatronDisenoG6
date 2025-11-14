/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joamrend.tiendaminorista.decoratormethod;

/**
 *
 * @author joanm
 */
public abstract class DecoradorNotificacion implements NotificadorBase {

    protected NotificadorBase notificadorEnvuelto;

    public DecoradorNotificacion(NotificadorBase notificador) {
        this.notificadorEnvuelto = notificador;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        notificadorEnvuelto.enviarNotificacion(mensaje);
    }
}