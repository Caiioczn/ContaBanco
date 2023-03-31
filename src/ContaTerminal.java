import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        System.out.println("Por favor, digite seu nome: ");
        NomeCliente = ler.next();

        ler.nextLine();

        System.out.println("Por favor, digite o numero da Agencia: ");
        Agencia = ler.next();

        ler.nextLine();

        System.out.println("Por favor, digite o numero da conta: ");
        Numero = ler.nextInt();

        System.out.println("Por fim, digite o saldo: ");
        Saldo = ler.nextDouble();
        ler.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso branco, sua agencia é %s, conta %d e seu saldo %.2f, ja esta disponivel para saque.",NomeCliente,Agencia,Numero,Saldo);
    }
}
