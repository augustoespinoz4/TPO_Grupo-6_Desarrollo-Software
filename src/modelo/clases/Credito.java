package Clases;

import API.Icartera;

import java.util.Scanner;

public class Credito implements Icartera {

    @Override
    public double realizarCompra(double monto) {
        System.out.println("En cuantas cuotas lo vas a pagar (2,3,6): ");
        Scanner sc = new Scanner(System.in);
        int cuota = sc.nextInt();
        while (cuota!=2 && cuota!=3 && cuota!=6){
            System.out.println("En cuantas cuotas lo vas a pagar (2,3,6): ");
            cuota = sc.nextInt();
        }
        if (cuota == 2){
            monto = monto*1.06;
        } else if (cuota == 3) {
            monto = monto*1.12;
        }
        else {
            monto = monto*1.2;
        }
        return (monto);
    }
}
