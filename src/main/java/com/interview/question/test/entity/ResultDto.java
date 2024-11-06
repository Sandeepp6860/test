package com.interview.question.test.entity;

public class ResultDto {
	
	private int id;
	private double lat;
	private double lng;
	private String name;
	
	
	
	public ResultDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ResultDto(int id, double lat, double lng,String name) {
		super();
		this.id = id;
		this.lat = lat;
		this.lng = lng;
		this.name=name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getLat() {
		return lat;
	}



	public void setLat(double lat) {
		this.lat = lat;
	}



	public double getLng() {
		return lng;
	}



	public void setLng(double lng) {
		this.lng = lng;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return " id=" + id + ", lat=" + lat + ", lng=" + lng + ", name=" + name ;
	}
	
	
	
	

}
