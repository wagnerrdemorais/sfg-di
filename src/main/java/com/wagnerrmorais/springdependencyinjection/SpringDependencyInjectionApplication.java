package com.wagnerrmorais.springdependencyinjection;

import com.wagnerrmorais.springdependencyinjection.controllers.ConstructorInjectedController;
import com.wagnerrmorais.springdependencyinjection.controllers.MyController;
import com.wagnerrmorais.springdependencyinjection.controllers.SetterInjectedController;
import com.wagnerrmorais.springdependencyinjection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class,args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----- Primary -----");

		System.out.println(myController.sayHi());

		System.out.println("----- Property -----");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter -----");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor -----");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
