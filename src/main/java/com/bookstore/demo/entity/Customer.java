package com.bookstore.demo.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length = 20)
	private String firstname;
	@Column(nullable = false, length = 20)
	private String lastname;
	private String city;
	private String email;
	private String dob;
	@Column(nullable = false, length = 64)
	private String password;
	@Column(nullable = false, unique = true, length = 32)
	private String username;

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city
				+ ", email=" + email + ", dob=" + dob + ", password=" + password + ", username=" + username + "]";
	}

	public Customer(int id, String firstname, String lastname, String city, String email, String dob, String password,
			String username) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.email = email;
		this.dob = dob;
		this.password = password;
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	/*
	 * @Override public Collection<? extends GrantedAuthority> getAuthorities() { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * @Override public String getPassword() { // TODO Auto-generated method stub
	 * return password; }
	 * 
	 * @Override public String getUsername() { // TODO Auto-generated method stub
	 * return username; }
	 * 
	 * @Override public boolean isAccountNonExpired() { // TODO Auto-generated
	 * method stub return true; }
	 * 
	 * @Override public boolean isAccountNonLocked() { // TODO Auto-generated method
	 * stub return true; }
	 * 
	 * @Override public boolean isCredentialsNonExpired() { // TODO Auto-generated
	 * method stub return true; }
	 * 
	 * @Override public boolean isEnabled() { // TODO Auto-generated method stub
	 * return true; }
	 */

}
