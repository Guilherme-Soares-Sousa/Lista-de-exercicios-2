// Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, eum paísB com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano,escrevaum programa, que imprimao tempo necessário para que a população do país A ultrapasse a população do país B.
import javax.swing.JOptionPane;

public class exercicio53 {
    
    public static void main(String[] args){
        //valores dos paises
        float paisA = 5000000, paisB = 7000000;

        int ano = 1;

        //var porcentagens
        float nataliA = 0, nataliB = 0;
        nataliA = (paisA * 3) / 100;
        nataliB = (paisB * 2) / 100;

        //laço para calculo

        while (paisA < paisB){

            paisA = paisA + nataliA;
            paisB = paisB + nataliB;
            ano = ano + 1;

        }

        JOptionPane.showMessageDialog(null, "Em "+ ano + " ano(s) a população do país A é de: "+ paisA + "\ne do país B de: " + paisB);

    }
}
