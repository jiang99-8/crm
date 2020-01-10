package com.neusoft.crm.entity;

public class SalePlan {
	private int planId;
	private int planChcId;
	private String planTodo;
	private String planResult;
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getPlanChcId() {
		return planChcId;
	}
	public void setPlanChcId(int planChcId) {
		this.planChcId = planChcId;
	}
	public String getPlanTodo() {
		return planTodo;
	}
	public void setPlanTodo(String planTodo) {
		this.planTodo = planTodo;
	}
	public String getPlanResult() {
		return planResult;
	}
	public void setPlanResult(String planResult) {
		this.planResult = planResult;
	}

}
