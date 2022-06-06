// Escreva um programa que leia uma string e um caracter e conte o número de
// ocorrências do caracter lido na string.

import javax.swing.JOptionPane;

public class exercicio78 {
    
    public static void main(String[] args){

        int counter = 0;
        String anyText = "",caracterProcura="";
        char receptor;
        

        anyText = JOptionPane.showInputDialog(null, "Digite um texto qualquer");
        caracterProcura = JOptionPane.showInputDialog(null, "Digite o caracter que deseja procurar");
        receptor = caracterProcura.charAt(0);

        for (int i = 0; i < anyText.length(); i++) {
            if (anyText.charAt(i) == receptor) {
                counter++;
            }
        }

        JOptionPane.showMessageDialog(null,counter);
    }

}


