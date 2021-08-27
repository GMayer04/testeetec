package ex01;
import javax.swing.*;


public class Trabalho13 {
    public static void main(String[] args) {
        int sexo = 0, qtMulheres = 0, qtHomens = 0;
        float altura = 0, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;

        try {
            for (int i = 0; i < 10; i++) {
                sexo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o sexo da pessoa (1-Mulher, 2-Homem): "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "valor incorreto! tente novamente");
            System.exit(1);
        }


        if (sexo == 1) {
            qtMulheres++;
        } else if (sexo == 2) {
            qtHomens++;
            somaH = somaH + altura;
        } else {
            JOptionPane.showMessageDialog(null, "valor incorreto.");
        }
        if (altura > maior) {
            maior = altura;
        } else if (altura < menor) {
            menor = altura;
        }

        mediaHomens = somaH / qtHomens;


        JOptionPane.showMessageDialog(null, ("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m"));
        JOptionPane.showMessageDialog(null, ("A média de altura dos homens é " + mediaHomens + " m"));
        JOptionPane.showMessageDialog(null, ("O número de mulheres é " + qtMulheres));

        System.exit(1);

    }
}







