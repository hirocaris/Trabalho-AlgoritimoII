
package Exercicio20;

public class Exercicio20 {
    public static void main(String[] args) {
        int contdor = 1;
        Integer entrada[][] = new Integer[3][3];
        for (int i=0; i<3;i++ ){
            for (int j=0; j<3; j++){
                entrada[i][j] = contdor;
                contdor++;
               System.out.print(entrada[i][j]); 
            }System.out.println();
        }
    }
}
