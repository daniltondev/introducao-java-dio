package edu.danilton.terminal;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class TerminalEArgumentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome?");
        String nome = scanner.next();

        System.out.println("QUal sua idade");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura?");
        float altura = scanner.nextFloat();

        System.out.println("IDADE >" + idade + " Seu NOME: "+ nome + "altura: "+ altura);


    }
}
