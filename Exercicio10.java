/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
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
        
        if (lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2 ){
            System.out.print("Isto e um triangulo");
        }else {
            System.out.print("nao e um triangulo");
        }
        
}
}
