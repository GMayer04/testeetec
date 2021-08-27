package ex01;

import javax.swing.JOptionPane;
public class Trabalho{
    public static void main(String[] args) {
        int op = 0;
        do {
            JOptionPane.showMessageDialog(null, "Escolha  uma das opçãoes.");
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar\n"
                    + "2 - Mostrar Dados\n"
                    + "3 - Excluir Dados\n"
                    + "4 - Sair."));
            switch(op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "1-cadastrar os dados");
                    break;
                case 2:
                    JOptionPane.showConfirmDialog(null, "2-mostrar os dados");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "3-excluir ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"4-Até Logo");
            }
        }while(op >= 1 && op <=3);
    }
}


