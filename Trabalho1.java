package ex01;
import javax.swing.JOptionPane;
public class Trabalho1 {

    public static void main(String[] args) {
     double nota1 = 7;
     double nota2 = 8;
     double nota3 = 9;
     double media1 = (nota1 + nota2 + nota3) / 3;

     JOptionPane.showMessageDialog(null, "Media das primeiras notas :"+media1);

     double nota4 = 4;
     double nota5 = 5;
     double nota6 = 6;
     double media2 = (nota4 + nota5 + nota6) / 3;

     JOptionPane.showMessageDialog(null,"Media das segunda notas :"+media2);

     double somaMedias = media1 + media2;

     JOptionPane.showMessageDialog(null,"Soma das duas medias é :"+somaMedias);

     double mediaFinal = (media1 + media2) / 2;

     JOptionPane.showMessageDialog(null,"media das medias :"+mediaFinal);
    }
}