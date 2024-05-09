import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 237.48;

        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite sua conta");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite sua agencia");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agencia é " + 
        numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + 
        " já disponivel para saque.");
        

    }  
      

    }
    
    
