
package com.mycompany.builder;

public class Cliente {

    public Silla crearSillaGamer() {
        SillaBuilder builder = new SillaBuilder();
        builder.setMaterial(" Cuero");
        builder.setColor(" Negro y Rojo");
        builder.setPrecio( 500);
        return builder.build();
    }

    public Manual crearManualSilla() {
        ManualBuilder builder = new ManualBuilder();
        builder.setMaterial(" Cuero");
        builder.setColor(" Negro y Rojo");
        builder.setPrecio( 500);
        return builder.build();
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Silla silla = cliente.crearSillaGamer();
        System.out.println(silla);

        Manual manual = cliente.crearManualSilla();
        System.out.println(manual);
    }
}
