package es.iess.dam.proyecto.Model;

import es.iess.dam.proyecto.Controller.*;

public class Pedido {
  private int id;
  private String nombre;
  private String Descripcion;
  private String ingredientes;
  private double precio;
  private int cantidad;
  private double calificacion;
  private Estado_Del_Pedido estado;
  private Descuentos descuento;

  public Pedido(int id, String nombre, String Descripcion, String ingredientes, double precio, int cantidad,
      double calificacion, Estado_Del_Pedido estado, Descuentos descuento) {
    this.id = id;
    this.nombre = nombre;
    this.Descripcion = Descripcion;
    this.ingredientes = ingredientes;
    this.precio = precio;
    this.cantidad = cantidad;
    this.calificacion = calificacion;
    this.estado = estado;
    this.descuento = descuento;
  }

  public Pedido() {
    this.nombre = "";
    this.Descripcion = "No Disponible";
    this.ingredientes = "No Disponible";
    this.precio = 0.0;
    this.cantidad = 0;
    this.calificacion = 0.0;
    this.estado = Estado_Del_Pedido.NO_DISPONIBLE;
    this.descuento = Descuentos.NO_DESCUENTO;
  }

  public void setNombre(String nombre) {
    if (nombre != null && !nombre.isEmpty()) {
      this.nombre = nombre;
    }
  }

  public void setDescripcion(String Descripcion) {
    if (Descripcion != null) {
      this.Descripcion = Descripcion;
    }
  }

  public void setIngredientes(String ingredientes) {
    if (ingredientes != null) {
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
    if (calificacion >= 0.0 && calificacion <= 5.0) {
      this.calificacion = calificacion;
    }
  }

  public void setEstado(Estado_Del_Pedido estado) {
    if (estado != null) {
      this.estado = estado;
    }
  }

  public void setDescuento(Descuentos descuento) {
    if (descuento != null) {
      this.descuento = descuento;
    }
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescripcion() {
    return Descripcion;
  }

  public String getIngredientes() {
    return ingredientes;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public double getCalificacion() {
    return calificacion;
  }

  public Estado_Del_Pedido getEstado() {
    return estado;
  }

  public Descuentos getDescuento() {
    return descuento;
  }



}
