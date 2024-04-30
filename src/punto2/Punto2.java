
package punto2;

 
public class Punto2 {

    /*Santiago Romero*/
    /*2024-04-30*/
    /*Demostracion encapsulamiento*/
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1013105261", 500000);
        
        cuenta.depositar (50000);
        cuenta.retirar (100000);
        
        System.out.println("El numero de cuenta es: " + cuenta.getNumeroCuenta());
        System.out.println("El saldo actual es de: " + cuenta.consultarSaldo());
    }
    
}
