package com.yasons.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.yasons.bean.type.Gender;

@Entity
@Table(name="t_user")
public class User {

	private long id;
	
	private String phoneNum;
	
	private String password;
	
	private String username;
	
	private String email;
	
	private Gender sex;
	
	private boolean isBusinesser;
	
	private String location;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(name="sex",length = 2)
	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}

	public boolean isBusinesser() {
		return isBusinesser;
	}

	public void setBusinesser(boolean isBusinesser) {
		this.isBusinesser = isBusinesser;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", id=" + id + ", isBusinesser="
				+ isBusinesser + ", location=" + location + ", password="
				+ password + ", phoneNum=" + phoneNum + ", sex=" + sex
				+ ", username=" + username + "]";
	}

	
	
}
