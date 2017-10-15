package edu.smvc.bs;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	private static final String[] countries = { "Turkey", "USA", "Germany" };

	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello Reader!");
		mv.setViewName("helloMV");						//View (helloMV.jsp)
		return mv;
	}

	// TP <mvc:form modelAttribute/path>
	@RequestMapping(value = "/form")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView("userForm", "user", new User());
		modelAndView.addObject("genders", Gender.values());
		modelAndView.addObject("countries", countries);
		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processUser(User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userResult");
		modelAndView.addObject("u", user);
		return modelAndView;
	}

	//TP +Validation
	@RequestMapping(value = "/form2")
	public ModelAndView user2() {
			return new ModelAndView("user2Form", "user2", new User2());
	}
	@RequestMapping(value = "/result2")
	public ModelAndView processUser2(@Valid User2 user2, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("u", user2);
		if (result.hasErrors()) {
			modelAndView.setViewName("user2Form");
		} else {
			modelAndView.setViewName("user2Result");
		}
		return modelAndView;
	}
	
	// BG GET/POST (@ModelAttriubute) <form:form modelAttribute/path>	
	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public String getAddNewAccountForm(Model model) {
		//Product newProduct = new Product();
		Account newAccount = new Account();
		model.addAttribute("newAccount", newAccount);
		return "addAccount";
	}

	@RequestMapping(value = "/accounts", method = RequestMethod.POST)
	public String processAddNewAccountForm(@ModelAttribute("newAccount") Account accountToBeAdded) {
		accountService.addAccount(accountToBeAdded);
		//productService.addProduct(productToBeAdded);
		//return "redirect:/market/products";
		return "redirect:/accounts";
	}
	 
}
