package miTiendita.venta;

import miTiendita.productos.Producto;

public class LineaDeDetalle {
    double ctd;
    Producto p;
    int clave;

    public  LineaDeDetalle(Producto p, double ctd, int clave)
    {
        this.p = p;
        this.ctd = ctd;
        this.clave = clave;
    }

    Producto getP() {
        return p;
        
    }
    double getCtd(){
        return ctd;

    }

    int getClave(){
        return clave;
    }
}
