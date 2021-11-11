package com.example.springcoredojo.bank;

import org.springframework.stereotype.Component;

@Component
public class CuentaAhorro  implements  Cuenta {

    private double balance = 1000, impuesto = 0.03;
    @Override
    public double cuenta() {
        return 1000;
    }

    @Override
    public double retiroCuenta(double cantidad) {
        if (this.balance  > cantidad){
            balance = balance - cantidad;
        }else {
            System.out.println("el monto es insuficiente");
        }
        return balance;
    }

    @Override
    public double depositarCuenta(double cantidad) {
            this.balance = balance + cantidad;
            return balance;
    }


}
