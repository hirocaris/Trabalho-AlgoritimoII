
package Exercicio02;

import java.util.Scanner;
public class Exercicio02 {
     public static void main(String[] args) {
        System.out.println("X*Y= Total");
        
       Scanner entrada = new Scanner(System.in);
       Integer numeroX;
       Integer numeroY;
       Integer total;
       
       System.out.print("Digite o valor do X:");
       numeroX = entrada.nextInt();
       
       System.out.print("Digite o valor de Y:");
       numeroY = entrada.nextInt();
       
       total= numeroX*numeroY;
       
       System.out.print("X*Y="+total);
               
      
    }
    
    
}
