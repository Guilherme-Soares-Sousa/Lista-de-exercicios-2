// Escreva um programa que calcule o quociente da divisão de A por B (número inteiros e positivos),  ou  seja,  A  /  B,  através  de  subtrações  sucessivas.  Essesdois  valores  são passados pelo usuário através do teclado.
import javax.swing.JOptionPane;

public class exercicio46 {
    
    public static void main (String[] args){

        //var de entrada
        float nmrA = 0, nmrB = 0;

        //var para o calculo
        float resultado = 0;

        //entrada dos números
        nmrA = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o número A:"));
        nmrB = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com o número B:"));

        //calculo
        resultado = nmrA / nmrB;

        //laço para amostra das subtrações

        while (nmrA >= resultado){

            JOptionPane.showMessageDialog(null, nmrA);
            nmrA = nmrA - nmrB;

        }

        JOptionPane.showMessageDialog(null, resultado);

    }

}
