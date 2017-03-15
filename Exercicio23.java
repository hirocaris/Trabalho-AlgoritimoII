/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio23;

public class Exercicio23 {
    public static void main(String[] args) {
        int conta =1;
        Integer[][] matiz = new Integer[2][2];
        for(int i=0; i<matiz.length; i++){
            for (int j=0; j<matiz.length; j++){
                matiz[i][j]= conta;
                conta++;
                
        }
    }
    Integer[][] cop = new Integer[2][2];
    for (int i=0; i<cop.length; i++){
        for(int j=0; j<cop.length;j++) {
            cop[i][j] = matiz[i][j];
            System.out.println(cop[i][j]);
        }
    }
    
}
}
