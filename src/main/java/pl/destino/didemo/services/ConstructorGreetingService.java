
package pl.destino.didemo.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Destino
 */
@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from Constructor Greeting Service";
    }
    
}
