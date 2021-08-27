package ex01;
import javax.swing.JOptionPane;

public class Trabalho2 {
    public static void main(String[] args) {

        double saldo = 50;
        double acrescimo = saldo * 1 /100 ;
        double saldoFinal = saldo + acrescimo;

    JOptionPane.showMessageDialog(null,"o saldo com acrescimo ficou :"+saldoFinal);
    }
}
