
package Exercicio24;


public class Exercicio24 {
    public static void main ( String args[] ){
        Scanner sc = new Scanner (System.in);
        int vetor[];
        System.out.println("Digite o tamanho do vetor: ");
        int tam = sc.nextInt();
        vetor = new int [tam];
        ler (vetor);
        imprir (vetor);
        int i=0;
        int f=vetor.length;
        inverte (vetor, i, f );
        imprir (vetor);
    }
    public static void ler (int[] vet){
        Scanner sc = new Scanner (System.in);
        for (int i=0; i<vet.length; i++){
        System.out.println("Digite o " + (i+1) + " valor ");
        vet[i]=sc.nextInt();
        }
    }
    public static void imprir (int [] vet){
            for (int i=0; i<vet.length; i++){
            System.out.print(vet[i]+ " ");
            }
            System.out.println();
    }
    public static int[] inverte( int[] vtor, int i, int f ){
        int aux;
        if ( i >= f ){
            return vtor;
        }
        else{
            aux = vtor[i];
            vtor[i] = vtor[f];
            vtor[f] = aux;
            return inverte(vtor, i+1, f-1);
        }
    }
}
