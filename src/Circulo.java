/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class Circulo extends Figura2D {
    private double radio;

    // Constructor
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    // Implementación del método para calcular el área del círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del método para calcular el perímetro del círculo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
  
