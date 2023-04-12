package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer1 {

	
	@Id	
	private int cid;
	private String cname;
	private String mobileno;
	private String pname;
	private double price;
	private int qty;
	private double total;
	private double discount;
	private double gstamt;
	private double invoicebill;
	public Customer1() {
		super();
	}
	public Customer1(int cid, String cname, String mobileno, String pname, double price, int qty, double total,
			double discount, double gstamt, double invoicebill) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobileno = mobileno;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.total = total;
		this.discount = discount;
		this.gstamt = gstamt;
		this.invoicebill = invoicebill;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGstamt() {
		return gstamt;
	}
	public void setGstamt(double gstamt) {
		this.gstamt = gstamt;
	}
	public double getInvoicebill() {
		return invoicebill;
	}
	public void setInvoicebill(double invoicebill) {
		this.invoicebill = invoicebill;
	}
	@Override
	public String toString() {
		return "Customer1 [cid=" + cid + ", cname=" + cname + ", mobileno=" + mobileno + ", pname=" + pname + ", price="
				+ price + ", qty=" + qty + ", total=" + total + ", discount=" + discount + ", gstamt=" + gstamt
				+ ", invoicebill=" + invoicebill + "]";
	}
	
}
