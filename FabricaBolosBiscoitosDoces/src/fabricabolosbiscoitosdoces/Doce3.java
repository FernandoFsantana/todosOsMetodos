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
public class Doce3 extends DocesPrototype{
        protected Doce3(DocesPrototype Doce3) {
        this.valorCompra = Doce3.getValorCompra();
    }

   
    public Doce3() {
        valorCompra = 0.0;
    }
    @Override
    public String exibirInfo() {
        return "Doce: figo\n "+"Valor: R$"
                + getValorCompra();
    }

    @Override
    public DocesPrototype clonar() {
        return new Doce3(this);
    }
}
