package estudo.factoryMethod.segundaForma;

import estudo.factoryMethod.AbstractCarro;
import estudo.factoryMethod.Gol;

/**
 * Created by ton on 18/05/15.
 */
public class FabricaGol implements IFabricaCarro {
    @Override
    public AbstractCarro criarCarro() {
        return new Gol();
    }
}
