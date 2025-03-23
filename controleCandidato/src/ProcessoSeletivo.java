
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo"); 
        
        List <String> candidatosAprovados = selecaoCandidatos();
        imprimirSelecionados(candidatosAprovados);

        for (String candidato : candidatosAprovados) {
            entrandoEmContato(candidato);
        
        
        }

        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
    }


    static void entrandoEmContato(String candidato) {

        int tentativas = 0;
        boolean continuar = true;
        boolean atendido = false;
        
        do {
            System.out.println("Entrando em contato com o candidato: " + candidato);
            atendido = atender();
            if (atendido == true) {
                System.out.println("Candidato " + candidato + " atendido");
                continuar = false;
            } else {
                System.out.println("Candidato " + candidato + " não atendido");
                tentativas++;
            }

            
        } while (continuar == true && tentativas < 3);
        
        if (atendido == false) {
            System.out.println("Candidato " + candidato + " não atendido após 3 tentativas");
        }else {
            System.out.println("Candidato " + candidato + " atendido após " + tentativas + " tentativas");
        }
        
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(List <String> candidatosAprovados) {
        String [] candidatos = candidatosAprovados.toArray(String[]::new);
        


        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato: " + candidatos[i] + " - Indice: " + (i + 1));
         }
        System.out.println("Forma abreviada de imprimir a lista de candidatos informando o indice do elemento");
        
        for (String candidato : candidatos) {
            System.out.println("Candidato: " + candidato);

        }
        
        }
        static List<String> selecaoCandidatos() {
            
            String [] candidatos = {"Julia","Marcos", "Felipe","Juliana", "João", "Maria", "José", "Ana", "Carlos"};
            
            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;

            List <String> candidatosAprovados = new ArrayList<String>();
            
            while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("Candidato: " + candidato + " - Salário Pretendido: " + salarioPretendido);
                if (salarioBase >= salarioPretendido) {

                    System.out.println("O candidato " + candidato + " foi selecionado");
                    candidatosSelecionados++;
                    candidatosAprovados.add(candidato);
                    



                }
                candidatosAtual++;
                System.out.println("Aprovados: " + candidatosAprovados);

           } 
         return candidatosAprovados; 
       }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500.0, 2500.0);
    }
    
    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){

            System.out.println("Ligar para o Candidato");
        } else if(salarioBase == salarioPretendido){

            System.out.println("Ligar para o Candidato com contra proposta");

        } else {

            System.out.println("Aguardando o Resultado dos Demais Candidatos");
        }

    }

}
