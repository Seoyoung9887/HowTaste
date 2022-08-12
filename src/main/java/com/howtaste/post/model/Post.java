package com.howtaste.post.model;

import java.util.Date;

public class Post {
	private int id;
	private int userId;
	private String name;
	private String address;
	private String number;
	private String kind;
	private String price;
	private String park;
	private String businessHours;
	private String lastOder;
	private String closingDay;
	private String delegateMenu;
	private String coordinate;
	private Date createdAt;
	private Date updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPark() {
		return park;
	}
	public void setPark(String park) {
		this.park = park;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getLastOder() {
		return lastOder;
	}
	public void setLastOder(String lastOder) {
		this.lastOder = lastOder;
	}
	public String getClosingDay() {
		return closingDay;
	}
	public void setClosingDay(String closingDay) {
		this.closingDay = closingDay;
	}
	public String getDelegateMenu() {
		return delegateMenu;
	}
	public void setDelegateMenu(String delegateMenu) {
		this.delegateMenu = delegateMenu;
	}
	public String getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}
