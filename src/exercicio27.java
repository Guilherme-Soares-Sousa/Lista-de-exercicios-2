// Escreva  um  programa  que  leia  3  números  e  calcule  a  média  ponderada  entre  eles. Considere que o maior número recebe peso 5 e os outros dois recebem peso 2,5. 
import javax.swing.JOptionPane;

public class exercicio27 {
    
    public static void main (String[] args){

        //Variáveis dos números
        float numeroUm, numeroDois, numeroTres, maior, normalUm, normalDois;
        //Variáveis dos cálculos
        float calcUm, calcDois;

        //Entrada dos números
        numeroUm = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o primeiro número"));
        numeroDois = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o segundo número"));
        numeroTres = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o terceiro número"));

        //Verificação do maior número (considerando que cada um irá diferir)
        if ((numeroUm > numeroDois)&&(numeroUm > numeroTres)){

            maior = numeroUm;
            normalUm = numeroDois;
            normalDois = numeroTres;

        } else if ((numeroDois > numeroUm)&&(numeroDois>numeroTres)) {

            maior = numeroDois;
            normalUm = numeroUm;
            normalDois = numeroTres;

        } else {

            maior = numeroTres;
            normalUm = numeroDois;
            normalDois = numeroTres;

        }

        //Cálculos
        calcUm = (maior * 5) + (normalUm * 2.5f) + (normalDois * 2.5f);
        calcDois = calcUm / (5 + 2.5f + 2.5f);
    
        //Exibição do resultado
        JOptionPane.showMessageDialog(null, "Os números para média ponderada são "+ maior + ", " + normalUm +" e " + normalDois +"\nO resultado da média ponderada é " + calcDois);

    }

}
