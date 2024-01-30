import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero = 0;
        String agencia = "";
        String nomeCliente = " ";
        Double saldo = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "\n\n\n              ******************** Início ********************\n\n\nVamos criar sua conta...");
        System.out.println("Qual o seu nome completo: ");
        nomeCliente = scanner.nextLine();
        System.out.println(nomeCliente + ", por favor, digite o número da sua conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agora digite sua agencia: ");
        agencia = scanner.nextLine();
        System.out.println("Entre com o valor do seu saldo atual: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta: " + numero + " e seu saldo R$" + saldo
                + " já está disponível para saque!\n\n\n           ******************** FIM ******************** \n\n\n");
    }
}
