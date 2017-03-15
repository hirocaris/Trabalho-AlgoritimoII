
package Exercicio14;
import java.util.Scanner;
public class Exercicio14 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digita qual Operação voce deseja realizar\n\n"
                +"1Soma \n"+"2Subitração\n"
                +"3Multiplicação\n"
                +"4divisao");
        
        double nu1 ,nu2, nu3, nu4;
        int menu;
        double nume1;
        double nume2;
        double resposta;
        menu = entrada.nextInt();
       
        switch (menu) {
            case 1:
                // + //
                System.out.println("digite o primeiro numero");
                nume1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero");
                nume2 = entrada.nextDouble();
                resposta = nume1+nume2;
                System.out.println("Resultado: "+resposta);
                break;
            case 2:
                // - //
                System.out.println("digite o primeiro numero");
                nume1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero");
                nume2 = entrada.nextDouble();
                resposta = nume1-nume2;
                System.out.println("Resultado: "+resposta);
                break;
            case 3:
                // * //
                System.out.println("digite o primeiro numero");
            nume1 = entrada.nextDouble();
            System.out.println("Digite o segundo numero");
            nume2 = entrada.nextDouble();
             resposta = nume1*nume2;
             System.out.println("Resultado: "+resposta);
                break;
            case 4:
            // / //
                System.out.println("digite o primeiro numero");
            nume1 = entrada.nextDouble();
            System.out.println("Digite o segundo numero");
            nume2 = entrada.nextDouble();
             resposta = nume1/nume2;
             System.out.println("Resultado: "+resposta);
            break;
        }
        
    }
   
}
