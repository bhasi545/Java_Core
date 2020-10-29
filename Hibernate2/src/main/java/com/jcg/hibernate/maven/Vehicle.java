package com.jcg.hibernate.maven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	private int vehicleId;
	private String vehicleName;
	@ManyToOne
	private UserVehicle userVehicle;
			
	public UserVehicle getUserVehicle() {
		return userVehicle;
	}
	public void setUserVehicle(UserVehicle userVehicle) {
		this.userVehicle = userVehicle;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vehicleId, String vehicleName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}
