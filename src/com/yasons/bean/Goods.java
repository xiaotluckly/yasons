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
@Table(name = "t_goods")
public class Goods {
	private long id;
	
	private String name;
	
	private String price;
	
	private String amount;
	
	private boolean isValid;
	
	private Store store;
	
	private Set<OrderItem> orderItems=new HashSet<OrderItem>();
	
	private Set<GoodsImage> goodsImages=new HashSet<GoodsImage>();;

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@ManyToOne
	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@OneToMany(mappedBy=("goods"))
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	@OneToMany(mappedBy=("goods"))
	public Set<GoodsImage> getGoodsImages() {
		return goodsImages;
	}

	public void setGoodsImages(Set<GoodsImage> goodsImages) {
		this.goodsImages = goodsImages;
	}
	
	
}
