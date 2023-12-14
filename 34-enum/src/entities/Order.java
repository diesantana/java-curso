package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;
	private String dateString;
	
	public Order() {
	}
	
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Order(Integer id, String dateString, OrderStatus status) {
		this.id = id;
		this.setDateString(dateString);
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	

	@Override
	public String toString() {
		if(getDateString() == null) {
			return "Order [id = " + id + ", moment = " + moment + ", status = " + status + "]";			
		}else {
			return "Order [id = " + id + ", moment = " + getDateString() + ", status = " + status + "]";
		}
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
}
