package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Login {

    private String cpf;
    private String senha;

    public Login() {
        this.cpf = cpf;
        this.senha = senha;
    }

    public void telaLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("|  Insira seu CPF:             |");
        System.out.println("--------------------------------");

        this.cpf = cpfMascara(scanner);

        System.out.println("--------------------------------");
        System.out.println("|  Insira sua Senha:           |");
        System.out.println("--------------------------------");
        this.senha = scanner.nextLine();
    }

    private String cpfMascara(Scanner scanner) {
        String input = scanner.nextLine();
        String cpf = "";

        Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            cpf = matcher.group(1) + "." + matcher.group(2) + "." + matcher.group(3) + "-" + matcher.group(4);
        } else {
            System.out.println("--------------------------------");
            System.out.println("|CPF inválido. Tente novamente.|");
            System.out.println("--------------------------------");
            cpf = cpfMascara(scanner);
        }

        return cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }
}
