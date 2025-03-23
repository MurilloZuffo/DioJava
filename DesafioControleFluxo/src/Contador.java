import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprime a mensagem da exceção
            System.out.println("Erro: " + e.getMessage());
        }

        // Fechar Scanner para evitar vazamento de recursos
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validação: Se o primeiro parâmetro for maior que o segundo, lança exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        if (parametroUm == parametroDois) {
            throw new ParametrosInvalidosException("Os parâmetros não podem ser iguais.");
        }
        if (parametroUm < 0 || parametroDois < 0) {
            throw new ParametrosInvalidosException("Os parâmetros não podem ser negativos.");
        }
          

        // Calculando a quantidade de iterações
        int contagem = parametroDois - parametroUm;

        System.out.println("\n Contagem:");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Número: " + i);
        }
    }
}