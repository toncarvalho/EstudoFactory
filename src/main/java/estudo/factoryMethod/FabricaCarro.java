package estudo.factoryMethod;

/**
 * Created by ton on 18/05/15.
 * <p/>
 * Fabrica Estática
 */
public class FabricaCarro {

    public static AbstractCarro criarCarro(ModelosCarro modeloCarro) {

        switch (modeloCarro) {
            case Celta: {

                return new Celta();
            }
            case Fiesta: {
                return new Fiesta();
            }
            case Gol: {
                return new Gol();
            }
            case Palio: {
                return new Palio();
            }
            default: {
                return null;
            }
        }

    }
}
