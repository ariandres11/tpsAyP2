
package tp_2_8;


public class CuentaBancaria {
    int numCuenta;
    String nombreTitular;
    double saldo;

    public CuentaBancaria(int numCuenta, String nombreTitular, double saldo) {
        this.numCuenta = numCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString(){
        
        return "\nDueño cuenta: " + nombreTitular + "\nNumero de cuenta: " + numCuenta + "\nSaldo: $ " + saldo;
    }
    
    
    
}
