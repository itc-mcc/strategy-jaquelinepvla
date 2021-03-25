package miTiendita.descuento;

import miTiendita.venta.Venta;
import miTiendita.venta.LineaDeDetalle;

public class EmbutidosLacteos implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        float total=0.0f; 
        for(LineaDeDetalle ld: v.getLd()){
            switch(ld.getP().getClave()){
            case 1:
                total += ld.getP().getPunit()*ld.getP().getCtd()*0.15f;
                break;
            case 2:
               total += ld.getP().getPunit()*ld.getP().getCtd()*0.15f;
               break;
            case 3:
                total += ld.getP().getPunit()*ld.getP().getCtd()*0.15f;
                break;
            case 4:
               total += ld.getP().getPunit()*ld.getP().getCtd()*0.05f;
                break;
            case 5:
                return total += ld.getP().getPunit() * ld.getP().getCtd() * 0.15f;
            }
        }
        return total;
        
    } 
} 
