/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;


/**
 *
 * @author Douglas
 */
public class TestePrimo {
    
    
    public boolean teste(int number){
    int cont = 0;
    for(int i = 1 ; i <= number ; i++){
    
        if(number % i == 0){
        cont++;
        }
        
    }
   
    if(cont == 2){
    return true;
    }else{
    return false;
    }
        
    }
    
    
    
    
    
    
    
}
