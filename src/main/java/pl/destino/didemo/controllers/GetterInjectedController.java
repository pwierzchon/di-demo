/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.destino.didemo.controllers;

import pl.destino.didemo.services.GreetingService;
import pl.destino.didemo.services.GreetingServiceImpl;

/**
 *
 * Demonstrate how DI works from inside. A case study of everything not to do.
 *
 * @author Destino
 */
public class GetterInjectedController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

}
