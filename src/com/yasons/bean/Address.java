package com.yasons.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_address")
public class Address {

	private long id;

	private String address;

	private int city;

	private int province;

	private boolean isAddrDefault;

	private User user;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	@Column(nullable = false)
	public boolean isAddrDefault() {
		return isAddrDefault;
	}
	
	public void setAddrDefault(boolean isAddrDefault) {
		this.isAddrDefault = isAddrDefault;
	}
	
	@ManyToOne
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", id=" + id
				+ ", isAddrDefault=" + isAddrDefault + ", province=" + province
				+ ", user=" + user + "]";
	}


}
