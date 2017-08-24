package pl.destino.didemo.services;

import org.springframework.stereotype.Service;

/**
 *
 * Demonstrate how DI works from inside.
 *
 * @author Destino
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello gurus!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }

}
