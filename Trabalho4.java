package ex01;
import javax.swing.JOptionPane;


public class Trabalho4 {
    public static void main(String[] args) {

        double salarioMinimo = 1100;
        double salarioUsuario = Integer.parseInt(JOptionPane.showInputDialog("digite seu salario :"));
        double fim = (salarioUsuario / salarioMinimo);

        JOptionPane.showMessageDialog(null,"dentro do seu salario tem isso de salarios minimos :"+fim);
    }
}
