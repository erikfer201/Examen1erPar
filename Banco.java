
package banco;


public class Banco {

  
    public static void main(String[] args) {

        
        double totalCuenta;

        // Creamos la cuenta
        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(11111, 2500.70);

        // Consultamos el saldo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " pesos");

        // Ingresamos a la cuenta
        double ingreso = 1000;
        System.out.println("Se ingresan en la cuenta: " + ingreso + " pesos");
        Cuenta1.depositar(ingreso);

        // Consultamos el saldo de nuevo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " pesos");        
        
    }
    
}
