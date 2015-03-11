package com.toast.guestbook.vo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Post {
	int id;
	String email;
	String password;
	String content;
	String attachmentPath;
	
	public int getId() {
		return id;
	}
	
	public Post setId(int id) {
		this.id = id;
		return this;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Post setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Post setPassword(String password) {
		this.password = password;
		return this;
	}
	
	public String getContent() {
		return content;
	}
	
	public Post setContent(String content) {
		this.content = content;
		return this;
	}
	
	public String getAttachmentPath() {
		return attachmentPath;
	}
	
	public Post setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
		return this;
	}
	
	public boolean isValidEmail() {
		String regex = "[a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
}
