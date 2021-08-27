package ex01;

import javax.swing.*;

public class Trabalho8 {
    public static void main(String[] args) {

    double f1 = 0,f2 = 0,f3 = 0,f4 =0,media;
try {
    f1 = Integer.parseInt(JOptionPane.showInputDialog("qual o salario do funcionario 1 ?"));

    f2 = Integer.parseInt(JOptionPane.showInputDialog("qual o salario do funcionario 2 ?"));

    f3 = Integer.parseInt(JOptionPane.showInputDialog("qual o salario do funcionario 3 ?"));

    f4 = Integer.parseInt(JOptionPane.showInputDialog("qual o salario do funcionario 4 ?"));

}

catch (Exception ex){
    JOptionPane.showMessageDialog(null, "Provavelmente o valor inserido esta errado ou incorreto tente novamente!" );

    System.exit(1);
}
      media = (f1 + f2 + f3 + f4) / 4;

        JOptionPane.showMessageDialog(null, "a media salarial é :" + media);
    }
}

