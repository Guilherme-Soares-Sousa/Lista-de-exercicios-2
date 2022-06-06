// Escreva um programa queleia um número e imprima se este número é ou não par.
import javax.swing.JOptionPane;

public class exercicio23 {

    public static void main (String[] args){

    //Variável para armazenar valor de entrada
    int numeroEntrado;

    //Entrada do valor requisitado
    numeroEntrado = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o número inteiro para consulta:"));

    //Verificação se o número é par ou não, e exibição do resultado 
    if (numeroEntrado % 2 == 0){
        JOptionPane.showMessageDialog(null, "O número entrado ("+ numeroEntrado +") é par!");
    } else {
        JOptionPane.showMessageDialog(null, "O número entrado ("+ numeroEntrado +") não é par!");
    }

    }
}
