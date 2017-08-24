package pl.destino.didemo.controllers;

import pl.destino.didemo.services.GreetingServiceImpl;

/**
 *
 * Demonstrate how DI works from inside. A case study of everything not to do.
 *
 * @author Destino
 */
public class PropertyInjectedController  {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }



}
