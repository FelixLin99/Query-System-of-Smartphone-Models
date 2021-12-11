package com.bean;

public class T_user {
	private int id;
	  private String username;
	  private String password;
	  private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public T_user(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public T_user() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "T_user [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	} 
	  
}
