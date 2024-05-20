/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 *
 * @author iurypedrosa
 */
public class Desafiojavasimples {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar e obter dados da conta do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = sc.nextDouble();

        // Exibir mensagem com os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        sc.close();
    }
}
