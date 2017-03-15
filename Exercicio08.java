
package Exercicio08;

import java.util.Scanner;
public class Exercicio08 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
         System.out.print("Selecione a opição que deseja\n"
        +"1 - > Calcular ária do Triângulo \n"
        +"2 - > Calcular ária do Quadrado\n"
        +"3 - > Calcular ária do Retângulo\n"
        +"4 - > Calcular ária do Circulo\n"
        +"5 - > Calcular ária do Trapézio\n"
        +"Insira uma opção 1-5\n");
         int op;
        double numero1;
        double numero2;
        double numero3;
        double numero4;
        double numero5;
        double resultado;
        System.out.print("Digite a opição: ");
        op = entrada.nextInt();
        
        switch (op) {
            case 1:
                 System.out.println("Digite o valor da base: ");
                numero1 = entrada.nextDouble();
                System.out.println("Digite o valor da Altura: ");
                numero2 = entrada.nextDouble();
                resultado = (numero1*numero2)/2;
                System.out.println("A aria do Triangulo e: "+resultado);
                break;
                
            case 2:
                System.out.println("Digite o valor de um lado do quadrado: ");
                numero1 = entrada.nextDouble();
                resultado = numero1*2;
                System.out.print("A Aria do quadrado e :"+resultado);
                break;
            case 3:
                System.out.println("Digite o valor de um lado do Retangulo: ");
                numero1 = entrada.nextDouble();
                System.out.println("Digite o valor de um lado do Retangulo: ");
                numero2 = entrada.nextDouble();
                resultado = numero1 * numero2;
            case 4:
                System.out.println("Digite o Raio do Circulo: ");
                numero1 = entrada.nextDouble();
                resultado =  3.1415926535897932* numero1;
                break;
            case 5:
                System.out.println("Digite a Base menor");
                numero1 = entrada.nextDouble();
                System.out.print ("DIgite a Base Maior");
                numero2 = entrada.nextDouble();
                System.err.println("Digite a altura");
                numero3 = entrada.nextDouble();
                
               resultado = (numero2+numero1)*numero3/2;
                System.out.println("O resultado e:"+resultado);
                break;
            default:
                break;
        }
       
{
            
        } 
    
    }
    public void ct(){
        
            
        }
}