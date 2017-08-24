package pl.destino.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.destino.didemo.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
            ConfigurableApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
            
            MyController myController = (MyController) ctx.getBean("myController");
            myController.hello();
	}
}
