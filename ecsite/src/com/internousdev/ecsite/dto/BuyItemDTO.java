package com.internousdev.ecsite.dto;

public class BuyItemDTO {

	private int id;
	private String ItemName;
	private String ItemPrice;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(String itemPrice) {
		ItemPrice = itemPrice;
	}
}
