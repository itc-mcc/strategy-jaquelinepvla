package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class AdultoMayor implements IDesctoStrategy {
    
    @Override
    public float getDescto(Venta v) {
       float total= 0.0f;
        for(LineaDeDetalle ld: v.getLd()){
            total += ld.getP().getPunit() * ld.getP().getCtd() * 0.05f;
        }
        return total;
    }    
}
