import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		String agencia = "";
		String nomeCliente = "";
		double saldo = 0.0;
		// Loop para garantir que um número inteiro válido seja inserido
		while (true) {

			try {
				System.out.println("Por favor, digite o número da Conta :");
				numero = scanner.nextInt();
				scanner.nextLine(); // Consumir a quebra de linha pendente

			} catch (InputMismatchException e) {
				System.out.println("Erro: Você deve digitar somente números.");
				scanner.nextLine(); // Consumir a quebra de linha pendente
				continue;

			}
			break;

		}
		while (true) {
			try {
				System.out.println("Por favor, digite o número da Agência:");
				agencia = scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Erro: Você deve digitar um número de agência válido.");
				continue;
			}
			break;
		}
		while (true) {
			try {
				System.out.println("Por favor, digite seu Nome:");
				nomeCliente = scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Erro: Você deve digitar um nome válido");
				continue;
			}
			break;
		}
		while (true) {
			try {
				System.out.println("Por favor, digite seu Saldo:");
				saldo = scanner.nextDouble();
				scanner.nextLine(); // Consumir a quebra de linha pendente

			} catch (InputMismatchException e) {
				System.out.println("Erro: Você deve digitar um valor de saldo válido.");
				scanner.nextLine(); // Consumir a quebra de linha pendente
				continue;
			}
			break;
		}

        // Formatar saldo como moeda do sistema
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String saldoFormatado = currencyFormat.format(saldo);

        // Exibir mensagem formatada
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(saldoFormatado)
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);

		scanner.close();
	}
}
