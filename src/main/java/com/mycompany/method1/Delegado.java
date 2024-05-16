
package com.mycompany.method1;

public abstract class Delegado {
    public void notificar(String mensaje) {
        Mensaje msg = crearMensaje();
        msg.enviar(mensaje);
    }

    protected abstract Mensaje crearMensaje();

}
