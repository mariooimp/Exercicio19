package exercicio19;

import javax.swing.*;
public class Exercicio19 {

    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("DIgite uma frase: ");
        int vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de vezes que a frase deve ser repetida: "));
        
        for (int i = 0; i < vezes; i++) {
            JOptionPane.showMessageDialog(null, "A frase é: " + frase);
        }
    }
}