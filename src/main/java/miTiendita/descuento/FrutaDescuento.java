package miTiendita.descuento;

import miTiendita.venta.Venta;

public class FrutaDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        return 0.15f;
    }
}
