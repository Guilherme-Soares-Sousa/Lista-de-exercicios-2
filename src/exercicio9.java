/*
Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
seu raio e sua altura.
*/
import javax.swing.JOptionPane;

public class exercicio9 {

    public static void main (String[] args){

        //Variáveis para armazenar os valores de entrada
        float raioDaLata, alturaDaLata, calcAreaRaioLata, calcFinal;
  
        //Entrada dos valores
        raioDaLata = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o raio da lata de oléo:"));
        alturaDaLata = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a altura da lata de oléo:"));

        //Cálculos
        calcAreaRaioLata = (3.14f * (raioDaLata * raioDaLata));
        calcFinal = calcAreaRaioLata * alturaDaLata;

        //Exibição do resultado
        JOptionPane.showMessageDialog(null, "O volume da lata é de " + calcFinal);

    }
    
}
