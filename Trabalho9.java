package ex01;

import javax.swing.*;

public class Trabalho9 {
    public static void main(String[] args) {
        float hp,lp,ha,la,resultado;

try {
    hp = Integer.parseInt(JOptionPane.showInputDialog("qual a altura da parede que voce deseja colocar os azulejos ?"));

    lp = Integer.parseInt(JOptionPane.showInputDialog("e qual a largura dessa parede ?"));

    ha = Integer.parseInt(JOptionPane.showInputDialog("qual a altura do azulejo escolhido por voce ?"));

    la = Integer.parseInt(JOptionPane.showInputDialog("e a largura deste azulejo ?"));


    resultado = (hp * lp) / (ha * la);

    JOptionPane.showMessageDialog(null, "o total de azulejos necessario é :" + resultado);
}
catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "erro o valor digitado é invalido! TENTE NOVAMENTE " );

    System.exit(1);


}


    }
}
