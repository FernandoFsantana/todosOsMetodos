/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricabolosbiscoitosdoces;

/**
 *
 * @author fernando
 */
public class FactoryVerificaSaborBiscoito {
   
    
     public FabricadeBiscoito getFabricaCelular(String sabor, String tamanho){
     
        if(sabor.equals("a"))
         return new Biscoito1(tamanho);
        if(sabor.equals("b"))
         return new Biscoito2(tamanho);
        if(sabor.equals("c"))
         return new Biscoito3(tamanho);
        if(sabor.equals("d"))
         return new Biscoito4(tamanho);
        
        
        return null;
    }
}
