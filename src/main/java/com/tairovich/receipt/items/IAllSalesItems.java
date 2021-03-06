package com.tairovich.receipt.items;

public interface IAllSalesItems {

	public final static double DUTY_Tax = 0.05;
	public double getDutyTaxedCost();
	public double getAllCalculatedCost();
	public String getName();
	public double getPrice();
	public boolean isImported();
}
