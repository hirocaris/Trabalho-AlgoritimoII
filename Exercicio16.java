
package Exercicio16;

import java.util.Scanner;


public class Exercicio16 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         char nome = 10;
    String [] cadastro = new String[nome];
    for(int i=0; i<nome; ++i){
        cadastro[i] = entrada.nextLine();
        
    }for(int i=0; i<nome; ++i){
        System.out.println("Nomes de clientes ->   "+cadastro[i]);
        
    }
    }
   
    
    
}
