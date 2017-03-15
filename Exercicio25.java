
package Exercicio25;


import java.util.Scanner;


public class Exercicio25 {
    
      
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        int acesso = 10;
        int pessoa = 0;
        System.out.println("Digite 1 para contar ;)");
    Integer[] nume = new Integer[acesso];
    for(int i =0; i< acesso;i++){
        System.out.println("Digite a primera posição"+(i+1));
        nume[i] = entrada.nextInt();
        pessoa = nume[i] + pessoa;
      
        System.out.println(pessoa);
    }
        
   }
    }
    

