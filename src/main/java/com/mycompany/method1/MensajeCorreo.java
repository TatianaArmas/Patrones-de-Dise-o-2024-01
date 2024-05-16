
package com.mycompany.method1;

public class MensajeCorreo implements Mensaje {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Correo: " + mensaje);
    }
}
