

package Exercicio21;

public class Exercicio21 {
    public static void main(String[] args) {
        int contador= 1;
        Integer[][][][] entrada = new Integer[10][10][10][10];
        for (int i=0; i<10;i++){
        for (int j=0; j<10; j++){
        for (int k=0; k<10; k++){
        for (int l=0; l<10; l++){
            entrada[i][j][k][l]= contador;
            contador++;
            System.out.print(" "+entrada[i][j][k][l]);
        }System.out.println();
        }
        }
        }
    }
    
}
