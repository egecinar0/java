package entities.concretes;

import entities.abstracts.Entities;

public class User implements Entities{
	String name;
	String eMail;
	String password;
	public User(String name, String eMail, String password) {
		super();
		this.name = name;
		this.eMail = eMail;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
