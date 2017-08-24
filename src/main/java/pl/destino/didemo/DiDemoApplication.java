package pl.destino.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.destino.didemo.controllers.ConstructorInjectedController;
import pl.destino.didemo.controllers.GetterInjectedController;
import pl.destino.didemo.controllers.MyController;
import pl.destino.didemo.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
            ConfigurableApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
            
            MyController myController = (MyController) ctx.getBean("myController");
            myController.hello();
            System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
            System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
            System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
