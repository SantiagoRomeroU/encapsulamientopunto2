
package punto2;

/*Santiago Romero*/
/*2024-04-30*/
/*Demostracion encapsulamiento*/
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void depositar (double suma){
        if (suma > 0){
            saldo += suma;
            System.out.println("Se depositaron: " + suma);
        }
        else{
            System.out.println("Debe depositar una cantidad mayor a 0.");
        }
    }
    
    public void retirar (double suma){
        if (suma > 0 && saldo >=suma){
            saldo -= suma;
            System.out.println("Se retiraron: " + suma);
        }
        else{
            System.out.println("No hay fondos suficientes.");
        }
    }

    public double consultarSaldo(){
            return saldo;
}

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
