package estudo.abstractFactory;

/**
 * Created by ton on 20/05/15.
 */
public interface IFabricaDeCarros {

    CarroSedan createCarroSedan();
    CarroPopular createCarroPopular();

}
