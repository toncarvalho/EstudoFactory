package estudo.factoryMethod.segundaForma;

import estudo.factoryMethod.AbstractCarro;
import estudo.factoryMethod.Palio;

/**
 * Created by ton on 18/05/15.
 */
public class FabricaPalio implements IFabricaCarro {
    @Override
    public AbstractCarro criarCarro() {
        return new Palio();
    }
}
