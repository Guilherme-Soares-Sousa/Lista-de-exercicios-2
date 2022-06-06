// Escreva  um  programa  que  leia  um  vetor  de10  posições  ordenados  de  inteiros  e  um inteiro. O programa deve informar a primeira posição onde este inteiro ocorre no vetor ou -1 caso o valor não ocorra no vetor (Busca Binária).
import javax.swing.JOptionPane;

public class exercicio72 {

    public static void main (String[] args){

        int vtr[] = new int[10];
        int nmrEntrd = 0;

        for (int i=0; i < 10; i++){
            vtr[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor para lista de 10"));
        }

        nmrEntrd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));

        int inicio = 0;
        int fim = vtr.length - 1;
        int meio = 0;

        while(inicio <= fim){

            meio = (int) (inicio + fim) / 2;
            if (vtr[meio] == nmrEntrd){

                break;

            }else if(vtr[meio] < nmrEntrd){

                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }

            if(vtr[meio] == nmrEntrd){

                JOptionPane.showMessageDialog(null, "Número encontrado na posição " + vtr[meio]);

            }else{

                JOptionPane.showMessageDialog(null, "-1 (valor não encontrado)");

            }

    }
}
