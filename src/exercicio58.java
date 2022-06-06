// O valor aproximado do número π pode ser calculado usando-se a série (melhor exemplificado no README) faça um programa que calcule e imprima o valor de π usando os N primeiros termos da série(N sendo informado durante a execução do algoritmo).
import javax.swing.JOptionPane;

public class exercicio58 {
    
    public static void main(String[] args){

        float s = 0, divisor = 1, counter = 1;
        int nmrEntrada;
        nmrEntrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de N desejado:"));
        
        while (counter <= nmrEntrada){

             if (counter %2 == 0){

               s = s -1 /divisor*divisor*divisor;

            }else{

                s = s +1 / divisor*divisor*divisor;

            }
             counter = counter + 1;
             divisor = divisor + 2;
}


        
        JOptionPane.showMessageDialog(null,s);

    }
}
