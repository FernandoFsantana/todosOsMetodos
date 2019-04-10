/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricabolosbiscoitosdoces;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner teclado = new Scanner(System.in);
   
   int valor;
   int saborBolo;
   int SaborBiscoito;
   
        System.out.println("Para Bolo Digite 1"); 
        System.out.println("Para Biscoito Digite 2");
        System.out.println("Para Doce Digite 3");
        
   valor = teclado.nextInt();
   
   
      if(valor == 1){
    
          System.out.println("Qual o sabor do bolo?");
          System.out.println("");
          System.out.println("Chocolate Digite 1");
          System.out.println("Coco Digite 2");
          System.out.println("Laranja Digite 3");
          System.out.println("Leite Ninho Digite 4");
          
         saborBolo = teclado.nextInt();
         
          if(saborBolo == 1){
               FabricadeBolo fabricadebolo = new FactoryBolo(); 
               BolodeChocolate exemplo1 = fabricadebolo.createBolodeChocolate();
               exemplo1.exibirInfoBolo();
          }else if(saborBolo == 2){
               FabricadeBolo fabricadebolo = new FactoryBolo(); 
               BolodeCoco exemplo1 = fabricadebolo.createBolodeCoco();
               exemplo1.exibirInfoBolo();
          }else if(saborBolo == 3){
               FabricadeBolo fabricadebolo = new FactoryBolo(); 
               BolodeLaranja exemplo1 = fabricadebolo.createBolodeLaranja();
               exemplo1.exibirInfoBolo(); 
          }else if(saborBolo == 4){
               FabricadeBolo fabricadebolo = new FactoryBolo(); 
               BolodeLeiteNinho exemplo1 = fabricadebolo.createBolodeLeiteNinho();
               exemplo1.exibirInfoBolo();
          }
      
     
      
      }else if(valor == 2){
             
          SaborBiscoito = teclado.nextInt();
          
          if(SaborBiscoito == 1){
                   FactoryVerificaSaborBiscoito biscoito = new FactoryVerificaSaborBiscoito();
                   String sabor = "a";
                   String tamanho = "Super Grande";
                   biscoito.getFabricaCelular(sabor, tamanho);
          }else if(SaborBiscoito == 2){
                   FactoryVerificaSaborBiscoito biscoito = new FactoryVerificaSaborBiscoito();
                   String sabor = "b";
                   String tamanho = "Super Super Grande";
                   biscoito.getFabricaCelular(sabor, tamanho);
          }else if(SaborBiscoito == 3){
                   FactoryVerificaSaborBiscoito biscoito = new FactoryVerificaSaborBiscoito();
                   String sabor = "c";
                   String tamanho = "Super Super Grande Grande";
                   biscoito.getFabricaCelular(sabor, tamanho);
          }else if(SaborBiscoito == 4){
                   FactoryVerificaSaborBiscoito biscoito = new FactoryVerificaSaborBiscoito();
                   String sabor = "d";
                   String tamanho = "Super Super Super Grande";
                   biscoito.getFabricaCelular(sabor, tamanho);
          }
    
      }else if(valor == 3){

                          Doce1 doce1 = new Doce1(); 
                          Doce2 doce2 = new Doce2();
  
                          DocesPrototype novodoce = doce1.clonar();
                          novodoce.setValorCompra(900.0);
                          DocesPrototype novodoce1 = doce2.clonar();
                          novodoce1.setValorCompra(2.0);
    
    
                          System.out.println(doce1.exibirInfo());
                 
      }
      
      
    teclado.close();
    
    }
    
}
