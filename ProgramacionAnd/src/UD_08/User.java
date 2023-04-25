package UD_08;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 2888019250806468706L;
	
	private int id;
	private String user;
	private String pass;
	
	
	public User(int id, String user, String pass) {
		this.id = id;
		this.user = user;
		this.pass = pass;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", pass=" + pass + "]";
	}
	
	
	
	

}
