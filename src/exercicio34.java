// Uma  financeira  usa  o  seguinte  critério  para  conceder  empréstimos: o  valor  total  do empréstimo  deve  seraté  dez  vezes o  valor  da  renda  mensal  do  solicitante e  o  valor  da prestação deve ser no máximo 30% da renda mensal do solicitante.Escreva um programa que  leia  arenda  mensal  de um solicitante,  o valor  total  do  empréstimo  solicitado  e  o número de prestações que o solicitante deseja pagar e informe se o empréstimo pode ou não ser concedido.
import javax.swing.JOptionPane;

public class exercicio34{

    public static void main(String[] args){
        //var de entrada do usuario
        double rendaUser, empreDesejado, prestDesejada;

        //var sobre renda
        double vlrMaxPorPrest, calcParaPrest; 

        //entrada do usuário
        rendaUser = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com a sua renda mensal:"));
        empreDesejado = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o empréstimo desejado:"));
        prestDesejada =  Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com a qntde de prestações desejadas:"));

        //calculo p/ atribuir valor
        vlrMaxPorPrest = (30 * rendaUser)/100;
        calcParaPrest = empreDesejado/prestDesejada;

        JOptionPane.showMessageDialog(null, "A renda mensal do usuário é de: "+ rendaUser + "R$. \nO empréstimo solicitado de: "+ empreDesejado + "R$ \nO número de prestações de: "+ prestDesejada);

        //verificação dos dados
        if ((empreDesejado > rendaUser * 10) || (calcParaPrest > vlrMaxPorPrest) ){

            JOptionPane.showMessageDialog(null, "Seu empréstimo não está liberado.");
            System.exit(0);

        } else {

            JOptionPane.showMessageDialog(null, "Seu empréstimo está liberado.");
        }

    }
    
}
