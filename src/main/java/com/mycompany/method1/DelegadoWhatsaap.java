
package com.mycompany.method1;

public class DelegadoWhatsaap extends Delegado{
    
    @Override
    protected Mensaje crearMensaje() {
        return new MensajeWhatsaap();
    }
}
