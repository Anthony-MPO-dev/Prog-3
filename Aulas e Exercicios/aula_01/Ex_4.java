/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_4;
import javax.swing.*;


public class Ex_4 {

   
    public static void main(String[] args) {
        float total,qt,pu;
        String nome;
        nome = JOptionPane.showInputDialog("O nome do produto ?");
        qt = Float.parseFloat(JOptionPane.showInputDialog("Escreva quantidade comprada:"));
        pu = Float.parseFloat(JOptionPane.showInputDialog("Escreva o preço unitário:"));
        total = (float)(qt * pu);
        if (total < 5){
        total = (float)(total-(total/100)*2);
        }
        if ((total > 5)&& (total<=10)){
        total = (float)(total-(total/100)*3);
        }
         if (total > 10){
        total =(float) (total-(total/100)*5);
        }
         JOptionPane.showMessageDialog(null,"Você pagara, pelo produto "+nome+" R$"+total);
    }
    
}
