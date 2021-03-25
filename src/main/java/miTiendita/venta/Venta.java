package miTiendita.venta;

import miTiendita.descuento.*;
import miTiendita.productos.Producto;
import java.util.*;

public class Venta {
    int diaSemana;
    boolean terceraEdad;
    List<LineaDeDetalle> ld = new ArrayList<LineaDeDetalle>();
    IDesctoStrategy IDescto;

    public Venta(int diaSemana, boolean terceraEdad)
    {
        this.diaSemana = diaSemana;
        this.terceraEdad = terceraEdad;

        addDescto();
    }

    public void addProducto(Producto p, double ctd)
    {
        ld.add(new LineaDeDetalle(p,ctd));
    }

    public void addDescto()
    {
        switch(diaSemana){
            case 1:
                if(terceraEdad){
                    IDescto = new AdultoMayor();
                }else{
                    IDescto = new SinDescuento();
                }
                break;
            case 2:
                IDescto = new SinDescuento();
                break;
            case 3:
                IDescto = new MenonitaDescuento();
                break;
            case 4:
                IDescto = new FrutaDescuento();
                break;
            case 5:
                IDescto = new EmbutidosLacteos();
                break;
            case 6:
                IDescto = new SinDescuento();
                break;
            case 7:
                if(terceraEdad){
                    IDescto = new AdultoMayor();
                }else{
                    IDescto = new SinDescuento();
                }
                break;
        }

    }
    

    public double getTotal()
    {
        double total = 0;
        for(LineaDeDetalle ld: this.getLd()) {
            total += ld.getCtd()*ld.getP().getPunit();
        }
        return 1.16*(total- IDescto.getDescto(this));

    }
    public List<LineaDeDetalle> getLd() {
        return ld;
    }
}