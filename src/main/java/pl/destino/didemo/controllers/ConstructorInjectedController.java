/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.destino.didemo.controllers;

import org.springframework.stereotype.Controller;
import pl.destino.didemo.services.GreetingService;
import pl.destino.didemo.services.GreetingServiceImpl;

/**
 *
 * @author Destino
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    
    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
