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
public class FactoryBolo implements FabricadeBolo {

    @Override
    public BolodeCoco createBolodeCoco() {
       return new BolodeCoco();
    }

    @Override
    public BolodeChocolate createBolodeChocolate() {
        return new BolodeChocolate();
    }

    @Override
    public BolodeLaranja createBolodeLaranja() {
        return new BolodeLaranja();
    }

    @Override
    public BolodeLeiteNinho createBolodeLeiteNinho() {
        return new BolodeLeiteNinho();
    }
    
}
