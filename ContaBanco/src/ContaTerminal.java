import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja muito Bem vindo ao nosso banco! Para prosseguir digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua agência:");
        String agência = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo que irá adicionar:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "  + nome +  " obrigado por criar uma conta em nosso banco, sua agência é "   + agência +  " conta "  + numero + " e seu saldo "  + saldo + " reais já está disponível para saque.");
    }
}
