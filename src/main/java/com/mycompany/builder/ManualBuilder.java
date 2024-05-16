
package com.mycompany.builder;

public class ManualBuilder implements Builder{
    
    private Manual manual;

    public ManualBuilder() {
        this.manual = new Manual();
    }

    @Override
    public void setMaterial(String material) {
        manual.setMaterialInfo("Material: " + material);
    }

    @Override
    public void setColor(String color) {
        manual.setColorInfo("Color: " + color);
    }

    @Override
    public void setPrecio(double precio) {
        manual.setPrecioInfo("Precio: " + precio);
    }

    public Manual build() {
        return this.manual;
    }
}
