package estudo.factoryMethod.segundaForma;

import estudo.factoryMethod.AbstractCarro;
import estudo.factoryMethod.Fiesta;

/**
 * Created by ton on 18/05/15.
 */
public class FabricaFiesta implements IFabricaCarro{
    @Override
    public AbstractCarro criarCarro() {
        return  new Fiesta();
    }
}
