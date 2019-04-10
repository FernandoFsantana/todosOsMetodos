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
public class Doce1 extends DocesPrototype{

    
      protected Doce1(DocesPrototype Doce1) {
        this.valorCompra = Doce1.getValorCompra();
    }

   
    public Doce1() {
        valorCompra = 0.0;
    }
    @Override
    public String exibirInfo() {
        return "Doce: Amendoin\n "+"Valor: R$"
                + getValorCompra();
    }

    @Override
    public DocesPrototype clonar() {
        return new Doce1(this);
    }
    
}
