package edu.smvc.bs;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Email;

public class User2 {

	@Size(min=3, max=20)
	private String username;
	
	@Email
	private String email;
	
	@CreditCardNumber
	private String ccNumber;
	
	@Pattern(regexp = "^[a-zA-Z]\\w{3,14}$", message = "first character must be a letter "
			+ "and it must contain at least 4 characters and no more than 15 characters")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
