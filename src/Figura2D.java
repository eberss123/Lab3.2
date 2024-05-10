/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public abstract class Figura2D implements Figura {
     private String nombre;
    private String color;

    // Constructor
    public Figura2D(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método abstracto para calcular el perímetro
    public abstract double calcularPerimetro();

    // Método para obtener el nombre de la figura
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el color de la figura
    public String getColor() {
        return color;
    }
}

