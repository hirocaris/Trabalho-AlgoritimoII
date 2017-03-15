
package Exercicio04;
import java.util.Scanner;
        
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero;
        double resultado;
        
        System.out.print("Digite o nuemro:");
        numero = entrada.nextFloat();
        
        resultado = Math.pow(numero , numero );
        System.out.print("resultado e :"+resultado);
    }
}
