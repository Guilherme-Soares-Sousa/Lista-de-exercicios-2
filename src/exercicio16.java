// Escreva  um  programa  para  gerar  o  invertido  de  um  número  com  três  algarismos (exemplo: o invertido de 498 é 894).
import javax.swing.JOptionPane;

public class exercicio16 {
    
    public static void main (String[] args){
        
        //Variáveis para armazenar os valores de entrada
        String numero;
        String inverso;

        //Entrada do usuário
        numero = JOptionPane.showInputDialog(null, "Entre com o número de três digitos:");
        
        //Invertendo a ordem dos algarismos
        inverso  = new StringBuilder(numero).reverse().toString();

        //Exibição do resultado
        JOptionPane.showMessageDialog(null,"O invertido do número "+ numero +" é " + inverso);

    }

}
