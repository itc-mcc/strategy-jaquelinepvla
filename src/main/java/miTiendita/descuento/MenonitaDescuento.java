package miTiendita.descuento;

import miTiendita.venta.Venta;

public class MenonitaDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
       
        System.out.println("Sin descuento ...");
        return 0;
    }
}
