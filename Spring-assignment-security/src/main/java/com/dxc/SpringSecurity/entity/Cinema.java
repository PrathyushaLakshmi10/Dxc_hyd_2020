package com.dxc.SpringSecurity.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cinemainfo")
public class Cinema
{
	@Column(name = "CinemaId")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer cinema_id;
	@Column(name = "CinemaName", nullable = true, length = 255)
	private String cinema_name;
	
	@Column(name = "CinemaRating", nullable = true, length = 255)
	private String cinema_rating;

	@Column(name = "CinemaCategory", nullable = true, length = 255)
	private String cinema_category;

	@Column(name = "CinemaType", nullable = true, length = 255)
	private String cinema_type;
	
	@Column(name = "CinemaDuration",columnDefinition="Decimal(5,2) ")
	private double cinema_duration;
	
	
	
	public Cinema() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cinema(Integer cinema_id, String cinema_name, String cinema_rating, String cinema_category,
			String cinema_type, double cinema_duration) {
		super();
		this.cinema_id = cinema_id;
		this.cinema_name = cinema_name;
		this.cinema_rating = cinema_rating;
		this.cinema_category = cinema_category;
		this.cinema_type = cinema_type;
		this.cinema_duration = cinema_duration;
	}



	public Integer getCinema_id() {
		return cinema_id;
	}



	public void setCinema_id(Integer cinema_id) {
		this.cinema_id = cinema_id;
	}



	public String getCinema_name() {
		return cinema_name;
	}



	public void setCinema_name(String cinema_name) {
		this.cinema_name = cinema_name;
	}



	public String getCinema_rating() {
		return cinema_rating;
	}



	public void setCinema_rating(String cinema_rating) {
		this.cinema_rating = cinema_rating;
	}



	public String getCinema_category() {
		return cinema_category;
	}



	public void setCinema_category(String cinema_category) {
		this.cinema_category = cinema_category;
	}



	public String getCinema_type() {
		return cinema_type;
	}



	public void setCinema_type(String cinema_type) {
		this.cinema_type = cinema_type;
	}

	public double getCinema_duration() {
		return cinema_duration;
	}

	public void setCinema_duration(double cinema_duration) {
		this.cinema_duration = cinema_duration;
	}



	public String toString() {
		return "Cinema\n{\ncinema_id: " + cinema_id + "\ncinema_name: " + cinema_name + "\ncinema_rating: " + cinema_rating +
				"\ncinema_category: " + cinema_category + "\ncinema_type: "+ cinema_type+"\ncinema_duration: "+
				cinema_duration+ "\n}";
	}
}
