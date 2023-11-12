import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	int numero;
	String agencia;
	String nomeCliente;
	BigDecimal saldo;
	
	
	
	System.out.println("Por favor, digite o número da Agência !");
	agencia = sc.next();
	
	System.out.println("Por favor me informe o seu nome primeiro nome ");
	nomeCliente = sc.next();
	
	System.out.println("Por favor me informe o seu nome sobrenome ");
	nomeCliente = nomeCliente + " " + sc.next();
	
    System.out.println("Por favor me informe o o numero da sua conta");
	numero = sc.nextInt();
	
	System.out.println("Ola " + nomeCliente + " Para abertura de conta e necessario um deposito inicial poderia me informar o valor para deposito.");
	saldo = sc.nextBigDecimal();
	
	
	String deposito = String.format(Locale.getDefault(), "%.2f", saldo);
	
	System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
	+ agencia + ", conta " + numero + " e seu saldo " +deposito + " já está disponível para saque.");
	

	
	}
}
