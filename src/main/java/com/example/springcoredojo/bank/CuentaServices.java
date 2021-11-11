package com.example.springcoredojo.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CuentaServices {

    @Qualifier("cuentaAhorro")
    @Autowired
    private Cuenta cuenta;
    @Qualifier("cuentaAhorro")
    @Autowired
    private Cuenta retiroCuenta;
    @Qualifier("cuentaAhorro")
    @Autowired
    private Cuenta depositarCuenta;

    public Cuenta getRetiroCuenta() {
        return retiroCuenta;
    }

    public void setRetiroCuenta(Cuenta retiroCuenta) {
        this.retiroCuenta = retiroCuenta;
    }

    public Cuenta getDepositarCuenta() {
        return depositarCuenta;
    }

    public void setDepositarCuenta(Cuenta depositarCuenta) {
        this.depositarCuenta = depositarCuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
