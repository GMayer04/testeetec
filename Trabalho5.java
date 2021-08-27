package ex01;
import javax.swing.JOptionPane;

public class Trabalho5 {
    public static void main(String[] args) {

      double numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero :"));
      double  antecessor = numero - 1;
      double sucessor = numero + 1;

      JOptionPane.showMessageDialog(null,"o antecessor e sucessor do numero digitado são :"+("Antecessor: "+antecessor+"Sucessor: "+sucessor));

    }
}
