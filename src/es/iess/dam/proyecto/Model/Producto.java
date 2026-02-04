package es.iess.dam.proyecto.Model;
import java.time.LocalDate;
import es.iess.dam.proyecto.Controller.*;

public class Producto {
  //Datos estaticos y de identificación.
  
  private String nombreProducto;
  private String descripcion;
  private String ingredientes;
  private double precio;
  private int cantidad;
  private double calificacion;

  //Datos de los articulos.
  private Articulo[] listaArticulos;
  private int numArticulosActual;

  public Pedido(String nombreProducto, String descripcion, String ingredientes, double precio, int cantidad, double calificacion) {
        idcontador++;
        this.idPedido = idcontador;

        setNombreProducto(nombreProducto);
        setDescripcion(descripcion);
        setIngredientes(ingredientes);
        setPrecio(precio);
        setCantidad(cantidad);
        setCalificacion(calificacion);
        this.fechaCreacion = LocalDate.now();

        //Inicializamos el array de articulos.
        this.listaArticulos = new Articulo[5];
        this.numArticulosActual = 0;
  }

  //Getters y Setters.
  public void setNombreProducto(String nombreProducto) {
    if (nombreProducto != null && !nombreProducto.isEmpty()) {
      this.nombreProducto = nombreProducto;
    }
  }

  public void setDescripcion(String descripcion) {
    if (descripcion != null && !descripcion.isEmpty()) {
      this.descripcion = descripcion;
    }
  }

  public void setIngredientes(String ingredientes) {
    if (ingredientes != null && !ingredientes.isEmpty()) {
      this.ingredientes = ingredientes;
    }
  }

  public void setPrecio(double precio) {
    if (precio > 0) {
      this.precio = precio;
    }
  }

  public void setCantidad(int cantidad) {
    if (cantidad > 0) {
      this.cantidad = cantidad;
    }
  }

  public void setCalificacion(double calificacion) {
    if (calificacion >= 0 && calificacion <= 10) {
      this.calificacion = calificacion;
    }
  }


 public double calcularTotal() {
    double subtotal = 0;
        for (int i = 0; i < numArticulosActual; i++) {
            if (listaArticulos[i] != null) {
                subtotal += listaArticulos[i].getPrecio(); 
            }
        }
        return subtotal;
}
  public void anadirArticulo(Articulo nuevoArticulo) {
    if (nuevoArticulo != null && numArticulosActual < 5) {
      listaArticulos[numArticulosActual] = nuevoArticulo;
      numArticulosActual++;
      System.out.println("Articulo añadido correctamente");
    }else{
      System.out.println("No se ha podido añadir el articulo");
    }
  }

  public void resumenPedido(){
    System.out.println("============================================");
    System.out.println("\n.          --- TICKET ---");
    System.out.println("============================================");

    System.out.println("Pedido: " + this.nombreProducto + "ID: " + this.idPedido);
    System.out.println("Descripcion: " + this.descripcion);
    System.out.println("Ingredientes: " + this.ingredientes);
    System.out.println("Precio: " + this.precio);
    System.out.println("Cantidad: " + this.cantidad);
    System.out.println("Calificacion: " + this.calificacion);
    System.out.println("============================================");
    System.out.println("Total: " + this.calcularTotal());
    System.out.println("============================================");
  }


}
