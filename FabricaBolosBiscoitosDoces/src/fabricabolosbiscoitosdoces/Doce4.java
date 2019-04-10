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
public class Doce4 extends DocesPrototype {
        protected Doce4(DocesPrototype Doce4) {
        this.valorCompra = Doce4.getValorCompra();
    }

   
    public Doce4() {
        valorCompra = 0.0;
    }
    @Override
    public String exibirInfo() {
        return "Doce: leite\n "+"Valor: R$"
                + getValorCompra();
    }

    @Override
    public DocesPrototype clonar() {
        return new Doce4(this);
    }
}
