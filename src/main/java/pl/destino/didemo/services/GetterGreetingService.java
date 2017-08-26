package pl.destino.didemo.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Destino
 */
@Service
public class GetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from Getter Greeting Service";
    }
    
    
}
