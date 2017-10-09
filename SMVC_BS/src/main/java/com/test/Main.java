package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.smvc.bs.AccountService;
import edu.smvc.bs.HelloWorld;
import org.apache.log4j.Logger;

public class Main {
	static Logger log = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		/*ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("/com/wiley/beginningspring/ch2/ch2-beans.xml");*/

		AbstractApplicationContext applicationContext =
				new ClassPathXmlApplicationContext(new String[] {"ch2-beans.xml"});
		
		//https://www.tutorialspoint.com/spring/spring_quick_guide.htm
		//TP S. test 1 (Context main-testing)
		log.info("-----Going to create HelloWorld Obj.");
		HelloWorld obj_1 = (HelloWorld) applicationContext.getBean("helloWorld");
		obj_1.getMessage();
		
		//TP S. test 2 (The singleton/prototype scope main-testing)
		obj_1.setMessage("Spring object #1");
		obj_1.getMessage();		//same object (#1)
		
		HelloWorld obj_2 = (HelloWorld) applicationContext.getBean("helloWorld");
		obj_2.getMessage();
		
		//TP S. test 3 (The Bean lifecycle main-testing)
		applicationContext.registerShutdownHook();
		
		
		//BS, TP SMVC test 1
		applicationContext.getEnvironment().setActiveProfiles("Development");

		AccountService accountService = 
				applicationContext.getBean("accountService", AccountService.class);

		System.out.println("\n*********************Spring MVC main-Testing***************");
		for(Long L : accountService.getMap().keySet()) {
			System.out.println("Account " + L + ": " + accountService.getAccount(L).getId() +
					" balance: " + accountService.getAccount(L).getBalance() +
					" " + accountService.getAccount(L).getOwnerName());
		}

		System.out.println("\n");
		System.out.println("Before money transfer");
		System.out.println("Account 1: " + accountService.getAccount(1).getId() +
				" balance :" + accountService.getAccount(1).getBalance() +
				" " + accountService.getAccount(1).getOwnerName());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());		
		
		accountService.transferMoney(1, 2, 5.0);
		
		System.out.println("After money transfer");
		System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
		System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
		
		System.out.println("\n");
		log.info("-----Exititng the program.");
	}

}

/*
1)Java An. Based Config
2)


)JDBCTemplate
	NQ
	PS
	CRUD
	SP, SF
	BO
)JPA
 */