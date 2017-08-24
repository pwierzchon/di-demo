package pl.destino.didemo.controllers;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import pl.destino.didemo.services.GreetingServiceImpl;

/**
 *
 * @author Destino
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}
