package es.iess.dam.proyecto.Controller;

public enum Descuentos {
    NO_DESCUENTO,
    DESCUENTO_10,
    DESCUENTO_20,
    DESCUENTO_30;

    public double getDescuento() {
        switch (this) {
            case NO_DESCUENTO:
                return 0;
            case DESCUENTO_10:
                return 0.1;
            case DESCUENTO_20:
                return 0.2;
            case DESCUENTO_30:
                return 0.3;
            default:
                return 0;
        }
    }
}
