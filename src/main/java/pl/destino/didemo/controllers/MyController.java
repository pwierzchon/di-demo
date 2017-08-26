package pl.destino.didemo.controllers;

import org.springframework.stereotype.Controller;
import pl.destino.didemo.services.GreetingService;

/**
 *
 * @author Destino
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        return greetingService.sayGreeting();
    }

}
