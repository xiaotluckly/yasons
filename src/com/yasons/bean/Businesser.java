package com.yasons.bean;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_businesser")
public class Businesser {
	private long id;
	
	private String unionpayNum;
	
	private User user;
	
	private Set<Store> stores;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUnionpayNum() {
		return unionpayNum;
	}

	public void setUnionpayNum(String unionpayNum) {
		this.unionpayNum = unionpayNum;
	}

	@OneToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(mappedBy="bussinesser")
	public Set<Store> getStores() {
		return stores;
	}

	public void setStores(Set<Store> stores) {
		this.stores = stores;
	}
	
	
	
}
