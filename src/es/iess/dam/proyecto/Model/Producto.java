package es.iess.dam.proyecto.Model;

import es.iess.dam.proyecto.Controller.Tipo_Alimento;

public class Producto {
    private String nombre;
    private double precioUnidad;
    private Tipo_Alimento tipo;
    private int cantidad;

    public Producto(String nombre, double precioUnidad, Tipo_Alimento tipo, int cantidad) {
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    /*
     * Calcula el precio total de este producto (precio * cantidad).
     */
    public double getSubtotal() {
        return this.precioUnidad * this.cantidad;
    }

    // Metodo toString para que se muestre el producto de forma legible.
    public String detalleProducto() {
        return nombre + " (x" + cantidad + ") - " + precioUnidad + "€ [Total: " + getSubtotal() + "€]";
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public Tipo_Alimento getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

}
