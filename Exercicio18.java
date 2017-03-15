
package Exercicio18;


public class Exercicio18 {
    static void matriz (){
       int contdor = 1;
        Integer entrada[][] = new Integer[10][10];
        for (int i=0; i<entrada.length;i++ ){
            for (int j=0; j<entrada.length; j++){
                entrada[i][j] = contdor;
                contdor++;
                System.out.print(entrada[i][j]+",");
            }System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        matriz();
        }
    }
    

