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

    public void addProducto(Producto p, double ctd, int clave)
    {
        ld.add(new LineaDeDetalle(p,ctd, clave));
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
                for(LineaDeDetalle p: ld) {
                    if(p.getClave()==6 || p.getClave()==7){
                        IDescto = new FrutaDescuento();
                    }else {
                        IDescto = new SinDescuento();
                    }
                }
                
                break;
            case 5:
                IDescto = new EmbutidosLacteos();
                break;
            case 6:
                if(terceraEdad){
                    IDescto = new AdultoMayor();
                }else{
                    IDescto = new SinDescuento();
                }
                break;
            case 7:
                IDescto = new AdultoMayor();
                break;
        }
    }

    public double getTotal()
    {
        float total = 0;
        for(LineaDeDetalle p: ld) {
            p.getP();
            //total += ld.getProducto().getCdt().getPunit()* IDescto.getDescuento();
        }
        return total;
    }
}