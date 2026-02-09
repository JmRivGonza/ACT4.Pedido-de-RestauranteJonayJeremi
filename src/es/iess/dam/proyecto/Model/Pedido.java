package es.iess.dam.proyecto.Model;

import java.time.LocalDate;
import es.iess.dam.proyecto.Controller.*;

public class Pedido {
  // Datos estaticos y de identificación.
  private static int idcontador = 0;
  private int idPedido;

  // Datos del pedido.
  private String nombreCliente;
  private LocalDate fechaCreacion;
  private Estado_Del_Pedido estado;
  private Descuentos descuento;

  // Datos de los articulos.
  private Producto[] listaArticulos;
  private int numArticulos;

  public Pedido(String nombreCliente) {
    idcontador++;
    this.idPedido = idcontador;
    this.nombreCliente = nombreCliente;
    this.estado = Estado_Del_Pedido.EN_PREPARACION;
    this.descuento = Descuentos.NO_DESCUENTO;
    this.fechaCreacion = LocalDate.now();

    // Inicializamos el array de articulos.
    this.listaArticulos = new Producto[5];
    this.numArticulos = 0;
  }

  // Getters y Setters.
  public void setNombreCliente(String nombreCliente) {
    if (nombreCliente != null && !nombreCliente.isEmpty()) {
      this.nombreCliente = nombreCliente;
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

  public void añadirArticulo(Producto art) {
    if (numArticulos < 5) {
      listaArticulos[numArticulos++] = art;
    } else {
      System.out.println("Error: El pedido #" + idPedido + " ya está completo (máx 5).");
    }
  }

  public double calcularSubtotal() {
    double subtotal = 0;
    for (int i = 0; i < numArticulos; i++) {
      subtotal += listaArticulos[i].getSubtotal();
    }
    return subtotal;
  }

  public double calcularTotal() {
    double subtotal = calcularSubtotal();
    double porcentajeDescuento = descuento.getDescuento();
    return subtotal * (1 - porcentajeDescuento);
  }

  public void cambiarEstado(Estado_Del_Pedido nuevoEstado) {
    if (this.estado == Estado_Del_Pedido.ENTREGADO) {
      System.out.println("Error: El pedido ya ha sido entregado y no se puede modificar.");
      return;
    }
    if (nuevoEstado == null) {
      System.out.println("Error: El nuevo estado no puede ser null.");
      return;
    }

    if (nuevoEstado.getNivel() < this.estado.getNivel()) {
      System.out.println("Error: No se puede volver a un estado anterior ("
          + this.estado + " -> " + nuevoEstado + ").");
      return;
    }

    this.estado = nuevoEstado;
    System.out.println("Estado actualizado a: " + this.estado);


  }

  public void resumenPedido() {
    System.out.println("============================================");
    System.out.println("\n           --- TICKET ---");
    System.out.println("============================================");
    System.out.println("RESUMEN DEL PEDIDO ID: " + idPedido);
    System.out.println("Pedido: " + nombreCliente);
    System.out.println("Estado: " + estado);
    System.out.println("Articulos: ");
    for (int i = 0; i < numArticulos; i++) {
      System.out.println(" - " + listaArticulos[i].toString());
    }
    System.out.println("Fecha: " + fechaCreacion);
    System.out.println("============================================");
    System.out.println("Subtotal: " + calcularSubtotal() + "€");
    System.out.println("Descuento: " + descuento);
    System.out.printf("Total: %.2f€\n", calcularTotal());
    System.out.println("============================================");
  }
}
