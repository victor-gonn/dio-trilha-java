import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da Agência!: ");
        String agencia = scanner.next();

        System.out.println("Agora o número da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o nome do Cliente: ");
        String nome = scanner.next();

        double saldo = 5000.99;

        System.out.println("Olá " +nome+", obrigado por criar uma conta em nosso banco," +
        " sua agência é " +agencia+", conta " +conta+ " e seu saldo " +saldo+ " já está disponível"+
         "para saque.");  
    
    }
}