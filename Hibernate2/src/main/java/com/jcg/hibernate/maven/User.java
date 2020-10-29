package com.jcg.hibernate.maven;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "my_sequence")    
	@TableGenerator(
	  name = "my_sequence",
	  table = "id_gen",
	  pkColumnName = "gen_name",
	  valueColumnName = "gen_val",
	  initialValue = 1000,
	  allocationSize = 10)
	private int user_id;

	private String user_name;

	private String created_by;

	private Date created_date;
	
	private int user_salary;
	@Embedded
	@AttributeOverrides({
		  @AttributeOverride( name = "street", column = @Column(name = "HOME_STREET")),
		  @AttributeOverride( name = "city", column = @Column(name = "HOME_CITY")),
		  @AttributeOverride( name = "state", column = @Column(name = "HOME_STATE")),
		  @AttributeOverride( name = "zip", column = @Column(name = "HOME_ZIP"))
		})
	private Address homeAddress;
	
	@AttributeOverrides({
		  @AttributeOverride( name = "street", column = @Column(name = "OFFICE_STREET")),
		  @AttributeOverride( name = "city", column = @Column(name = "OFFICE_CITY")),
		  @AttributeOverride( name = "state", column = @Column(name = "OFFICE_STATE")),
		  @AttributeOverride( name = "zip", column = @Column(name = "OFFICE_ZIP"))
		})
	
	@Embedded
	private Address officeAddress;
	
	
	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getUser_salary() {
		return user_salary;
	}

	public void setUser_salary(int user_salary) {
		this.user_salary = user_salary;
	}
	
	

	
}