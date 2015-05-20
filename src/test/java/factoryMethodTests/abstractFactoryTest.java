package factoryMethodTests;

import estudo.abstractFactory.CarFactoryes;
import estudo.abstractFactory.CarroPopular;
import estudo.abstractFactory.CarroSedan;
import estudo.abstractFactory.FabricaDeCarros;
import org.junit.Test;

/**
 * Created by ton on 20/05/15.
 */
public class abstractFactoryTest {

    @Test
    public void testClientFactory() {

        /*IFabricaDeCarros fabrica = new FiatFactory();
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
        popular.exibeInfoPopular();*/


        // utilizando um getFactory, mais bacana.. encapsulando a instanciação das fabricas.
        CarroSedan novoSedanFiat = FabricaDeCarros.getFactory(CarFactoryes.Fiat).createCarroSedan();
        novoSedanFiat.exibeInfoSedan();

        CarroSedan novoSedanWolks = FabricaDeCarros.getFactory(CarFactoryes.WolksVagem).createCarroSedan();
        novoSedanWolks.exibeInfoSedan();


        CarroPopular novoPopularFiat = FabricaDeCarros.getFactory(CarFactoryes.Fiat).createCarroPopular();
        novoPopularFiat.exibeInfoPopular();

        CarroPopular novoPopularWolks = FabricaDeCarros.getFactory(CarFactoryes.WolksVagem).createCarroPopular();
        novoPopularWolks.exibeInfoPopular();


    }
}


