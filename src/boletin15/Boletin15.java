/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Boletin15{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String[] opciones={"Sí","No"};
        Notas n=new Notas();
        
        while(true){
            int opcion=JOptionPane.showOptionDialog(null, "¿Desea calcular otra nota?", "Notas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
            if(opcion==0){
                try{
                    n.calculoEscritas();
                    n.calculoPracticas();
                    n.calculoBoletines();
                    n.notaFinal();
                }catch(Exception ex1){
                    JOptionPane.showMessageDialog(null, "Valor erróneo, vuelva a empear.");
                }

            } else if(opcion==1) break;
        }
    }
    
}
