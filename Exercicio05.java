package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        float nota1;
        float nota2;
        float resultado;
        
        System.out.print("Digite as notas:");
        
        System.out.print("Digite a primeira Nota:");
        nota1 = entrada.nextFloat();
        
        System.out.print("Digite a segunda nota:"); 
        nota2 = entrada.nextFloat();
        
        resultado = nota1+nota2;
        
        if (resultado >= 7 ){
           System.out.println("APROVADO");
        } else if(resultado >=4 && resultado <7) {
            System.out.println("EXAME");
        }else{
            System.err.println("REPROVADO");
        }  
    }
    
}