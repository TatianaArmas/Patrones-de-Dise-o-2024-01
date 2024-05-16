
package com.mycompany.builder;

public class SillaBuilder implements Builder {
    
    private String material;
    private String color;
    private double precio;

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Silla build() {
        return new Silla(material, color, precio);
    }
}
