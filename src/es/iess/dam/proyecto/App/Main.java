package es.iess.dam.proyecto.App;

import es.iess.dam.proyecto.Controller.Descuentos;
import es.iess.dam.proyecto.Controller.Estado_Del_Pedido;
import es.iess.dam.proyecto.Controller.Tipo_Alimento;
import es.iess.dam.proyecto.Model.Pedido;
import es.iess.dam.proyecto.Model.Producto;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Cliente Pruebas");

        System.out.println("--- Añadiendo artículos ---");
        // Primer producto
        Producto p = new Producto("Tapa", 1.50, Tipo_Alimento.COMIDA, 2);
        // Segundo producto
        Producto p2 = new Producto("Refresco", 1.00, Tipo_Alimento.BEBIDA, 8);
        // Tercer producto
        Producto p3 = new Producto("Helado", 3.50, Tipo_Alimento.POSTRE, 11);
        // Cuarto producto
        Producto p4 = new Producto("Ternera", 15.00, Tipo_Alimento.COMIDA, 5);
        // Quinto producto
        Producto p5 = new Producto("Zumo", 2.50, Tipo_Alimento.BEBIDA, 7);

        pedido1.añadirArticulo(p);
        pedido1.añadirArticulo(p2);
        pedido1.añadirArticulo(p3);
        pedido1.añadirArticulo(p4);
        pedido1.añadirArticulo(p5);

        // SEXTO PRODUCTO, debería saltar el mensaje de error definido en Pedido.java
        Producto p6 = new Producto("Chuletón", 5.00, Tipo_Alimento.COMIDA, 100);
        pedido1.añadirArticulo(p6);

        // Estados
        System.out.println("\n--- Gestionando Estados ---");

        // PEDIDO 1
        pedido1.cambiarEstado(Estado_Del_Pedido.EN_PREPARACION);
        pedido1.cambiarEstado(Estado_Del_Pedido.LISTO_PARA_ENTREGAR);
        pedido1.cambiarEstado(Estado_Del_Pedido.ENTREGADO);
        // pedido1.cambiarEstado(Estado_Del_Pedido.NO_DISPONIBLE);

        // PEDIDO 1 , Pero cambiando el estado al reves (no se puede)
        pedido1.cambiarEstado(Estado_Del_Pedido.ENTREGADO);
        pedido1.cambiarEstado(Estado_Del_Pedido.LISTO_PARA_ENTREGAR);
        pedido1.cambiarEstado(Estado_Del_Pedido.EN_PREPARACION);

        // Resumen final
        System.err.println("\n---SIN DESCUENTO---\n");
        pedido1.resumenPedido();
        System.err.println("\n");
        pedido1.setDescuento(Descuentos.DESCUENTO_20);
        System.err.println("\n---CON DESCUENTO---\n");
        pedido1.resumenPedido();

    }
}
