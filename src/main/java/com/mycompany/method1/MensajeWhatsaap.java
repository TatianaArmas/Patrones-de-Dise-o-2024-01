
package com.mycompany.method1;

public class MensajeWhatsaap implements Mensaje {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando a Whatsaap: " + mensaje);
    }
}



