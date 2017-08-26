package pl.destino.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.destino.didemo.services.GreetingService;
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
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }

}
