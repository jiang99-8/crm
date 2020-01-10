package com.neusoft.crm.entity;

public class LastClientOrders {
	private String clientCode;
	private int ordersId;
	private String ordersDate;
	private int ordersState;
	private int ordersTotal;
	private String remark;
	
	public String getClientCode() {
		return clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	public int getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}
	public String getOrdersDate() {
		return ordersDate;
	}
	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}
	public int getOrdersState() {
		return ordersState;
	}
	public void setOrdersState(int ordersState) {
		this.ordersState = ordersState;
	}
	public int getOrdersTotal() {
		return ordersTotal;
	}
	public void setOrdersTotal(int ordersTotal) {
		this.ordersTotal = ordersTotal;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
