/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio22;



public class Exercicio22 {
      
  
    public static void main(String[] args) {
        int i = 4;

        
     int conta = 0;
        Integer[] origi ;
        origi = new Integer[4];
        for (i=0; i< origi.length; i++){
            origi[i]= conta;
            conta++;
            
            Integer[]cop;
        cop = new Integer[10];
    for (i=0; i<cop.length;i++){
        cop[i]=origi[i];
        System.out.println(cop[i]);
    }
            
        
          
        }    
         
    }
    
}
    
