
package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("X+Y= Resultado");
        Scanner entrada = new Scanner(System.in);
         Integer numeroX;
         Integer numeroY;
         Integer total;
         
         System.out.print("Digite o valor de X:");
         numeroX = entrada.nextInt();
         
         System.out.print("igite o valor de Y:");
         numeroY = entrada.nextInt();
         
         total = numeroX+numeroY;
         System.out.print("Resposta de X+Y="+total);
               
    }

    public Exercicio01(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
