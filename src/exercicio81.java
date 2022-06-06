// Escreva  um  programa  em  C  que  normalize  uma  string  lida,  em  uma  nova  string. Normalizar  uma  string  é  o  processo  de  remover  os  espaços  excedentes  que  separam  as palavras.
import javax.swing.JOptionPane;

public class exercicio81 {

    public static void main(String[] args){

        String frsQlq = "";
        String corretor = "";

        frsQlq = JOptionPane.showInputDialog(null, "Digite uma frase qualquer");
        corretor = frsQlq.replace("  "," ");
        JOptionPane.showMessageDialog(null, corretor);

    }
    
}
