
package com.mycompany.laboratorio01;
import java.util.Scanner;

public class Mochila {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        String[] nombres = new String[]{"Libro", "Botella de agua", "Laptop", "Cuaderno", "Lápiz",
                                         "Reloj", "Cámara", "Mochila", "Teléfono", "Tablet",
                                         "Lentes", "Chompa", "Billetera", "Zapatillas", "Polo"};

        String[] formas = new String[]{"Rectangular", "Cilíndrica", "Rectangular", "Rectangular", "Cilíndrica",
                                        "Circular", "Rectangular", "Rectangular", "Rectangular", "Rectangular",
                                        "Ovalada", "Rectangular", "Ovalada", "Rectangular", "Rectangular"};

        double[] pesos = new double[]{0.5, 0.2, 2.0, 0.3, 0.1, 
                                        0.3, 0.5, 1.0, 0.2, 0.7,
                                        0.1, 0.8, 0.5, 0.7, 0.3};

        double[] precios = new double[]{39.90, 1.20, 899.75, 3.50, 0.5, 
                                        49.90, 239.79, 50.00, 750.99, 199.29,
                                        55.70, 60.00, 25.50, 350.00, 19.90};
        
        
        double precioFinal = 0;
        String elementosMochila = "";
        
        System.out.println("Ingrese la cantidad en peso, que soporta a mochila: ");
        double capacidadMaxima = scanner.nextDouble();
        
        double[][] matriz_mochila = new double[nombres.length + 1][(int) (capacidadMaxima * 100) + 1]; 
        
        for (int i = 1; i <= nombres.length; i++) {
            for (int j = 0; j <= capacidadMaxima*100 ; j++) {
                if (pesos[i-1]*100 <=j) {
                    matriz_mochila[i][j] = Math.max(matriz_mochila[i - 1][j], precios[i - 1] + matriz_mochila[i - 1][(int) (j - pesos[i - 1] * 100)]);
                }else{
                    matriz_mochila[i][j] = matriz_mochila[i - 1][j];
                }
            }
            
        }
        
        //peso máximo que soporta la mochila
        double pesoMaximo = matriz_mochila[nombres.length][(int) (capacidadMaxima * 100)] / 100;
        
        //precio final maximizar
        precioFinal = matriz_mochila[nombres.length][(int) (capacidadMaxima * 100)];
        
        //elementos ingresados a la mochila
        double capacidadRestante = capacidadMaxima;
        
        for (int i = nombres.length; i > 0 && capacidadRestante > 0; i--) {
            if (matriz_mochila[i][(int) (capacidadRestante * 100)] != matriz_mochila[i - 1][(int) (capacidadRestante * 100)]) {
                if (!elementosMochila.isEmpty()) {
                    elementosMochila += ", ";
                }
                elementosMochila += nombres[i - 1];
                capacidadRestante -= pesos[i - 1];
            }
        }
        
        System.out.println("El peso maximo que soporta la mochila es de: "+pesoMaximo);
        System.out.println("El precio final de la mochila es de: "+precioFinal);
        System.out.println("Los elementos que contiene la mochila son: "+elementosMochila);
                         
        
    }
}
