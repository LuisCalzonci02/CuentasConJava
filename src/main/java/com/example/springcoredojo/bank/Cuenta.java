package com.example.springcoredojo.bank;

public interface Cuenta {

    double cuenta();
    double retiroCuenta(double cantidad);
    double depositarCuenta(double cantidad);

}
