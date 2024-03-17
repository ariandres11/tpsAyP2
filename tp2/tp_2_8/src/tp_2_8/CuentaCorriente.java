package tp_2_8;

public class CuentaCorriente extends CuentaBancaria {

    double saldoNeg;

    public CuentaCorriente(double saldoNeg, int numCuenta, String nombreTitular, double saldo) {
        super(numCuenta, nombreTitular, saldo);
        this.saldoNeg = saldoNeg;
    }

    public double getSaldoNeg() {
        return saldoNeg;
    }

    public void setSaldoNeg(double saldoNeg) {
        this.saldoNeg = saldoNeg;
    }

    public void extraccion(CuentaCorriente cuentaCorriente, double montoExtraer) {
        double saldo = cuentaCorriente.getSaldo();
        double saldoNeg = cuentaCorriente.getSaldoNeg();

        if (saldo < montoExtraer) {
            saldoNeg = saldo-montoExtraer;
            System.out.println("Saldo negativo: " + saldoNeg);
            
            
        } else {
            saldo -= montoExtraer;
            cuentaCorriente.setSaldo(saldo);
        }
        //Mostrar saldo final
        System.out.println("Saldo final: " + saldo);
        if (saldoNeg < 0) {
            System.out.println("Saldo negativo: " + saldoNeg);
        }
    }

    public void deposito(CajaAhorro cajaAhorro, double montoDepositar) {
        double saldo = cajaAhorro.getSaldo();
        saldo += montoDepositar;

        cajaAhorro.setSaldo(saldo);
        //Mostrar saldo final
        System.out.println("Saldo final: " + saldo);
    }

}
