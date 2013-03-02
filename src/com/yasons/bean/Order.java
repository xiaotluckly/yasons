package com.yasons.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.yasons.bean.type.OrderState;

@Entity
@Table(name = "t_order")
public class Order {
	private long id;
	
	private String remark;
	
	private Date createDate;
	
	private Date deliverDate;
	
	private OrderState state;
	
	private User user;
	
	private Store store;
	
	private Set<OrderItem> OrderItems=new HashSet<OrderItem>();

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	@OneToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(mappedBy=("order"))
	public Set<OrderItem> getOrderItems() {
		return OrderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		OrderItems = orderItems;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 2)
	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	@ManyToOne
	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	

}
