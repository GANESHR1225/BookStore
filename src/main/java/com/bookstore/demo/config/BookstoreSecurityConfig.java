package com.bookstore.demo.config;

import javax.annotation.security.PermitAll;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bookstore.demo.service.impl.CustomerModelServiceImpl;

@SuppressWarnings("deprecation")
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
		return new CustomerModelServiceImpl();
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
		System.out.println("111" + authProvider);
		return authProvider;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		/*
		 * loggin page is coming
		 * http.csrf().disable().cors().disable().authorizeHttpRequests().antMatchers(
		 * "/actuator/**" , "/admin/login").permitAll().anyRequest()
		 * .authenticated().and().formLogin().loginPage("/login").permitAll().and() .
		 * logout().permitAll();
		 */

		http.csrf().disable().cors().disable().authorizeHttpRequests().antMatchers("/actuator/**", "/login", "/h2","/customer/**").permitAll()
				.anyRequest().authenticated().and().formLogin().loginPage("/customer/login")
				.usernameParameter("username").passwordParameter("password").loginProcessingUrl("/customer/login").successForwardUrl("/cust/home/**")
				.permitAll().and().logout().logoutSuccessUrl("/login").permitAll().deleteCookies("JSESSIONID").invalidateHttpSession(true);//loginProcessingUrl("/customer/login")
	}

}
