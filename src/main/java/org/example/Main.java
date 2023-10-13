package org.example;



public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.telaLogin();

        System.out.println("CPF inserido: " + login.getCpf());
        System.out.println("Senha inserida: " + login.getSenha());
    }
}