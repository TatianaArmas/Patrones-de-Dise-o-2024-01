
package com.mycompany.method1;

public class DelegadoCorreo extends Delegado {
    @Override
    protected Mensaje crearMensaje() {
        return new MensajeCorreo();
    }
    
}
