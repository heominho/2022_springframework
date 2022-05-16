package com.inhatc.domain;

public class MenuVO {
	private int menuid;
	private String menukind;
	private String menuname;
	private int price;
	
	public String getMenukind() {
		return menukind;
	}
	@Override
	public String toString() {
		return "MenuVo [menuid=" + menuid + ", menukind=" + menukind + ", menuname=" + menuname + ", price=" + price
				+ "]";
	}
	public void setMenukind(String menukind) {
		this.menukind = menukind;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	
}
