package ex01;

import javax.swing.*;

public class Trabalho10 {
    public static void main(String[] args) {
        double v,r=0,a=0,total;
try {
    a = Integer.parseInt(JOptionPane.showInputDialog("qual a altura da lata ?"));

    r = Integer.parseInt(JOptionPane.showInputDialog("qual o raio da lata ?"));

}
catch(Exception ex){
    JOptionPane.showMessageDialog(null, "uma lata não  pode ter esses valores!");
    System.exit(1);
}

        v = 3.14159;

        total = v * r * r * a;

        JOptionPane.showMessageDialog(null, "o valor do volume da lata é :" + total +"m³");



    }
}
