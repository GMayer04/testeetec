package ex01;
import javax.swing.JOptionPane;

public class Trabalho3 {
    public static void main(String[] args) {

        double ipi = Integer.parseInt(JOptionPane.showInputDialog("Valor Do ipi :"));
        double valorPeça1 = Integer.parseInt(JOptionPane.showInputDialog("Valor da peça :"));
        double quantidadePeça1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de peças :"));

        double valorPeça2 = Integer.parseInt(JOptionPane.showInputDialog("Valor da peça :"));
        double quantidadePeça2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de peças :"));

        double fim = (valorPeça1 * quantidadePeça1 + valorPeça2 * quantidadePeça2) * (ipi/100);

        JOptionPane.showMessageDialog(null,"o valor acrescido ficou :"+ fim);
    }
}
