
package Exercicio11;

import java.util.Scanner;

public class Exercicio11 {
   
    public static void main(String[] args) {
         Integer dia;
         Integer mes;
         Integer ano;
   
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o DIA/MES/ANO");
        System.out.print("DIA: ");
        dia = entrada.nextInt();
        System.out.print("MES: ");
        mes = entrada.nextInt();
        System.out.print("ANO: ");
        ano = entrada.nextInt();
        if(dia <= 31 &&mes == 1){
            System.out.println(+dia +"/Janeiro/"+ano);
        }else if(dia >31 && mes == 1){
            System.err.println("ERRO");
        }else if (dia <= 28 && mes == 2){
            System.out.println(dia+"/ Fevereiro / "+ano);
        }else if (dia >28 && mes == 2){
            System.err.println("ERRO");
        }else if (dia <=31 && mes ==3){
            System.out.println(dia+"/ Março /"+ano);
        }else if (dia >31 && mes == 3){
            System.err.println("ERRO");
        }else if (dia <=30&& mes ==4){
            System.out.println(dia+"/ Abril /"+ano);
        }else if (dia >30 &&mes ==4){
            System.err.println("ERRO");
        }else if (dia <=31 && mes == 5){
            System.out.println(dia+"/ Maio /"+ano);
         }else if (dia >31 && mes == 5){
             System.err.println("ERRO");
         }else if (dia <= 30 && mes == 6){
             System.out.println(dia +"/ Junho/ "+ ano);
         }else if (dia > 30 && mes == 6){
             System.err.println("ERRO");
         }else if (dia <=31 && mes == 7 ){
             System.out.println(dia+"/ Julho /"+ano);
         }else if (dia > 31 && mes == 7){
             System.err.println("ERRO");
         }else if (dia <=31 && mes ==8){
             System.out.println(dia+"/ Agosto /"+ano);
         }else if (dia > 31 && mes == 8){
             System.err.println("ERRO");
         }else if (dia <=30 && mes == 9){
             System.out.println(dia+"/ Setembro /"+ano);
         }else if (dia > 30 && mes == 9){
             System.err.println("ERRO");
         }else if ( dia <= 31 && mes == 10){
             System.out.println(dia+"/ Outubro"+ ano);
         }else if (dia > 31 && mes == 10){
             System.err.println("ERRO");
         }else if (dia <=30 && mes == 11){
             System.out.println(dia+"/ Novembro /"+ano);
         }else if (dia >30 && mes == 11){
             System.err.println("ERRO");
         }else if (dia <= 31 && mes == 12){
             System.out.println(dia +"/ Dezembro /"+ ano);
         }else if (dia > 31 && mes == 12 ){
             System.err.println("ERRO");
         }else if (mes > 12 || dia <=0){
             System.err.println("ERRO");
         }else if (mes <=0){
             System.err.println("ERRO");
         }
    }
}
