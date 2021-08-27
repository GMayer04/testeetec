package ex01;

import javax.swing.*;

public class Trabalho11 {
    public static void main(String[] args) {
        double m=0,h=0,t=0,cavalo;

        try {

            m = Integer.parseInt(JOptionPane.showInputDialog("qual a masssa a ser levantada ?"));

            h = Integer.parseInt(JOptionPane.showInputDialog("em quantos metros tem que ser levantado ?"));

            t = Integer.parseInt(JOptionPane.showInputDialog("em quanto quantos segundos ?"));

        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,  "Revise o valor digitado! e tente novamente.");

            h = Integer.parseInt(JOptionPane.showInputDialog("em quantos metros tem que ser levantado ?"));

            t = Integer.parseInt(JOptionPane.showInputDialog("em quanto quantos segundos ?"));
            System.exit(1);
            m = Integer.parseInt(JOptionPane.showInputDialog("qual a masssa a ser levantada ?"));

            h = Integer.parseInt(JOptionPane.showInputDialog("em quantos metros tem que ser levantado ?"));

            t = Integer.parseInt(JOptionPane.showInputDialog("em quanto quantos segundos ?"));

        }

        cavalo = (m * h / t) / 745.6999;

        JOptionPane.showMessageDialog(null, "são nesseçarios "+ cavalo+ "cavalos.");




    }
}
