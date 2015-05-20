package estudo.abstractFactory;

/**
 * Created by ton on 20/05/15.
 */
public class WolksVagemFactory implements FabricaDeCarros {
    @Override
    public CarroSedan createCarroSedan() {
        return new Jeta();
    }

    @Override
    public CarroPopular createCarroPopular() {
        return  new GolHatch();
    }
}
