package pl.destino.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.destino.didemo.services.GreetingServiceImpl;

/**
 *
 * Demonstrate how DI works from inside. A case study of everything not to do.
 *
 * @author Destino
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
