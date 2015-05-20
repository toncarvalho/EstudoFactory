package factoryMethodTests;

import estudo.abstractFactory.*;
import org.junit.Test;

/**
 * Created by ton on 20/05/15.
 */
public class abstractFactoryTest {

    @Test
    public void testClientFactory() {
        FabricaDeCarros fabrica = new FiatFactory();
        CarroSedan sedan = fabrica.createCarroSedan();
        CarroPopular popular = fabrica.createCarroPopular();
        sedan.exibeInfoSedan();
        System.out.println();
        popular.exibeInfoPopular();
        System.out.println();

        fabrica = new WolksVagemFactory();
        sedan = fabrica.createCarroSedan();
        popular = fabrica.createCarroPopular();
        sedan.exibeInfoSedan();
        System.out.println();
        popular.exibeInfoPopular();
    }
}
