import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;
        Scanner aScanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        numero = aScanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        agencia = aScanner.next();

        System.out.println("Por favor, informe o nome do cliente");
        nomeCliente = aScanner.next();

        System.out.println("Por favor, informe o saldo:");
        saldo = aScanner.nextDouble();

        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque\".");

        aScanner.close();

    }
}
