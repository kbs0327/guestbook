package com.toast.guestbook.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@WebAppConfiguration
public class GuestBookControllerTest {
	
	@InjectMocks
	GuestBookController geustBookController;

	MockMvc mockMvc;
	
	private final String testEmail = "aaa@aaa.com";
	private final String testPassword = "aaa1234!";
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(geustBookController)
				.build();
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testPostWrongEmail() throws Exception {
		// When
		mockMvc.perform(
				post("/post")
				.param("inputEmail", "ddd")
				.param("inputPassword", "dddd"))
		// Then
				.andExpect(model().attribute("errorMsg", GuestBookController.EMAIL_ERROR_MSG))
				.andExpect(view().name("error"));
	}
	
	@Test
	public void testPostShortPassword() throws Exception {
		// When
		mockMvc.perform(
				post("/post")
				.param("inputEmail", testEmail)
				.param("inputPassword", "dddd"))
		// Then
				.andExpect(model().attribute("errorMsg", GuestBookController.PASSWORD_ERROR_MSG))
				.andExpect(view().name("error"));
	}
}
