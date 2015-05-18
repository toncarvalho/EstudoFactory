package factoryMethodTests;

import estudo.factoryMethod.AbstractCarro;
import estudo.factoryMethod.FabricaCarro;
import estudo.factoryMethod.ModelosCarro;
import org.junit.Test;

/**
 * Created by ton on 18/05/15.
 * Esta implementação já corresponde a uma implementação do Factory Method, pois um método fábrica cria Objetos concretos que só serão definidos em tempo de execução. No entanto, esta implementação traz um problema quanto a manutenibilidade do código, pois, como utilizamos um switch para definir qual objeto criar, a cada criação de um novo modelo de carro precisaríamos incrementar este switch e criar novas enumerações. Como resolver este problema?
 */
public class factoryMethodTest {

    @Test
    public void testFactory() {


        AbstractCarro carro = FabricaCarro.criarCarro(ModelosCarro.Celta);
        carro.exibeDetalhes();


        AbstractCarro c2 = FabricaCarro.criarCarro(ModelosCarro.Fiesta);
        c2.exibeDetalhes();

        AbstractCarro c3 = FabricaCarro.criarCarro(ModelosCarro.Gol);
        c3.exibeDetalhes();

        AbstractCarro c4 = FabricaCarro.criarCarro(ModelosCarro.Palio);
        c4.exibeDetalhes();


    }


}
