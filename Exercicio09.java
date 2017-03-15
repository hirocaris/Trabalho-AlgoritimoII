
package Exercicio09;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;
        System.out.println("Didite um dos lado do Triangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Digite um dos lados do Triangulo");
        lado2 = entrada.nextDouble();
        System.out.println("Digite um dos lados do Trianguloi");
        lado3 = entrada.nextDouble();
        
        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Triangulo Equilátero");
        }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Triángulo isóceles");
        }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("Triángulo Escaleno");
        }

    }
}
