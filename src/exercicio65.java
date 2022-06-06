/*
Faça um programa em C que leia um array de 20 inteiros e imprima o menor e o maior
valor dentre os elementos do array, bem como suas respectivas posições.
*/

import javax.swing.JOptionPane;

public class exercicio65 {
    
    public static void main(String[] args){
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, posicaoMaior = 0, posicaoMenor = 0; 
        
        int[] vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }

        JOptionPane.showMessageDialog(null, "Maior valor: " + maior + "\nPosição: " + posicaoMaior);
        JOptionPane.showMessageDialog(null, "Menor valor: " + menor + "\nPosição: " + posicaoMenor);
    }



}
