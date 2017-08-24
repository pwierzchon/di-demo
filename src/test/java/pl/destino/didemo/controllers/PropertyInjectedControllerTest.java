package pl.destino.didemo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.destino.didemo.services.GreetingServiceImpl;

/**
 *
 * @author Destino
 */
public class PropertyInjectedControllerTest {
    
    private PropertyInjectedController propertyInjectedController;
    
    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }
    
    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());
    }
    
}
