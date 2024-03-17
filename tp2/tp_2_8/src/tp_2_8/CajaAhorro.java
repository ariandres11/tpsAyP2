package tp_2_8;

public class CajaAhorro extends CuentaBancaria {

    public CajaAhorro(int numCuenta, String nombreTitular, double saldo) {
        super(numCuenta, nombreTitular, saldo);
    }

    public void extraccion(CajaAhorro cajaAhorro, double montoExtraer) {
        double saldo = cajaAhorro.getSaldo();

        if (saldo < montoExtraer) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= montoExtraer;
            cajaAhorro.setSaldo(saldo);
        }
        //Mostrar saldo final
        System.out.println("Saldo final: " + saldo);
    }

    public void deposito(CajaAhorro cajaAhorro, double montoDepositar) {
        double saldo = cajaAhorro.getSaldo();
        saldo += montoDepositar;
        
        cajaAhorro.setSaldo(saldo);
        //Mostrar saldo final
        System.out.println("Saldo final: " + saldo);
    }

}
