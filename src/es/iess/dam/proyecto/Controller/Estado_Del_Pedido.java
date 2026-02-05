package es.iess.dam.proyecto.Controller;

public enum Estado_Del_Pedido {
    NO_DISPONIBLE(0),
    EN_PREPARACION(1),
    LISTO_PARA_ENTREGAR(2),
    ENTREGADO(3);

    private final int nivel;

    Estado_Del_Pedido(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
