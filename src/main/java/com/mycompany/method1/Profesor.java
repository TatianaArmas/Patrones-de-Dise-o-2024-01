

package com.mycompany.method1;

public class Profesor {

   private Delegado delegado;

    public Profesor(Delegado delegado) {
        this.delegado = delegado;
    }

    public void enviarAviso(String aviso) {
        delegado.notificar(aviso);
    }

    public static void main(String[] args) {
        Delegado delegadoCorreo = new DelegadoCorreo();
        Profesor profesor = new Profesor(delegadoCorreo);
        profesor.enviarAviso("Delegado: Profesor avisa que Clase cancelada.");

        Delegado delegadoRedSocial = new DelegadoWhatsaap();
        profesor = new Profesor(delegadoRedSocial); 
        profesor.enviarAviso("Delegado: Profesor avisa que Clase cancelada.");
    }
}
