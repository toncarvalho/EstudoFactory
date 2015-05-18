package estudo.factoryMethod.segundaForma;

import estudo.factoryMethod.AbstractCarro;
import estudo.factoryMethod.Celta;

/**
 * Created by ton on 18/05/15.
 */
public class FabricaCelta implements IFabricaCarro {
    @Override
    public AbstractCarro criarCarro() {
        return  new Celta();
    }
}
