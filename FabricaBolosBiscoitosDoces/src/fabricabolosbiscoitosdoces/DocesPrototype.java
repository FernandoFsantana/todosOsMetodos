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
public abstract class DocesPrototype {
 
      protected double valorCompra;
 
    public abstract String exibirInfo();
 
    public abstract DocesPrototype clonar();
 
    public double getValorCompra() {
        return valorCompra;
    }
 
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
}
