package edu.danilton.operadores;

public class Operadores3 {
    public static void main(String[] args) {
        //Ternarios
        int a = 1;
        int b = 2;
        String resultado;

        resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        // Relacionais

        boolean simNao = a != b;
        boolean maior = a > b;
        boolean menor = a < b;
        boolean menorIgual = a <= b;
        boolean maiorIgual = a >= b;

        System.out.println(simNao);
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(menorIgual);
        System.out.println(maiorIgual);

        //Logicos

        if (simNao && maior) {
            System.out.println(true);
        }

        if ( menor || menorIgual) {
            System.out.println(true);
        }

    }
}
