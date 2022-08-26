package com.bookstore.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.bookstore.demo.service.impl.CustomerServiceImpl;

import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity

public class BookstoreSecurityConfig extends WebSecurityConfigurerAdapter {

	/*
	 * @Bean public PasswordEncoder passwordEncoder() { BCryptPasswordEncoder
	 * bCryptPasswordEncoder = new BCryptPasswordEncoder(10); return
	 * bCryptPasswordEncoder;
	 * 
	 * }
	 */
	@Bean
	@Override
    public UserDetailsService userDetailsService() {
        return new CustomerServiceImpl();
    }
	     
	 
	 @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	@Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
         
        return authProvider;
    }

	
	  @Override protected void configure(HttpSecurity http) throws Exception {
			
			  http.csrf().disable().cors().disable().authorizeHttpRequests().antMatchers(
			  "/actuator/**","/customer/**").permitAll().anyRequest()
			  .authenticated().and().formLogin().loginPage("/index").permitAll().and()
			  . logout().permitAll();
			
	  }
	 

}
