package pl.destino.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.destino.didemo.controllers.ConstructorInjectedController;
import pl.destino.didemo.controllers.GetterInjectedController;
import pl.destino.didemo.controllers.MyController;
import pl.destino.didemo.controllers.PropertyInjectedController;
import pl.destino.didemo.examplebeans.FakeDataSource;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        
        System.out.println(fakeDataSource.getUser());

    }
}
