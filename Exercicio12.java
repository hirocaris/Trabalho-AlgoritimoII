
package Exercicio12;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 10;
        int valor = 0;
    Integer[] nume = new Integer[numero];
    for(int i =0; i<numero; i++){
        System.out.println("Digita o Numero"+(i+1));
        nume[i] = entrada.nextInt();
        valor = nume[i] + valor;
        
        System.out.println("O resultado das somas dos Vetores e: "+valor);
    }
    }
    
    
}
