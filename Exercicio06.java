
package Exercicio06;
import javax.swing.JOptionPane;
       

public class Exercicio06 {
    private String log1;
    private String log2;
    public void dados(){
        log1 = JOptionPane.showInputDialog("Login");
        log2 = "admin";
        
    }
    public void comparar(){
        if(log1.equalsIgnoreCase(log2)){
            System.out.println("Correto");
        }else{
            System.out.println("Errado");
        }
    }
    public static void main (String[] args){
        Exercicio06 is = new Exercicio06();
        is.dados();
        is.comparar();
    }
}
