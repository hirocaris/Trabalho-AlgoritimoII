
package Exercicio07;
import javax.swing.JOptionPane;
public class Exercicio07 {
    public String log1;
    public String log2;
    public String senha1;
    public String senha2;
   public void dados (){
       log1 = JOptionPane.showInputDialog("Login");
       log2 = "admin";
       senha1 = JOptionPane.showInputDialog("Senha");
       senha2 = "admin";
       
   }
    public void comparar (){
        if(log1.equalsIgnoreCase(log2) && senha1.equalsIgnoreCase(senha2)){
            System.out.println("Login efetuado com sucesso");
        }else{
            System.out.println("Usuário e/ou senha incorretos");
        }
    }
    public static void main(String []args){
        Exercicio07 is =new Exercicio07();
        is.dados();
        is.comparar();
        
    }

    
}
