package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="airlines")
public class Airlines {
	@Id
	private int id;
	@Column(name="flights")
	private String airline;
	@Column(name="price")
	private double price;

	public Airlines() {
		super();
	}
	public Airlines(int id, String airline, double price) {
		super();
		this.id = id;
		this.airline = airline;
		this.price = price;
	}
	 @OneToMany(cascade = CascadeType.ALL)
	    @JoinTable(
	            name = "master_table",
	            joinColumns = @JoinColumn(name = "id"),
	            inverseJoinColumns = @JoinColumn(name = "flight_id")
	    )
	private List<Flights> flights;


	public List<Flights> getFlights() {
		return flights;
	}
	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
