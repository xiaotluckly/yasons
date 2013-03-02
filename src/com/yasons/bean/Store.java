package com.yasons.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_store")
public class Store {
	private long id;
	
	private String name;
	
	private String address;
	
	private String phoneNum;
	
	private String logo;
	
	private String intro;
	
	private Businesser bussinesser;
	
	private Set<Goods> goods=new HashSet<Goods>();;
	
	private Set<Order> orders=new HashSet<Order>();;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	
	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@ManyToOne
	public Businesser getBussinesser() {
		return bussinesser;
	}

	public void setBussinesser(Businesser bussinesser) {
		this.bussinesser = bussinesser;
	}

	@OneToMany(mappedBy=("store"))
	public Set<Goods> getGoods() {
		return goods;
	}

	public void setGoods(Set<Goods> goods) {
		this.goods = goods;
	}

	@OneToMany(mappedBy=("store"))
	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
}
