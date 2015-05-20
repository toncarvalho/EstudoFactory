package estudo.abstractFactory;

/**
 * Created by ton on 20/05/15.
 */
public class FiatFactory implements IFabricaDeCarros {
    @Override
    public CarroSedan createCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular createCarroPopular() {
        return new PalioHatch();
    }
}
