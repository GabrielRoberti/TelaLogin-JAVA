package org.example;

import javax.swing.*;
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
        StringBuilder BoasVindas = new StringBuilder();
        StringBuilder Negado = new StringBuilder();

//        System.out.println("--------------------------------");
//        System.out.println("|  Insira seu CPF:             |");
//        System.out.println("--------------------------------");
//
//        this.cpf = cpfMascara(scanner);
//
        String cpf = JOptionPane.showInputDialog("Digite seu CPF");
        JOptionPane.showMessageDialog(null,cpfMascara(cpf));

//        System.out.println("--------------------------------");
//        System.out.println("|  Insira sua Senha:           |");
//        System.out.println("--------------------------------");
//        this.senha = scanner.nextLine();

        String senha = JOptionPane.showInputDialog("Digite sua SENHA");
        JOptionPane.showMessageDialog(null,senha);

        if (cpf.equals("39598291839") && senha.equals("123")){
            BoasVindas.append("Bem-vindo!");
            JOptionPane.showMessageDialog(null, BoasVindas);

        } else if (cpf.length() >= 13) {
            Negado.append("Tente novamente!");
            telaLogin();

        } else {
            Negado.append("Acesso Negado!");
            JOptionPane.showMessageDialog(null, Negado);
            telaLogin();
        }
    }

    private String cpfMascara(String scanner) {
        String input = scanner;
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
