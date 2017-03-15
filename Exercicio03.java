
package Exercicio03;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        float numero;
        double resultado;
        float numeroII;
        
        System.out.print("Digite o nuemro:");
        numero = entrada.nextFloat();
        numeroII = 2;
       resultado = Math.pow(numero,numeroII);
        System.out.print("Resultado:"+resultado);
    }
    
}
