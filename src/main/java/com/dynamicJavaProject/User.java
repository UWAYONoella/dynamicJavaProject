package com.dynamicJavaProject;

public class User {
 String name, email, username,typuser,pswd;

public User() {
	super();
}

public User(String name, String email, String username, String typuser, String pswd) {
	super();
	this.name = name;
	this.email = email;
	this.username = username;
	this.typuser = typuser;
	this.pswd = pswd;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getTypuser() {
	return typuser;
}

public void setTypuser(String typuser) {
	this.typuser = typuser;
}

public String getPswd() {
	return pswd;
}

public void setPswd(String pswd) {
	this.pswd = pswd;
}
}
