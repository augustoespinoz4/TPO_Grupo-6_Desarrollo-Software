package Clases;

import API.Icartera;

public class Efectivo implements Icartera {

    @Override
    public double realizarCompra(double monto) {
        return (monto*0.9);
    }
}
