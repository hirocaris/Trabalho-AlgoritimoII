
package Exercicio13;

import javax.swing.JOptionPane;
public class Exercicio13 {
    String menu;
    
    public void Menu (){
        menu = JOptionPane.showInputDialog("Menu\n\n"+"1. Compras\n"+"2.Vendas\n"+"3.Cliente\n"+"4.Cadastro\n"+"5.Mudança de Venda\n");

    }
    public static void main(String[] args) {
        Exercicio13 ls = new Exercicio13();
        ls.Menu();
        
            }
    
}
