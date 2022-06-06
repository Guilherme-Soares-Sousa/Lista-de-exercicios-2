// Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.
import javax.swing.JOptionPane;

public class exercicio3 {

    public static void main (String[] args){
    
        //Variável para armazenar os valores
        float raioQualquer,calcPeri,calcArea;

        //Mensagem de entrada do usuário
        raioQualquer = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o raio que possui:"));

        //Cálculos
        calcPeri = ((3.14f*2) * raioQualquer);
        calcArea = (3.14f * (raioQualquer * raioQualquer));

        //Exibição dos resultados
        JOptionPane.showMessageDialog(null, "O cálculo da área resultou em: " + calcArea);
        JOptionPane.showMessageDialog(null, "O cálculo do perímetro resultou em: " + calcPeri);


    }
}