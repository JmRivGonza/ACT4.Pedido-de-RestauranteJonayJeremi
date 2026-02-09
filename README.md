## Actividad 4: Pedido de Restaurante
Realizado por Jeremi Gonzalez y Jonay Rivero.

* **Ejecucion** Para poder acceder a la aplicacion, se debe ejecutar el Main.java ubicado en es.iess.dam.proyecto.App

* **Gestión de Productos:** Creación de artículos con nombre, precio, tipo (Bebida, Comida, Postre) y cantidad.
* **Control de Pedidos:** Generación automática de ID único por pedido.
    * Lógica de estados dinámica (No disponible -> En preparación -> Listo -> Entregado).
    * Restricción de flujo: No se puede retroceder de estado ni modificar un pedido entregado.
* **Cálculo Automático:** Cálculo de subtotal, aplicación de descuentos (10%, 20%, 30%)
* **Impresión de Ticket:** Resumen detallado de la compra por consola.

* **Organizacion**
|-- src
|   |-- es
|   |   |-- iess
|   |   |   |-- dam
|   |   |   |   |-- proyecto
|   |   |   |   |   |-- App 
|   |   |   |   |   |   |--\Main
|   |   |   |   |   |-- Controller
|   |   |   |   |   |   |--\Estado_Del_Pedido
|   |   |   |   |   |   |--\Descuento
|   |   |   |   |   |-- Model
|   |   |   |   |   |   |--\Pedido
|
|-- .gitignore
|-- README.md
