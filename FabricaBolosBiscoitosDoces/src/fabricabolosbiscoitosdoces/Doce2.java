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
public class Doce2 extends DocesPrototype {
        protected Doce2(DocesPrototype Doce2) {
        this.valorCompra = Doce2.getValorCompra();
    }

   
    public Doce2() {
        valorCompra = 0.0;
    }
    @Override
    public String exibirInfo() {
        return "Doce: Ameixa\n "+"Valor: R$"
                + getValorCompra();
    }

    @Override
    public DocesPrototype clonar() {
        return new Doce2(this);
    }
    
}
