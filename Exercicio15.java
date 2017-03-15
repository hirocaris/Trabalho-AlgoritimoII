
package Exercicio15;

import java.util.Scanner;



public class Exercicio15 {
    public static void main(String[] args) {
        System.out.println("Digite:\n Nome \n Email\n Telefone");
        Scanner entrada = new Scanner(System.in);
         char  nome = 30;
    String [] cadastro = new String[nome];
    for(int i=0; i<nome; ++i){
        cadastro[i] = entrada.nextLine();
        
    }for(int i=0; i<nome; ++i){
        System.out.println("Dados "+cadastro[i]);
        
    }
    }
    }

