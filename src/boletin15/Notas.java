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
public class Notas{
    private float escrita1,escrita2,practica,boletin,ce,p;
    private final int boletines=17;
    private byte cb;

    public Notas(){
    }

    public float getEscrita1(){
        return escrita1;
    }

    public float getEscrita2(){
        return escrita2;
    }

    public float getPractica(){
        return practica;
    }

    public float getBoletin(){
        return boletin;
    }

    public void setEscrita1(float escrita1){
        this.escrita1=escrita1;
    }

    public void setEscrita2(float escrita2){
        this.escrita2=escrita2;
    }

    public void setPractica(float practica){
        this.practica=practica;
    }

    public void setBoletin(float boletin){
        this.boletin=boletin;
    }
    
    public void calculoEscritas(){
        boolean fl=false,fl1=false;
        do{ 
            if(fl==true){
                JOptionPane.showMessageDialog(null,"Rango no válido.");
            }
            escrita1=Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota escrita 1:"));
            fl=true;
        }while(escrita1>10 || escrita1<0);
        do{
            if(fl1==true){
                JOptionPane.showMessageDialog(null,"Rango no válido.");
            }
            escrita2=Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota escrita 2:"));
            fl=true;
        }while(escrita2>10 || escrita2<0);
        ce=(escrita1+escrita2)/2;
    }
    
    public void calculoPracticas(){
        boolean fl=false;
        do{
            if(fl==true){
                JOptionPane.showMessageDialog(null,"Rango no válido.");
            }
            p=Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota práctica: "));
            fl=true;
        }while(p>10 || p<0);
    }
    
    public void calculoBoletines(){
        boolean fl=false;
        do{
            if(fl==true){
                JOptionPane.showMessageDialog(null,"Rango no válido.");
            }
            boletin=Float.parseFloat(JOptionPane.showInputDialog("Inserte número de boletínes:"));
            fl=true;
        }while(boletin>boletines || boletin<0);
        boletin=boletin/boletines*100;
        if(boletin<70) cb=0;
        else if(boletin>=70 && boletin<=90) cb=1;
        else cb=2;
    }
    
    public void notaFinal(){
        JOptionPane.showMessageDialog(null, "PRUEBAS ESCRITAS: "+ce+
                "\nPRUEBAS PRÁCTICAS: "+p+
                "\nBOLETINES: "+cb+
                "\nNOTA TOTAL: "+String.format("%.2f",((ce*0.4f)+(p*0.4f)+cb)));
    }
}
