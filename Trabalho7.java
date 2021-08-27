package ex01;
import javax.swing.JOptionPane;

public class Trabalho7 {
    public static void main(String[] args) {
    double C = 0, F, K,Rr, Re;

    try {
        C = Integer.parseInt(JOptionPane.showInputDialog("Qual a temperatura em graus celcios ?"));
    }

    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(null, "o valor digitados esta errado ou é um algarismo invalido!");
        C = Integer.parseInt(JOptionPane.showInputDialog("Qual a temperatura em graus celcios ?"));
    }

            F = C * 1.8 + 32;
            K = C + 273.15;
            Rr = C * 1.8 + 32 + 459.67;
            Re = C * 0.8;


            JOptionPane.showMessageDialog(null, "Essa temperatura em Fahrenheit é :" + F);
            JOptionPane.showMessageDialog(null, "Essa Temperatura em Kelvin é :" + K);
            JOptionPane.showMessageDialog(null, "Essa temperatura em Reaumur é :" + Rr);
            JOptionPane.showMessageDialog(null, "Essa temperatura em Rankine é :" + Re);

    }
}
