package es.iess.dam.proyecto.App;

import es.iess.dam.proyecto.Controller.Descuentos;
import es.iess.dam.proyecto.Controller.Estado_Del_Pedido;
import es.iess.dam.proyecto.Model.Pedido;

public class Main {
    public static void main(String[] args) throws Exception {
        // Crear un pedido
        Pedido pedido = new Pedido();
        pedido.setNombre("Pizza");
        pedido.setDescripcion("Pizza de pepperoni");
        pedido.setIngredientes("Pepperoni, queso, tomate");
        pedido.setPrecio(10.0);
        pedido.setCantidad(2);
        pedido.setCalificacion(4.5);
        pedido.setEstado(Estado_Del_Pedido.EN_PREPARACION);
        pedido.setDescuento(Descuentos.DESCUENTO_10);

        // Crear menu.

        // Mostrar Ticket.
        System.out.println("============================================");
        System.out.println("\n.          --- TICKET ---");
        System.out.println("============================================");

        System.out.println("Pedido: " + pedido.getNombre());
        System.out.println("Descripcion: " + pedido.getDescripcion());
        System.out.println("Ingredientes: " + pedido.getIngredientes());
        System.out.println("Precio: " + pedido.getPrecio());
        System.out.println("Descuento: " + pedido.getDescuento());
        System.out.println("Cantidad: " + pedido.getCantidad());
        System.out.println("Calificacion: " + pedido.getCalificacion());
        System.out.println("Estado: " + pedido.getEstado());
        System.out.println("ID: " + pedido.getId());
        System.out.println("============================================");
        System.out.println("Total: " + pedido.calcularTotal());
        System.out.println("============================================");
    }
}
