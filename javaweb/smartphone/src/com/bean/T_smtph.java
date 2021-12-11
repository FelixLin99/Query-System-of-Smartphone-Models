package com.bean;

public class T_smtph {
	private int id;
	  private String name;
	  private String brand;
	  private String price;
	  private String battery;
	  private String release_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public T_smtph(int id, String name, String brand, String price, String battery, String release_date) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.battery = battery;
		this.release_date = release_date;
	}
	public T_smtph(String name, String brand, String price, String battery, String release_date) {
		super(); 
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.battery = battery;
		this.release_date = release_date;
	}
	public T_smtph() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "T_smtph [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", battery=" + battery
				+ ", release_date=" + release_date + "]";
	} 
	  
	  
}
