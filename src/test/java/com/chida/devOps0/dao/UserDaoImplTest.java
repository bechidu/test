package com.chida.devOps0.dao;

import org.junit.Test;
import static org.junit.Assert.*;

import com.chida.devOps0.model.Login;
import com.chida.devOps0.model.User;

public class UserDaoImplTest {
	
	UserDaoImpl userDao = new UserDaoImpl();
	
	@Test
	public void testRegister(){
		assertEquals("success", userDao.register(getUser()));
	}
	
	@Test
	public void testValidate(){
		assertEquals(getUser().getUsername(), userDao.validateUser(getLogin()).getUsername());
	}
	
	private User getUser(){
		User user = new User();
		user.setFirstname("Chida");
		user.setLastname("Puttaswamy");
		user.setEmail("chida@wipro.com");
		user.setPhone(1234567890);
		user.setUsername("ch310445");
		user.setPassword("chida");
		return user;
	}
	
	private Login getLogin(){
		Login login = new Login();
		login.setPassword("chida");
		login.setUsername("ch310445");
		return login;
	}

}
