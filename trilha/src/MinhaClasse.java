public class MinhaClasse {
    
    public static void main(String[] args) {

        System.out.println ("Olá, Mundo! este é o meu primeiro programa em Java / Hello world! this is my first Java program"); 

        String nome = "Murillo";
        String sobrenome = "Zuffo";
        System.out.println(nome);
        System.out.println(sobrenome);

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println (nomeCompleto(nome, sobrenome));

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String nome, String sobrenome) {
        return nome + " " + sobrenome ;
    }


}
