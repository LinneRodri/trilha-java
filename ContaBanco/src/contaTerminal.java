import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá  "+ nome +", obrigado por se cadastrar em nosso banco, sua agencia é"+ agencia +", conta"+ conta +"e seu saldo é R$"+ saldo);


    }
}
