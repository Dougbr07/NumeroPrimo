/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList();
        TestePrimo primo = new TestePrimo();
        int numeroTeste;
        for(int i = 0 ; i < 1 ; i++){
        numeroTeste = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero "+(i+1)+" a ser testado:"));
        if(primo.teste(numeroTeste)){
            
            list.add(numeroTeste);
        }
        }
        
        for(Integer element : list){
        
            System.out.println(element + ",");
        
        }
        
        
    }
    
}
