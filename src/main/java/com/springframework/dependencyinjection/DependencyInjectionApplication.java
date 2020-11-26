package com.springframework.dependencyinjection;

import com.springframework.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext cxt=SpringApplication.run(DependencyInjectionApplication.class, args);
		I18nController controller=(I18nController) cxt.getBean("i18nController");
		System.out.println("---PROFILE---");
		System.out.println(controller.sayHello());
		PrimaryBeanController primaryBeanController =(PrimaryBeanController) cxt.getBean("primaryBeanController");
		System.out.println("----PRIMARY BEAN----");
		System.out.println(primaryBeanController.sayHello());

		System.out.println("----Property----");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) cxt.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----Setter----");
		SetterController setterController=(SetterController) cxt.getBean("setterController");
		System.out.println(setterController.getGreeting());

		System.out.println("----Constructor----");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) cxt.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());



	}

}
