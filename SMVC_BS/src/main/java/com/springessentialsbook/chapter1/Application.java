package com.springessentialsbook.chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springessentialsbook.chapter1.service.GreetingService;

import edu.smvc.bs.AccountService;

import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"application-context.xml"});

		System.out.println("\n***Added from Spring Essentials");
		GreetingService greeter = (GreetingService) context.getBean("Greeter");
		greeter.greet("I am your first Spring bean instance, configured purely with XML metadata. I am resolved by name.");
		
		GreetingService greeter2 = (GreetingService) context.getBean(GreetingService.class);
		greeter2.greet("I am your first Spring bean instance, configured purely with XML metadata. I am resolved by type.");
		
		System.out.println("The two instances are" + ((greeter == greeter2) ? " "
				+ "same as it's a singleton!" : " not same as it's a prototype!"));
		
		//Added from Beginning Spring
		System.out.println("\n***Added from Beginning Spring");
		AccountService accountService = context.getBean("accountService", AccountService.class);

		System.out.println("Before money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());		
		
		accountService.transferMoney(1, 2, 5.0);
		
		System.out.println("After money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());

		//Collections
		//Arrays.
	}
}
