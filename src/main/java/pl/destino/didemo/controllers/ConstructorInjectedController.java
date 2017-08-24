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
 * @author Destino
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    
    String sayHello() {
        return greetingService.sayGreeting();
    }

}
