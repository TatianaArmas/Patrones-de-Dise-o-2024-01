
package com.mycompany.builder;

public class Manual {
    
    private String materialInfo;
    private String colorInfo;
    private String precioInfo;

    public void setMaterialInfo(String materialInfo) {
        this.materialInfo = materialInfo;
    }

    public void setColorInfo(String colorInfo) {
        this.colorInfo = colorInfo;
    }

    public void setPrecioInfo(String precioInfo) {
        this.precioInfo = precioInfo;
    }

    @Override
    public String toString() {
        return "Manual de Silla Gamer [" + materialInfo + ", " + colorInfo + ", " + precioInfo + "]";
    }
}
