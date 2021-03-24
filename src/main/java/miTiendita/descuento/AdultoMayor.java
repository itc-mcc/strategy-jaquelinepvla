package miTiendita.descuento;

import miTiendita.venta.Venta;

public class AdultoMayor implements IDesctoStrategy {
    @Override
    public float getDescto(Venta v) {
        return 0.05f;
    }    
}