package edu.danilton.anatomia;
public class Anatomia1 {
    public static void main(String[] args) {
        String nome = "Danilton";
        String sobrenome = "Braga";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
