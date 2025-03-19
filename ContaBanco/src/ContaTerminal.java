import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco MPZ Digital! Vamos criar sua conta!");
        System.out.println("Por favor digite o nome do titular da conta: ");
        String nome = scanner.nextLine();
        
        System.out.println("Prazer em te conhecer " + nome + "! Para dar seguimento ao cadastro, por favor digite o numero da conta: ");
        int numero = scanner.nextInt(); 
        scanner.nextLine();

        System.out.println(nome + ", agora digite o número da agência ");
        String agencia = scanner.nextLine();

        System.out.println("Por fim, realize um depósito inicial para ativar sua conta: ");
        double saldo = scanner.nextDouble();



        System.out.println("Parabens, " + nome + "!! Sua conta criada com sucesso ! " );
        System.out.println("Sua agência é: " + agencia + " e o número da sua conta é: " + numero + "e seu saldo é de: R$ " + saldo);

    //To do: Importar a classe Scanner
    //To do: Exibir mensagem para o usuário
    //To do : pegar pelo scanner o valor digitado
    // To do: Exibir a mensagem conta criada


    }
}
