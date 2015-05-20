package estudo.abstractFactory;

/**
 * Created by ton on 20/05/15.
 */
public class FabricaDeCarros {


    public static IFabricaDeCarros getFactory(CarFactoryes factoryes) {

        switch (factoryes) {
            case Fiat: {
                return new FiatFactory();
            }
            case WolksVagem: {
                return new WolksVagemFactory();
            }
            default: {
                return null;
            }
        }

    }
}
