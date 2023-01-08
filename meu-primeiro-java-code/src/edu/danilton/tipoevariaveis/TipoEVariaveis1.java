package edu.danilton.tipoevariaveis;

public class TipoEVariaveis1 {
    public static void main(String[] args) {
        //Tipos e Variaveis
        byte idade = 123;
        short ano = 2021;
        int cep = 8822500;
        long cpf = 372400L;
        float pi = 3.14f;
        double salario = 8000;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);

        //Exemplo casting
        //Ele ira tranformar o cpf para caber no int
        int exemploCast = (int) cpf;


        System.out.println(exemploCast);
    }
}
