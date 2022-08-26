package com.bookstore.demo.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bookstore.demo.entity.Customer;
import com.bookstore.demo.service.CustomerService;

@Component
public class CustomerValidator implements Validator {

	@Autowired
	private CustomerService customerservice;

	@Override
	public boolean supports(Class<?> aClass) {
		return Customer.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		Customer customer = (Customer) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if (customer.getusername().length() < 4 || customer.getusername().length() > 32) {
			errors.rejectValue("username", "Size.userForm.username");
		}
		if (customerservice.findByUsername(customer.getusername()) != null) {
			errors.rejectValue("username", "Duplicate.userForm.username");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (customer.getpassword().length() < 4 || customer.getpassword().length() > 32) {
			errors.rejectValue("password", "Size.userForm.password");
		}

	}
}
