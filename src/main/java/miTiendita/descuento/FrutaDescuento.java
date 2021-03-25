package miTiendita.descuento;

import miTiendita.venta.Venta;
import miTiendita.venta.LineaDeDetalle;
public class FrutaDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        float total=0.0f; 
        for(LineaDeDetalle ld: v.getLd()){
            switch(ld.getP().getClave()){
            case 6:
                total += ld.getP().getPunit()*ld.getCtd()*0.15f;
                break;
            case 7:
               total += ld.getP().getPunit()*ld.getCtd()*0.15f;
            }
        }
        return total;
    }
}    
