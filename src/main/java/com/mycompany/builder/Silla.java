
package com.mycompany.builder;

public class Silla {
    private String material;
    private String color;
    private double precio;

    public Silla(String material, String color, double precio) {
        this.material = material;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Silla Gamer con Material=" + material + ", Color=" + color + ", Precio=" + precio + " ";
    }
}
